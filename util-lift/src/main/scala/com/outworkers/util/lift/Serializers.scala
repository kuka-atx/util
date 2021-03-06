/*
 * Copyright 2013 - 2017 Outworkers Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.outworkers.util.lift

import java.util.UUID

import net.liftweb.json.JsonAST.{JString, JValue}
import net.liftweb.json._
import org.joda.time.{DateTime, DateTimeZone}

import scala.reflect.ClassTag
import scala.util.{Failure, Success, Try}
import scala.util.control.NonFatal

sealed class UUIDSerializer extends Serializer[UUID] {
  private[this] val uuidClz = classOf[UUID]

  def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), UUID] = {
    case (TypeInfo(uuidClz, _), json) => json match {
      case JString(value) => try {
        UUID.fromString(value)
      }  catch {
        case NonFatal(err) => {
          val exception = new MappingException(s"Couldn't extract an UUID from $value")
          exception.initCause(err)
          throw exception
        }
      }
      case x => throw new MappingException("Can't convert " + x + " to UUID")
    }
  }

  def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
    case x: UUID => JString(x.toString)
  }
}

class EnumSerializer[E <: Enumeration: ClassTag](enum: E)
  extends Serializer[E#Value] {
  import JsonDSL._

  val EnumerationClass = classOf[E#Value]

  def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), E#Value] = {
    case (TypeInfo(EnumerationClass, _), json) => json match {
      case JInt(value) if value <= enum.maxId => enum(value.toInt)
      case value => throw new MappingException("Can't convert " + value + " to " +  EnumerationClass)
    }
  }

  def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
    case i: E#Value => i.id
  }
}

sealed class DateTimeSerializer extends Serializer[DateTime] {

  val DateTimeClass = classOf[DateTime]

  def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), DateTime] = {
    case (TypeInfo(DateTimeClass, _), json) => json match {
      case JString(value) =>
        Try {
          new DateTime(value.toLong, DateTimeZone.UTC)
        } match {
          case Success(dt) => dt
          case Failure(err) => {
            val exception =  new MappingException(s"Couldn't extract a DateTime from $value")
            exception.initCause(err)
            throw exception
          }
        }
      case JInt(value) => {
        Try(new DateTime(value.toLong, DateTimeZone.UTC)) match {
          case Success(dt) => dt
          case Failure(err) => {
            val exception =  new MappingException(s"Couldn't extract a DateTime from $value")
            exception.initCause(err)
            throw exception
          }
        }
      }
      case x => throw new MappingException("Can't convert " + x + " to DateTime")
    }
  }

  def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
    case x: DateTime => JInt(x.getMillis)
  }
}


class EnumNameSerializer[E <: Enumeration: ClassTag](enum: E)
  extends Serializer[E#Value] {
  import JsonDSL._

  val enumClz = classOf[E#Value]

  def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), E#Value] = {
    case (TypeInfo(`enumClz`, _), json) => json match {
      case JString(value) if enum.values.exists(_.toString == value) =>
        enum.withName(value)
      case value => throw new MappingException(s"Can't convert $value to $enumClz")
    }
  }

  def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
    case i: E#Value => i.toString
  }
}


object EnumNameSerializer {
  def apply[E <: Enumeration : ClassTag](enum: E): EnumNameSerializer[E] = {
    new EnumNameSerializer(enum)
  }
}

trait CustomSerializers {
  implicit val formats = Serialization.formats(NoTypeHints) + new UUIDSerializer + new DateTimeSerializer
}