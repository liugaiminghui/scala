package com.bidtellect.hui.sparkpartition

import org.apache.spark.{Partitioner, SparkConf, SparkContext}

object SparkPartitionDemo {
  def main(args: Array[String]) = {
    val conf = new SparkConf
    conf.setAppName("PartitionDemo").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val rdd1 = sc.parallelize(List("a", "b", "c", "d"))

    val rdd2 = rdd1.map((_, 1))
    val rdd3 = rdd2.partitionBy(new CustomerPartitioner(2))
    // prefix with partition index
    val rdd4 = rdd3.mapPartitionsWithIndex((i, kv) => kv.map(x => (i, x._1)))
    rdd4.foreach(println)
  }


}


class CustomerPartitioner(partitions: Int) extends Partitioner {
  override def numPartitions: Int = partitions

  override def getPartition(key: Any): Int = 0
}

