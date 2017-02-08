package org.dsa.api

import org.dsa.utils.DSAFunSuite

/**
  * Created by xubo on 2016/12/16.
  */
class DSASuite extends DSAFunSuite {
  test("fasta 2 DSA formats") {
    sc.stop()
    val input = "file/input/T1.fasta"
    val output = "file/input/T1LineDSA.fasta"
    val dsa = new DSA
    dsa.fasta2DSA(input, output)
  }

  test("fastq 2 DSA formats") {
    sc.stop()
    val input = "file/input/fastq/g38L100c50Nhs20.fastq"
    val output = "file/input/fastq/g38L100c50Nhs20LineDSA.fastq"
    val dsa = new DSA
    dsa.fastq2DSA(input, output)
  }
}
