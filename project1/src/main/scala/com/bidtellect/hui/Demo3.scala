package com.bidtellect.hui

object Demo3 {
  def main( args: Array[String]) = {
    //test big decimal
    val a = new BigDecimal( new java.math.BigDecimal("0.999345"))
    val b = new BigDecimal (new java.math.BigDecimal("0.999344"))
    print(a.pow(234000) > b.pow(234000))


  }
}
