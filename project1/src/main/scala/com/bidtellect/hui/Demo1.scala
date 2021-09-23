package com.bidtellect.hui

object Demo1 {
  def main(args: Array[String]) = {
    timeTable(9)
  }

  def timeTable(n: Int): Unit = {
    if (n < 1)
      println("Invalid input.")
    else {
      for (x <- 1 to n; y <- 1 to x) {
        print("%d X %d = %d\t".format(y, x, x * y))
        if (y == x)
          println
      }
    }
  }


}
