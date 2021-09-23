package com.bidtellect.hui.implicits

object ImplicitDemo3 {
  def main(xxx : Array[String]) = {
    val animal = new Animal
    animal.climbTree
  }

  implicit class Cat( a: Animal) {
      def climbTree = println("Climb the tree!")
  }

}
