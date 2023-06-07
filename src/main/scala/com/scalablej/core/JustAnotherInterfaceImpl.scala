package com.scalablej.core

import com.scalablej.interfaces.JustAnotherInterface

class JustAnotherInterfaceImpl extends JustAnotherInterface {

  override def interfaceOps(): Unit = {
    println("Interface Operations in Scala")
  }
}
