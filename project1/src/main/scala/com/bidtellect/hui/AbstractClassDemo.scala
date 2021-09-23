package com.bidtellect.hui

package abstractClassDemo {

  object AbstractClassDemo {
    def main(xxx: Array[String]) = {
      val hui = new Student
      println(s"Student named ${hui.name} is ${hui.age} years old")
    }
  }
//todo : Scala简化了abstract类的定义，不需要在抽象方法或者属性前使用abstract关键词，
// 如果没有初始化，属性就是抽象的；如果没有方法体，方法就是抽象的
  abstract class Person {
    var age: Int //This is an abstract property because there isn't initialization.
    var name: String = "Default guy" //This is not an abstract property because it is initialized.
  }

  class Student extends Person {
    var age = 15 //Implement the abstract property.
  }


}


