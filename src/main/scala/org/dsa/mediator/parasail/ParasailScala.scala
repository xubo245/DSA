package org.dsa.mediator.parasail

import org.dsa.rdd.AlignmentRecord
import parasail.{Matrix, RunParasail}

/**
  * Created by xubo on 2016/12/4.
  */
object ParasailScala {
  def align(query: String, ref: String): AlignmentRecord = {
    val maxScore = RunParasail.run(query, ref)

    val alignmentRecord = new AlignmentRecord()
    alignmentRecord.score1 = maxScore
    alignmentRecord
  }

  def alignNW(query: String, ref: String, open: Int, gap: Int, matrix: Matrix): AlignmentRecord = {
    val result = RunParasail.runNW(query, ref, open, gap, matrix)
//    println("result.getEndQuery:" + result.getEndQuery)
    //    println("result.getEndRef:" + result.getEndRef)
    //    println("result.getLength:" + result.getLength)
    //    println("result.getMatches:" + result.getMatches)
    //    println("result.getSaturated:" + result.getSaturated)
    //    println("result.getScore:" + result.getScore)
    //    println("result.getSimilar:" + result.getSimilar)
    new AlignmentRecord(result)
  }

  def alignSG(query: String, ref: String, open: Int, gap: Int, matrix: Matrix): AlignmentRecord = {
    val result = RunParasail.runSG(query, ref, open, gap, matrix)
    new AlignmentRecord(result)
  }

  def alignSW(query: String, ref: String, open: Int, gap: Int, matrix: Matrix): AlignmentRecord = {
    val result = RunParasail.runSW2(query, ref, open, gap, matrix)
    new AlignmentRecord(result)
  }
}
