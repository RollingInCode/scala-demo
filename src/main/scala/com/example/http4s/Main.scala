package com.example.http4s

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  val run = Http4sServer.run[IO]
}
