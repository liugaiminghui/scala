package com.bidtellect.hui.dynamicmixin
//This is a demo of mixing in a trait.
object Demo2 {
  def main( xxx : Array[String]) = {
    val obj = new AcdType with DummyTrait {
      def eat = println("Implement eat!")
    }
    obj.say

  }
}

trait DummyTrait {
  def say = println("This is from DummyTrait!")
  def eat
  println("Watch where I am.")
}