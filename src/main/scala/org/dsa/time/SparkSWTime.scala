package org.dsa.time

import org.dsa.core.SparkSW
import org.dsa.utils.ArgsDefault

/**
  * Created by xubo on 2016/12/11.
  */
object SparkSWTime {
  def main(args: Array[String]) {
    for (i <- 0 until 3) {
      var subject = ArgsDefault.sparkSWSubject
      for (j <- 0 until subject.length) {
        SparkSW.main(subject(j))
      }
    }
  }
}
