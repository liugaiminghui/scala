package com.bidtellect.hui {

  package foo{
    class Car (private[bidtellect] val model : String)


    class Bus{
      def fun() = {
        val car = new Car("toyota")
        println(car.model)
      }

    }
  }

  object PrivateDemo {


      def main(args : Array[String]) = {
        import foo._
        val bus = new Bus
        bus.fun
      }
  }


}