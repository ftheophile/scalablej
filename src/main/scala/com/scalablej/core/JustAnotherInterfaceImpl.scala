package com.scalablej.core

import com.scalablej.interfaces.JustAnotherInterface

class JustAnotherInterfaceImpl extends JustAnotherInterface {

  override def interfaceOps(opt: String): Unit = {
    println("Interface Operations in: "+opt)
  }
}
