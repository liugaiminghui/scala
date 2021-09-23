package com.bidtellect.hui

package object implicits {
  implicit val bString = "This is fucked"
  implicit def animalToPerson(a : Animal) = new Human
}
