package com.scalablej.core

object Starter {
  def main(args: Array[String]): Unit = {
    println("Hello Scala Core")
    val starship = new Starship()
    starship.start("Scala")

    val galaxyOne = new GalaxyOne()
    galaxyOne.start("Scala")

    galaxyOne.traitOps("Scala")
  }
}