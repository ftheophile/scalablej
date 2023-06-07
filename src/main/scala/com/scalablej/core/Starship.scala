package com.scalablej.core

class Starship extends JustAnotherInterfaceImpl {
  def start(engine: String): Unit = {
    println("Starting Starship with: "+engine)
    interfaceOps()
  }
}
