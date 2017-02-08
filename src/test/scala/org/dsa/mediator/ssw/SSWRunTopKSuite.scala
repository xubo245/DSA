package org.dsa.mediator.ssw

import org.dsa.utils.DSAFunSuite

/**
  * Created by xubo on 2016/12/10.
  */
class SSWRunTopKSuite extends DSAFunSuite {
  test("top 5") {
    sc.stop()
    var query = "file\\input\\query\\D1DP83140.file"
    var ref = "file\\input\\D1Line.fasta"
    var topK = 5
    SSWRunTopK.main(Array(query, ref, topK.toString))
  }
}
