package org.dsa.test

import org.dsa.utils.DSAFunSuite
import scala.sys.process._

/**
  * Created by xubo on 2016/12/6.
  */
class SparkTestSuite extends DSAFunSuite {
  test("SparkTestSuite") {
    println(sc.defaultMinPartitions)
    println(sc.defaultParallelism)
    println(sc.defaultMinSplits)
  }

  //  test("hadoop"){
  //    val result = "hadoop fs -ls hdfs://219.219.220.149:9000/xubo/project/SparkSW/output/time/timeAnalysis/" !!;
  //      result.foreach(println)
  //  }
}
