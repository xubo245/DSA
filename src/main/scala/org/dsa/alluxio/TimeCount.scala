package org.dsa.alluxio

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by xubo on 2016/11/11.
  */
object TimeCount {
  def main(args: Array[String]) {
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    var file = new String
    if (args.length > 0) {
      file = args(0)
    } else {
      file = "local"
    }
    val conf = new SparkConf().setAppName(this.getClass().getSimpleName().filter(!_.equals('$')) + file)
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[4]")
    }
    val sc = new SparkContext(conf)
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      val out = "file/output/TimeCount/timeCount" + iString
      compute("file/input/D1Line.fasta", out, sc)
    } else {
      val out = args(1) + "/timeCount" + iString
      compute(args(0), out, sc)
    }
    sc.stop()
  }

  def compute(input: String, out: String, sc: SparkContext): Unit = {
    val start = System.currentTimeMillis()
    val rdd = sc.textFile(input)
    val count = rdd.count()
    val end = System.currentTimeMillis()
    val countTime = (end - start) / 1000.0
    println("input:" + input + "\tcount:" + count + "\tcountTime:" + countTime + "s")
    //    sc.parallelize(Array("count\t" + input + "\t" + count.toString + "\tCountTime\t" + countTime.toString + "\ts")).repartition(1).saveAsTextFile(out)
  }
}
