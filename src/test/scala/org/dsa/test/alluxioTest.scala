package org.dsa.test

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/11/6.
  */
object alluxioTest {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName(this.getClass().getSimpleName().filter(!_.equals('$')))
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[4]")
    }
    val sc = new SparkContext(conf)

    var input=new String()
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      input="tachyon://Master:19998/1.txt"
    }else{
      input=args(0)
    }
    val rdd = sc.textFile(input)
    println("count:"+rdd.count())
    rdd.foreach(println)
    sc.stop()
  }
}
