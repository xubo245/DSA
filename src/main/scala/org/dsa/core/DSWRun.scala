package org.dsa.core

import parasail.RunParasail

import scala.io.Source

/**
  * Created by xubo on 2016/12/1.
  */
class DSWRun {

}

object DSWRun {
  def main(args: Array[String]) {
    if (null == args) {
      throw new Exception(s"input null")
    }

    if (2 != args.length) {
      throw new Exception(s"input should:queryFile,refFile")
    }

    for (i <- 10000 to 300000 by 10000) {
      run(args(0), args(1), i)
    }

  }

  def run(queryFile: String, refFile: String, threshold: Int): Unit = {

    print("query:\t" + queryFile)
    print("\tref:\t" + refFile)
    val start = System.currentTimeMillis()

    var topScore = 0
    var topName = ""
    val sources = Source.fromFile(queryFile)
    val querys = sources.getLines().toArray.map { each =>
      val str = each.split(",")
      (str(0), str(1))
    }

    val refs = Source.fromFile(refFile).getLines().toArray.map { each =>
      val str = each.split(",")
      (str(0), str(1))
    }

    var queryLength = 0
    var refLength = 0
    querys.map { query =>

      refs.map { ref =>
        if (refLength == 0) {
          refLength = ref._2.length
          queryLength = query._2.length
        }
        //        println("query\t" + query._2 + "\nref:\t" + ref._2)
        val result = RunParasail.run(query._2, ref._2)
        if (result > topScore) {
          topScore = result
          topName = ref._1
        }
      }
    }
    val stop = System.currentTimeMillis()

    print("\tqueryLength:\t" + queryLength)
    print("\trefLength:\t" + refLength)
    print("\tthreshold:\t" + threshold)

    print("\ttopScore:" + topScore)
    print("\ttopName:" + topName)
    //    print("\tSuccess")

    print("\ttime:\t" + (stop - start) + "\tms\n")
  }

}
