package org.dsa.test

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkContext, SparkConf}

import scala.io.Source

/**
  * Created by xubo on 2016/11/20.
  */
object mkStringTest {
  def main(args: Array[String]): Unit = {

    val queryFile1 = "file\\input\\query\\0P18691.file"
    val queryFile2 = "file\\input\\query\\0P18691L20.file"
    compute(queryFile1)
    compute(queryFile2)

    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    val conf = new SparkConf().setAppName(this.getClass().getSimpleName().filter(!_.equals('$')))
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[4]")
    }
    val sc = new SparkContext(conf)
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      //      val out = "file/output/SaveFile/saveFile" + iString
      val rdd = sc.textFile(queryFile2)
      var arr = rdd.toArray()
      arr.foreach { each =>
        println("hello:" + each + " length=" + each.length)
      }
    } else {
      var out = args(1)
      //      compute(args(0), out, sc)
    }
    sc.stop()

  }

  def compute(queryFile: String): Unit = {
    val file = Source.fromFile(queryFile, "UTF-8")
    val str = file.mkString
    println(str.length)
    println(str)
    println()
  }
}
