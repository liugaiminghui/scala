package com.bidtellect.hui.trylazy

object TryLazy {
  val imNotLazy = 2 * 3 * 4

  lazy val imLazy = {
    println("I ma lazy")
  }

  def main(args : Array[String]) = {

  }

}
