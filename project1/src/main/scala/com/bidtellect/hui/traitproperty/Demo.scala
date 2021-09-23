package com.bidtellect.hui.traitproperty

object Demo {
  def main(xxx : Array[String]) = {
    val obj = new AnyType
    println(obj.a)
  }
}

class Base
trait A {
  val a = 12
}

class AnyType extends Base with A
