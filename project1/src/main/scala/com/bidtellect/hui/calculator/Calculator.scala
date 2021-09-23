package com.bidtellect.hui.calculator

object Calculator {
  def main(args: Array[String]) = {
    val p0 = 0.3346977188311164
    val p1 = 3.440133225719295
    val p2 = 3.2199779937401223
    val T = 0.005

    // calculate bid of interest
    val result = Math.log(2*T / (p0 * p1 - 2 * T - Math.sqrt((p0*p1*p0*p1)-4*T*p0*p1))) / p1 + p2
    println( "The bid bucket of interest is " + result)

    //calculate derivative in bid of interest

    val expTerm = Math.exp(-p1 * (result - p2 ))
    val derivative = p0 * p1 * expTerm / Math.pow(1 + expTerm ,2)
    println( "The derivative of win rate at "+ result +" is " +  derivative)

  }
}
