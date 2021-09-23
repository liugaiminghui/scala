package com.bidtellect.hui.implicits

//method application insert
object ImplicitDemo1 {
  def main(xxx: Array[String]) = {
    val a = new Animal
    a.read
  }
}

class Animal {
  def breath = println("Breath!")

  def eat = println("Eat!")
}

class Human extends Animal {
  def read = println("Read!")
}
