package com.bidtellect.hui.pkg2

class Person(param : String) {
  println("柱构造函数被调用了！")
  def this( param : Int) = {
    this("1")
    print(param)
  }

}

class Student extends Person(2){
  var a = 1
  def this( a : Int) = {
    this
    this.a = a
  }
}
