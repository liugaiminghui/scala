package com.bidtellect.hui.dynamicmixin
object Demo {
  def main(xxx : Array[String]) = {
    val obj = new AcdType{
      def say = println("Hehe")
      def eat = println("Yummy")
    }
    obj.say
    obj.eat
  }
}

class AcdType
