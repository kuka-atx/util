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

import com.outworkers.util.domain.ApiError
import net.liftweb.http._
import net.liftweb.http.js.JsExp
import net.liftweb.http.provider.HTTPCookie
import net.liftweb.json.Extraction._
import net.liftweb.json.JsonAST
import net.liftweb.json.JsonAST.JValue

case class JsonErrorResponse(
  json: JsExp,
  headers: List[(String, String)],
  cookies: List[HTTPCookie] = Nil) {

    protected[this] val defaultErrorResponse = 400

    def toResponse: LiftResponse = {
      val bytes = json.toJsCmd.getBytes
      InMemoryResponse(
        bytes,
        ("Content-Length", bytes.length.toString) :: ("Content-Type", "application/json; charset=utf-8") :: headers,
        cookies,
        defaultErrorResponse
      )
    }

    JsonResponse
  }

object JsonErrorResponse {

  implicit val formats = net.liftweb.json.DefaultFormats

  def headers: List[(String, String)] = S.getResponseHeaders(Nil)
  def cookies: List[HTTPCookie] = S.responseCookies

  def apply(json: JsExp, code: Int): LiftResponse =
    JsonResponse(json, headers, cookies, code)

  def apply(msg: String, code: Int): LiftResponse = {
    val resp = ApiError.fromArgs(code, List(msg))
    JsonResponse(decompose(resp), code)
  }

  def apply(ex: Exception, code: Int): LiftResponse = {
    apply(ex.getMessage, code)
  }

  def apply(_json: JsonAST.JValue, _headers: List[(String, String)], _cookies: List[HTTPCookie], _code: Int): LiftResponse = {
    new JsonResponse(new JsExp {
      lazy val toJsCmd: String = jsonPrinter(JsonAST.render(_json))
    }, _headers, _cookies, _code)
  }

  lazy val jsonPrinter: scala.text.Document => String = LiftRules.jsonOutputConverter.vend
}
