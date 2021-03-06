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
import com.twitter.sbt.{GitProject, VersionManagement}
import sbt.Keys._

lazy val Versions = new {
  val scalatest = "3.0.1"
  val cats = "0.9.0"
  val joda = "2.9.7"
  val jodaConvert = "1.8.1"
  val lift = "3.0"
  val twitterUtil = "6.41.0"
  val twitterUtil210 = "6.34.0"
  val scalaz = "7.2.8"
  val scalacheck = "1.13.4"
  val datafactory = "0.8"
  val play = "2.6.0-M4"
  val shapeless = "2.3.2"
  val kindProjector = "0.9.3"
  val paradise = "2.1.0"
  val macroCompat = "1.1.1"

  val catsVersion: String => String = {
    s => CrossVersion.partialVersion(s) match {
      case Some((_, minor)) if minor >= 11 => cats
      case _ => twitterUtil210
    }
  }

  val twitterUtilVersion: String => String = {
    s => CrossVersion.partialVersion(s) match {
      case Some((_, minor)) if minor == 12 => twitterUtil
      case _ => twitterUtil210
    }
  }

  val playVersion: String => String = {
    s => CrossVersion.partialVersion(s) match {
      case Some((_, minor)) if minor >= 11 => play
      case _ => "2.4.8"
    }
  }

  val liftVersion: String => String = {
    s => CrossVersion.partialVersion(s) match {
      case Some((_, minor)) if minor >= 11 => lift
      case _ => "3.0-M1"
    }
  }
}

val sharedSettings: Seq[Def.Setting[_]] = Seq(
  organization := "com.outworkers",
  scalaVersion := "2.10.6",
  resolvers ++= Seq(
    "Twitter Repository" at "http://maven.twttr.com",
    Resolver.sonatypeRepo("releases"),
    Resolver.jcenterRepo
  ),
  gitTagName in ThisBuild := s"version=${scalaVersion.value}",
  scalacOptions ++= Seq(
    "-language:postfixOps",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:reflectiveCalls",
    "-deprecation",
    "-feature",
    "-unchecked"
  )
) ++ GitProject.gitSettings ++
  VersionManagement.newSettings ++
  Publishing.effectiveSettings

lazy val baseProjectList: Seq[ProjectReference] = Seq(
  domain,
  lift,
  liftCats,
  parsers,
  parsersCats,
  validatorsCats,
  validators,
  samplers,
  testing,
  testingTwitter,
  macros,
  tags
)

lazy val util = (project in file("."))
  .settings(sharedSettings: _*)
  .settings(
    name := "util",
    moduleName := "util"
  ).aggregate(
    baseProjectList ++ Publishing.jdk8Only(play): _*
  )

lazy val domain = (project in file("util-domain"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-domain",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1")
  )

lazy val parsers = (project in file("util-parsers"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-parsers",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    libraryDependencies ++= Seq(
      "commons-validator"       %  "commons-validator"              % "1.4.0",
      "joda-time"               %  "joda-time"                      % Versions.joda,
      "org.joda"                %  "joda-convert"                   % Versions.jodaConvert,
      "org.scalaz"              %% "scalaz-core"                    % Versions.scalaz,
      "org.scalatest"           %% "scalatest"                      % Versions.scalatest % Test
    )
  ).dependsOn(
    domain,
    testing % Test
  )

lazy val parsersCats = (project in file("util-parsers-cats"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-parsers-cats",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    libraryDependencies ++= Seq(
      "commons-validator"       %  "commons-validator"              % "1.4.0",
      "joda-time"               %  "joda-time"                      % Versions.joda,
      "org.joda"                %  "joda-convert"                   % Versions.jodaConvert,
      "org.typelevel"           %% "cats"                           % Versions.cats,
      "org.scalatest"           %% "scalatest"                      % Versions.scalatest % Test
    )
  ).dependsOn(
    domain,
    testing % Test
  )

lazy val tags = (project in file("util-tags"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-tags",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    scalacOptions ++= Seq(
      "-language:experimental.macros"
    ),
    libraryDependencies ++= Seq(
      "com.eaio.uuid" % "uuid" % "3.2",
      "org.typelevel" %% "macro-compat" % "1.1.1",
      "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided",
      compilerPlugin("org.scalamacros" % "paradise" % Versions.paradise cross CrossVersion.full),
      "org.scalatest" %% "scalatest" % Versions.scalatest % Test
    )
  ).dependsOn(
    domain,
    macros
  )

lazy val samplers = (project in file("util-samplers"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-samplers",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    scalacOptions ++= Seq(
      "-language:experimental.macros"
    ),
    libraryDependencies ++= Seq(
      "org.typelevel" %% "macro-compat" % Versions.macroCompat,
      "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided",
      compilerPlugin("org.scalamacros" % "paradise" % Versions.paradise cross CrossVersion.full),
      "org.scalatest" %% "scalatest" % Versions.scalatest % Test,
      "org.scalacheck" %% "scalacheck" % Versions.scalacheck
    )
  ).dependsOn(
    domain,
    macros
  )

lazy val testing = (project in file("util-testing"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-testing",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    scalacOptions ++= Seq(
      "-language:experimental.macros"
    ),
    libraryDependencies ++= Seq(
      "org.typelevel" %% "macro-compat" % Versions.macroCompat,
      "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided",
      compilerPlugin("org.scalamacros" % "paradise" % Versions.paradise cross CrossVersion.full),
      "org.scalatest" %% "scalatest" % Versions.scalatest,
      "joda-time" % "joda-time" % Versions.joda,
      "org.joda" % "joda-convert" % Versions.jodaConvert,
      "org.scalacheck" %% "scalacheck" % Versions.scalacheck
    )
  ).dependsOn(
    domain,
    tags,
    macros,
    samplers
  )

lazy val testingTwitter = (project in file("util-testing-twitter"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-testing-twitter",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % Versions.scalatest,
      "com.twitter" %% "util-core" % Versions.twitterUtilVersion(scalaVersion.value)
    )
  )

lazy val play = (project in file("util-play"))
  .settings(sharedSettings: _*)
  .settings(

    moduleName := "util-play",
    crossScalaVersions := Seq("2.10.6", "2.11.8"),
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-ws" % Versions.playVersion(scalaVersion.value)
    ),
    unmanagedSourceDirectories in Compile ++= Seq(
      (sourceDirectory in Compile).value / ("scala-2." + {
        CrossVersion.partialVersion(scalaBinaryVersion.value) match {
          case Some((major, minor)) if minor <= 11 => minor.toString
          case _ => "non-existing"
        }
      }))
  ).dependsOn(
  domain,
  parsersCats,
  testing % Test
)

lazy val lift = (project in file("util-lift"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-lift",
    crossScalaVersions := Seq("2.10.6", "2.11.8"),
    unmanagedSourceDirectories in Compile ++= Seq(
      (sourceDirectory in Compile).value / ("scala-2." + {
        CrossVersion.partialVersion(scalaBinaryVersion.value) match {
          case Some((major, minor)) if minor <= 11 => minor.toString
          case _ => "non-existing"
        }
    })),
    libraryDependencies ++= Seq(
      "net.liftweb" %% "lift-webkit" % Versions.liftVersion(scalaVersion.value)
    )
  ).dependsOn(
    parsers,
    testing % Test
  )

lazy val liftCats = (project in file("util-lift-cats"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-lift-cats",
    crossScalaVersions := Seq("2.10.6", "2.11.8"),
    unmanagedSourceDirectories in Compile ++= Seq(
      (sourceDirectory in Compile).value / ("scala-2." + {
        CrossVersion.partialVersion(scalaBinaryVersion.value) match {
          case Some((major, minor)) if minor <= 11 => minor.toString
          case _ => "non-existing"
        }
    })),
    libraryDependencies ++= Seq(
      "net.liftweb" %% "lift-webkit" % Versions.liftVersion(scalaVersion.value)
    )
  ).dependsOn(
    parsersCats,
    testing % Test
  )

lazy val macros = (project in file("util-macros"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-macros",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    libraryDependencies ++= Seq(
      compilerPlugin("org.scalamacros" % "paradise" % Versions.paradise cross CrossVersion.full),
      "org.typelevel"  %% "macro-compat" % "1.1.1",
      "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided"
    )
  )

lazy val validatorsCats = (project in file("util-validators-cats"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-validators-cats",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    addCompilerPlugin(
      "org.spire-math" % "kind-projector" % Versions.kindProjector cross CrossVersion.binary
    ),
    libraryDependencies ++= Seq(
      "com.chuusai" %% "shapeless" % Versions.shapeless,
      "org.typelevel" %% "cats" % Versions.cats
    )
  ).dependsOn(
    parsersCats,
    testing % Test
  )

lazy val validators = (project in file("util-validators"))
  .settings(sharedSettings: _*)
  .settings(
    moduleName := "util-validators",
    crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1"),
    addCompilerPlugin(
      "org.spire-math" % "kind-projector" % Versions.kindProjector cross CrossVersion.binary
    ),
    libraryDependencies ++= Seq(
      "org.scalaz" %% "scalaz-core" % Versions.scalaz
    )
  ).dependsOn(
    validatorsCats,
    parsers,
    testing % Test
  )
