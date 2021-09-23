package com.bidtellect.hui

object ScalaExceptionDemo {

  def main(args: Array[String]) = {
    try {
      throw new YourScalaException
    }
    catch {
      case e : MyScalaException => println("MyScalaException")
      case _ => println("Other exception")
    }
  }
}


class MyScalaException extends Exception
class YourScalaException extends Exception