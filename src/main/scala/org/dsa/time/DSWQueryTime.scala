package org.dsa.time

import org.dsa.core.DSW
import org.dsa.utils.ArgsDefault

/**
  * Created by xubo on 2016/12/11.
  */
object DSWQueryTime {
  def main(args: Array[String]) {

    var subject = ArgsDefault.DSWQuery
    for (j <- 0 until subject.length) {
      for (i <- 0 until 3) {
        subject(j).foreach { each =>
          print(each + "\t")
        }
        println()
        DSW.main(subject(j))
      }
    }
  }
}
