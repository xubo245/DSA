package org.dsa.mediator.smithwaterman

import org.dsa.mediator.smithwaterman.adam.SmithWatermanConstantGapScoring

import scala.io.Source

/**
  * Created by xubo on 2016/11/23.
  */
object Base {
  def main(args: Array[String]) {
    //    adamSW()
    //  }
    //  def AdamSW(query: String, ref: String): Unit = {
    val  start=System.currentTimeMillis()
    val sw = new SmithWatermanConstantGapScoring("ACGT", "ACATGA", 1.0, 0.0, -1.0, -1.0)
    println(sw.xStart)

    val queryFile = "file\\test\\SSW\\10k.txt"
    val refFile = "file\\test\\SSW\\ref.fa"

    var query = Source.fromFile(queryFile).mkString
    var ref = Source.fromFile(refFile).mkString.split("\n")
    println(query.length)
    println(ref.length)
    val sw2 = ref.map { each =>
      val  startMap=System.currentTimeMillis()
      val result = new SmithWatermanConstantGapScoring(query, each, 2.0, 0.0, -2.0, -1.0)
      println(result.yStart + " " + result.cigarX)
      val endMap=System.currentTimeMillis()
      println("time:"+ (endMap-startMap)/1000+"s")
      result.yStart
    }
    sw2.foreach(println)
    val end=System.currentTimeMillis()
    println("time:"+ (end-start)/1000+"s")
  }


}
