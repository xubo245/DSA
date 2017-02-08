package org.dsa.topK

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.commons.lang.RandomStringUtils
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object TopK {

  def main(args: Array[String]): Unit = {

    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())

    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      val out = "file/test/TopK/output/topk" + iString + ".txt"
      run(out, 3, 5, 3)
    } else {
      //    val out = "/xubo/project/TopK/output/topk" + iString
      val out = args(0) + iString
      run(out, args(1).toInt, args(2).toInt, args(3).toInt)
    }

  }

  def run(out: String, K: Int, big: Int, num: Int): Unit = {

    val conf = new SparkConf().setAppName("topK_K" + K.toString + "_big" + big.toString + "_num" + num.toString)
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[4]")
    }
    val sc = new SparkContext(conf)

    var returnArr = ArrayBuffer[(String, Int, Int, Int, Double)]()
    for (k <- 1 to K) {
      var sumJ = 1;
      for (j <- 1 to big) {
        var sumI = 1;
        sumJ = sumJ * 10
        for (i <- 1 to num) {
          sumI = sumI * 10
          println("running_k" + k.toString + "_big" + sumJ.toString + "_num" + sumI.toString)
          returnArr ++= compute(k, sumJ, sumI, sc)
        }
      }
    }

    val text1 = sc.parallelize(returnArr, 1)
    val outpath = out + "_k" + K.toString + "_big" + big.toString + "_num" + num.toString

    val rdd = text1.map { each =>
      val buffer = new StringBuilder
      buffer.append(each._1).append("\t")
        .append(each._2).append("\t")
        .append(each._3).append("\t")
        .append(each._4).append("\t")
        .append(each._5)
    }
    rdd.saveAsTextFile(out)
    sc.stop
  }

  def compute(K: Int, big: Int, num: Int, sc: SparkContext): Array[(String, Int, Int, Int, Double)] = {

    var startTime1 = System.currentTimeMillis()
    val arr = produceN(big, num).toArray
    println("\tarray.length:" + arr.length);
    val rdd1 = sc.parallelize(arr)
    var endTime1 = System.currentTimeMillis()
    println("\trdd init Time:" + (endTime1 - startTime1) + " ms");

    //methods 1 
    var startTime = System.currentTimeMillis()
    val arrTopK1 = rdd1.top(K)
    var endTime = System.currentTimeMillis()
    arrTopK1.foreach(each => println("\t\t" + each))
    val time1 = (endTime - startTime)
    println("\tK=" + K + " big=" + big + " num=" + num + " top method 1 Time:" + time1 + " ms");

    //methods 2 
    startTime = System.currentTimeMillis()
    var arrTopK2 = rdd1.sortByKey(false, 1).take(K)
    arrTopK1.foreach(each => println("\t\t" + each))
    endTime = System.currentTimeMillis()
    val time2 = (endTime - startTime)
    println("\tK=" + K + " n=" + big + " N=" + num + " sortByKey method 2 Time:" + time2 + " ms");
    Array(("top      ", K, big, num, time1.toDouble), ("sortByKey", K, big, num, time2.toDouble))
  }

  /**
    *
    * @param big 产生数据大小的区间 [0，big)
    * @param num 产生数据的数量
    * @return num个数
    */
  def produceN(big: Int, num: Int): ArrayBuffer[(Int, String)] = {
    var arr = ArrayBuffer[(Int, String)]()
    for (i <- 0 until num) {
      val random = new Random()
      val randomStringUtils = new RandomStringUtils
      RandomStringUtils.random(5, Array('a', 'b', 'c', 'd', 'e', 'f', '1', '2', '3'))
      arr ++= Array {
        (random.nextInt(big), (produceRandomString(10) + "_" + i.toString))
      }
    }
    arr
  }


  /**
    * 产生'a'.to('z')这26个字母的length随机长度的String
    *
    * @param length Random String的长度
    * @return 随机生成的String
    */
  def produceRandomString(length: Int): String = {
    var array: Array[Char] = new Array[Char](26)
    var arr = Array('a'.to('z').toArray)
    arr.foreach { each =>
      if (each != null && each.length > 25) {
        for (i <- 0 until each.length) {
          array(i) = each(i)
        }
      }
    }
    val random = RandomStringUtils.random(length, array)
    random
  }

  def topK1(K: Int, arr: RDD[(Int, Int)]): Array[(Int, Int)] = {
    //arr.toArray.
    var re = arr.top(K)
    re
  }
}