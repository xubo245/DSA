package org.dsa.core.prepare

/**
  * Created by xubo on 2016/12/31.
  */
object FindM {
  def main(args: Array[String]) {

  }

  def compute201701091831(): Unit = {
    val arr = Array(
      (425, 1)
    )

    //    var argsArr=new ArrayBuffer[Array[String]]()
    for (i <- 0 until (arr.length)) {
      val arr1 = Array("length", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", arr(i)._1.toString, "/xubo/project/SparkSW/input/queryD/DL8L" + arr(i)._1)
      //      argsArr.append(arr1)
      Find.main(arr1)
    }
  }


  def compute201612311736(): Unit = {
    val arr = Array(
      (10275, 1),
      (10263, 1),
      (10260, 1),
      (10258, 1),
      (10252, 1),
      (10247, 1),
      (10244, 1),
      (10240, 1),
      (10231, 2),
      (10229, 1),
      (10223, 1),
      (10221, 1),
      (10215, 1),
      (10213, 2),
      (10210, 1))

    //    var argsArr=new ArrayBuffer[Array[String]]()
    for (i <- 0 until (arr.length)) {
      val arr1 = Array("length", "/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", arr(i)._1.toString, "/xubo/project/SparkSW/input/queryD/D9L" + arr(i)._1)
      //      argsArr.append(arr1)
      Find.main(arr1)
    }
  }
}
