package com.bidtellect.hui.propertytest

object PropertyTest {
  def main( args :Array[String]) = {
    val person = new Person("Hui", 37 )
	println(person.name)
  }
}

class Person(val name: String, var age: Int)


