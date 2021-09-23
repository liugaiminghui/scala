package com.bidtellect.hui.multimixin

// This is used to test out how scala compile multiple traits mixin.
object Demo {
  def main(xxx: Array[String]) = {
    val obj = new SomeType with A with B with C
    obj.sayHi
  }
}

class SomeType

trait Base {
  def sayHi = println("Base")
}

trait A extends Base {
  println("Initiate A.")

  override def sayHi = {
    println("A")
    super.sayHi
  }
}

trait B extends Base {
  println("Initiate B.")

  override def sayHi = {
    println("B")
    super.sayHi
  }
}

trait C extends Base {
  println("Initiate C.")

  override def sayHi = {
    println("C")
    super.sayHi
  }
}
