package org.dsa.core.etl

import org.dsa.utils.DSAFunSuite

/**
  * Created by xubo on 2016/11/24.
  */
class SplitSuite extends DSAFunSuite {
  test("test D1") {
    val split = new Split()
    split.splitRef("file\\input\\D1Line.fasta", "file\\output\\D1")
  }
}
