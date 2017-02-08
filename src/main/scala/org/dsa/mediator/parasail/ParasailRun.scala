package org.dsa.mediator.parasail

import parasail.{Matrix, RunParasail}

import scala.io.Source

/**
  * Created by xubo on 2016/11/30.
  */
object ParasailRun {

  def main(args: Array[String]): Unit = {
    if (null == args) {
      throw new Exception(s"input null")
    }

    if (2 != args.length) {
      throw new Exception(s"input should:queryFile,refFile")
    }
    print("query:\t" + args(0))
    print("\tref:\t" + args(1))
    val start = System.currentTimeMillis()



    var topScore = 0
    var topName = ""
    val sources = Source.fromFile(args(0))
    val querys = sources.getLines().toArray.map { each =>
      val str = each.split(",")
      (str(0), str(1))
    }

    val refs = Source.fromFile(args(1)).getLines().toArray.map { each =>
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
        //        val result = RunParasail.run(query._2, ref._2)
        val result = RunParasail.runSW_striped_sat(query._2, ref._2, 12, 2, Matrix.blosum50)
        if (result > topScore) {
          topScore = result
          topName = ref._1
        }

        //        val result = ParasailScala.alignNW(query._2, ref._2, 12, 2, Matrix.blosum50)
        //        if (result.score1 > topScore) {
        //          topScore = result.score1
        //          topName = ref._1
        //        }
      }
    }
    val stop = System.currentTimeMillis()

    print("\tqueryLength:\t" + queryLength)
    print("\trefLength:\t" + refLength)

    print("\ttopScore:" + topScore)
    print("\ttopName:" + topName)
    //    print("\tSuccess")

    print("\ttime:\t" + (stop - start) + "\tms\n")
  }


}
