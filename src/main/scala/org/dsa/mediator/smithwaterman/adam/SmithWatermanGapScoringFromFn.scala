/**
  * Licensed to Big Data Genomics (BDG) under one
  * or more contributor license agreements.  See the NOTICE file
  * distributed with this work for additional information
  * regarding copyright ownership.  The BDG licenses this file
  * to you under the Apache License, Version 2.0 (the
  * "License"); you may not use this file except in compliance
  * with the License.  You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
package org.dsa.mediator.smithwaterman.adam

import org.dsa.mediator.smithwaterman.SmithWaterman

abstract class SmithWatermanGapScoringFromFn(xSequence: String,
                                             ySequence: String,
                                             scoreFn: (Int, Int, Char, Char) => Double)
  extends SmithWaterman(xSequence, ySequence) {


  def buildScoringMatrix(): (Double,Array[Array[Int]], Array[Array[Char]]) = {

    val y = ySequence.length
    val x = xSequence.length

    val scoreMatrix = new Array[Array[Int]](x + 1)
    val moveMatrix = new Array[Array[Char]](x + 1)
    for (i <- 0 to x) {
      scoreMatrix(i) = new Array[Int](y + 1)
      moveMatrix(i) = new Array[Char](y + 1)
    }

    // set row/col 0 to 0
    for (i <- 0 to x) {
      scoreMatrix(i)(0) = 0
      moveMatrix(i)(0) = 'T'
    }

    for (j <- 0 to y) {
      scoreMatrix(0)(j) = 0
      moveMatrix(0)(j) = 'T'
    }

    // score matrix
    for (i <- 1 to x) {
      for (j <- 1 to y) {
        val m = scoreMatrix(i - 1)(j - 1) + scoreFn(i, j, xSequence(i - 1), ySequence(j - 1))
        val d = scoreMatrix(i - 1)(j) + scoreFn(i, j, xSequence(i - 1), '_')
        val in = scoreMatrix(i)(j - 1) + scoreFn(i, j, '_', ySequence(j - 1))

        val (scoreUpdate, moveUpdate) = if (m >= d && m >= in && m > 0) {
          (m.toInt, 'B')
        } else if (d >= in && d > 0) {
          (d.toInt, 'J')
        } else if (in > 0) {
          (in.toInt, 'I')
        } else {
          (0, 'T')
        }

        scoreMatrix(i)(j) = scoreUpdate.toInt
        moveMatrix(i)(j) = moveUpdate
      }
    }

    (0.0,scoreMatrix, moveMatrix)
  }

}

