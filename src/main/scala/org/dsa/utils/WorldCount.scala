package org.dsa.utils

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/10/28.
  */

class WorldCount {
  def compute(input: String, outPath: String): Unit = {
    val start = System.currentTimeMillis()
    val conf = new SparkConf().setAppName("lengthCount Application")
    val sc = new SparkContext(conf)
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    run(input, outPath + "LengthCount/" + iString, sc)
    //    worldCount("file/input/D1Line.fasta", "file/input/D1LineCount/"+iString, sc)
    sc.stop()
    val end = System.currentTimeMillis()
    println(input + ":" + (end - start) / 1000.0 + "s")
  }

  def run(input: String, output: String, sc: SparkContext): Unit = {
    val rdd = sc.textFile(input)
    rdd.map { each =>
      ((each.split(",")) (1).length, 1)
    }.reduceByKey(_ + _)
      .repartition(1)
      .sortByKey(ascending = false)
      .saveAsTextFile(output)
  }
}

object WorldCount {
  val refOutPath = Array(
    "/xubo/project/SparkSW/input/WordCount/DL1",
    "/xubo/project/SparkSW/input/WordCount/DL2",
    "/xubo/project/SparkSW/input/WordCount/DL3",
    "/xubo/project/SparkSW/input/WordCount/DL4",
    "/xubo/project/SparkSW/input/WordCount/DL5",
    "/xubo/project/SparkSW/input/WordCount/DL6",
    "/xubo/project/SparkSW/input/WordCount/DL7",
    "/xubo/project/SparkSW/input/WordCount/DL8",
    "/xubo/project/SparkSW/input/WordCount/DL9",
    "/xubo/project/SparkSW/input/WordCount/DL10")

  val ref = Array(
    "/xubo/project/SparkSW/input/Luniref/DL1Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL2Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL3Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL4Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL5Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL6Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL7Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL9Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL10Line.fasta")

  def main(args: Array[String]): Unit = {
    val wordCount = new WorldCount
    for (i <- 0 until (ref.length)) {
      wordCount.compute(ref(i), refOutPath(i))
    }
  }


}
