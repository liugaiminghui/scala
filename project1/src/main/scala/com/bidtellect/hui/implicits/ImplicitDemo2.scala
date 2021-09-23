package com.bidtellect.hui.implicits

object ImplicitDemo2 {
  def main( xxx : Array[String]) = {
      func()

  }

  def func()(implicit a : String) = print(a)

}
