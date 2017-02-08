package org.dsa.core.etl

import org.dsa.utils.DSAFunSuite

/**
  * Created by xubo on 2017/1/9.
  */
class ToFastaSuite extends DSAFunSuite{

  test("test1"){
    val input = "file/input/T1.fasta"
    val output = "file/input/T1.tofasta"
    val agrs = Array(input, output)
    ToFasta.main(agrs)
  }

}
