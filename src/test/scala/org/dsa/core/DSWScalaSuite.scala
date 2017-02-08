package org.dsa.core

import org.dsa.utils.DSAFunSuite

/**
  * Created by xubo on 2016/12/1.
  */
class DSWScalaSuite extends DSAFunSuite {
  test("init") {
    sc.stop()
    val queryFile="file\\input\\query\\D1DP83140.file"
    val refFile="file\\input\\D1Line.fasta"
    DSWRun.main(Array(queryFile,refFile))
  }

}
