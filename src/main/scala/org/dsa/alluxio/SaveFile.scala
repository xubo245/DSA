package org.dsa.alluxio

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by xubo on 2016/11/12.
  */
object SaveFile {
  def main(args: Array[String]) {
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    val conf = new SparkConf().setAppName(this.getClass().getSimpleName().filter(!_.equals('$')))
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[4]")
    }
    val sc = new SparkContext(conf)
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      val out = "file/output/SaveFile/saveFile" + iString
      compute("file/input/D1Line.fasta", out, sc)
    } else {
      var out = args(1)
      compute(args(0), out, sc)
    }
    sc.stop()
  }

  def compute(input: String, out: String, sc: SparkContext): Unit = {
    val start = System.currentTimeMillis()
    val rdd = sc.textFile(input)
    rdd.repartition(rdd.partitions.length * 8).saveAsTextFile(out)
    val end = System.currentTimeMillis()
    val countTime = (end - start) / 1000.0
    println("input:" + input + "\tout:" + out + "\tTime:" + countTime + "s" + "\tpartitons.length:" + rdd.partitions.length)
  }
}

