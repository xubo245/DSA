package org.dsa.utils

import org.dsa.utils.DataDistribution

/**
  * Created by xubo on 2016/11/24.
  */
class DataDistributionSuite extends DSAFunSuite {
  test("uniref100 ") {
    val file = "file\\project\\dataDistribution\\input\\uniref100LineLengthCount\\20161124115928895"
    val out = "file\\project\\dataDistribution\\output\\dataDistribution"
    //      refDataDistribution(file, out, sc)
    DataDistribution.refDataDistribution(file, out, sc)
  }


  test("countSumAndAvg") {
    val file = "file/project/dataDistribution/input/uniref100LineLengthCount/20161124115928895"
    val out=new DataDistribution().countSumAndAvg(file, sc)
        out.take(20).foreach { each =>
          each.foreach(every => print(every + "\t"))
          println()
        }
  }

}
