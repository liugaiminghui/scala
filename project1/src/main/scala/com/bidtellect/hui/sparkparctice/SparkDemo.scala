package com.bidtellect.hui.sparkparctice
import org.apache.spark.{SparkConf, SparkContext}

object SparkDemo {
  def main(args : Array[String]) = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("Demo")
    val sc = new SparkContext(conf)
    //read data and create RDD
    //val lines : RDD[String] = sc.textFile("")
  }
}
