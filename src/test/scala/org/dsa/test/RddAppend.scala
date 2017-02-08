package org.dsa.test

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/11/3.
  */
object RddAppend {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName(this.getClass().getSimpleName().filter(!_.equals('$')))
      .setMaster("local[4]")
    val sc = new SparkContext(conf)
    val RDD = sc.parallelize(Array(1, 2, 3, 4, 5), 2)
    RDD.partitions.foreach { each =>
      println(each)
      println("\t" + each.index)
      println("\t" + each.hashCode())
    }
    RDD.foreachPartition { each =>
      println(each.size)
      each.foreach(println)
    }
    sc.stop
  }
}
