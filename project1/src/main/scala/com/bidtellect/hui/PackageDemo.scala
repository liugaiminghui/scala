package com.bidtellect.hui {

  package object pk1{
    def test = println("Package object test!")

  }
  import com.bidtellect.hui.pkg2._
  package pk1 {

    object PackageDemo {
      def main(args: Array[String]) = {
        test
        val p : Person = new Person(2)

      }
    }

  }


}

