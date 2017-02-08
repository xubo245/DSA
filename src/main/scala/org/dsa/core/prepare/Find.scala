package org.dsa.core.prepare

import java.io.PrintWriter

import org.apache.spark.{SparkConf, SparkContext}

/**
  * find sequnce by length or name in cluster
  *
  * Created by xubo on 2016/11/29.
  * find sequnce from ref database
  */
object Find {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName(this.getClass().getSimpleName().filter(!_.equals('$')))
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[16]")
    }

    val sc = new SparkContext(conf)

    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      val file = "file\\output\\T1\\20161027163253962"
      val result = findSequnceByLength(file, 8192, sc)
      printArr(result)
    } else {
      //      val out = args(1)
      if (args(0).equals("name")) {
        val result = findSequnceByName(args(1), args(2), sc)
        printArr(result)
      } else if (args(0).equals("length")) {
        val result = findSequnceByLength(args(1), args(2).toInt, sc)
        //        printArr(result)

        sc.parallelize(result).repartition(1).saveAsTextFile(args(3))
        //        val outPath = new PrintWriter(args(3))
        //        result.foreach{each=>outPath.println(each)
        //        }
        //        outPath.close()
      }
    }

    sc.stop()
  }

  def printArr(arr: Array[String]): Unit = {
    for (i <- 0 until arr.length) {
      println(arr(i))
    }
  }

  /**
    * find sequnce by length
    *
    * @param file   input file
    * @param length length
    * @param sc     SparkContext
    * @return sequnce array
    */
  def findSequnceByLength(file: String, length: Int, sc: SparkContext): Array[String] = {
    val RDD = sc.textFile(file)
    val result = RDD.filter { each =>
      val str = each.split(Array(','))
      if (str(1).length == length) {
        true
      } else {
        false
      }
    }
    result.toArray()
  }

  /**
    * find sequnce by sequnceName
    *
    * @param file        input file
    * @param sequnceName sequnceName
    * @param sc          SparkContext
    * @return sequnce array
    */
  def findSequnceByName(file: String, sequnceName: String, sc: SparkContext): Array[String] = {
    val RDD = sc.textFile(file)
    val result = RDD.filter { each =>
      val str = each.split(Array(','))
      if (str(0).equals(sequnceName)) {
        true
      } else {
        false
      }
    }
    result.toArray()
  }
}
