package org.dsa.core.prepare

import org.dsa.utils.DSAFunSuite

/**
  * Created by xubo on 2016/12/1.
  */
class FindLocalSuite extends DSAFunSuite {

  test("findLocal2 main,D1Line,512") {
    sc.stop()
    val result = FindLocal2.main(Array("file\\input\\D1Line.fasta", "file/output/FindLocal/FindSaveByLength2","100"))

  }

  test("Find Local ,0P18691") {
    sc.stop()
    val result = FindLocal.findSequnceByLength("file\\input\\query\\0P18691.file", 4)
    assert(result == null)
  }

  test("Find Local,D1Line,3739") {
    sc.stop()
    val length = 3739
    val result = FindLocal.findSequnceByLength("file\\input\\D1Line.fasta", length)
    assert(result.split(",")(1).length == length)
  }

  test("Find Local,D1Line,512") {
    sc.stop()
    val length = 512
    val result = FindLocal.findSequnceByLength("file\\input\\D1Line.fasta", length)
    assert(result.split(",")(1).length == length)
  }

  test("findSaveByLength,D1Line,512") {
    sc.stop()
    val length = 512
    val result = FindLocal.findSaveByLength("file\\input\\D1Line.fasta", "file/output/FindLocal/FindSaveByLength", Array(100, 512), 100)

  }

  test("test array") {
    val arr = (100 to 1000 by 100).toArray
    arr.foreach(println)
  }
  test("findLocal main,D1Line,512") {
    sc.stop()
    val result = FindLocal.main(Array("file\\input\\D1Line.fasta", "file/output/FindLocal/FindSaveByLength"))

  }


}
