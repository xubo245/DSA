package org.dsa.core

import org.dsa.analysis.DSWBackup
import org.dsa.utils.DSAFunSuite

/**
  * Created by xubo on 2016/11/20.
  */
class DSWSuite extends DSAFunSuite {
  test("DSW test") {
    sc.stop()
    //    val subMatrix = "file/input/subMatrix/hash50.csv"
    val subMatrix = "file/input/subMatrix/BLOSUM50.txt"
    val queryFile = "file/input/query/0P18691L20.file"
    val dbFile = "file/input/D1Line.fasta"
    val splitNum = 32
    val taskNum = 1
    val topK = 5
    DSWBackup.run(subMatrix, queryFile, dbFile, splitNum, taskNum, topK)
  }
//  test("test DNA"){
  //    sc.stop()
  //    //    val subMatrix = "file/input/subMatrix/hash50.csv"
  //    val subMatrix = "file/input/subMatrix/BLOSUM50.txt"
  //    val queryFile = "file\\test\\SSW\\10k.txt"
  //    val dbFile = "file\\test\\SSW\\ref.fa"
  //    val splitNum = 32
  //    val taskNum = 1
  //    val topK = 5
  //    DSW.run(subMatrix, queryFile, dbFile, splitNum, taskNum, topK)
  //  }
}
