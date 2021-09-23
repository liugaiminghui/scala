package com.bidtellect.hui

object Demo2 {

  def main(args : Array[String]) = {
    val p = new People
    print(p.name)
  }

}

class People private(val age: Int, val name: String){

  def this(){
    this(1, "Terry")
  }
}