
package org.dsa.mediator.smithwaterman

class SmithWatermanAffine(xSequence: String,
                          ySequence: String,
                          scoreMatrixInput: String,
                          open: Int, gap: Int)
  extends SmithWaterman(xSequence, ySequence) {

  def buildScoringMatrix(): (Double, Array[Array[Int]], Array[Array[Char]]) = {

    var scoreMatrixValue = ssw.ScoreMatrix.scoreMatrix62
    if (scoreMatrixInput.equalsIgnoreCase("BLOSUM62")) {
      scoreMatrixValue = ssw.ScoreMatrix.scoreMatrix62
    } else if (scoreMatrixInput.equalsIgnoreCase("BLOSUM50")) {
      scoreMatrixValue = ssw.ScoreMatrix.scoreMatrix50
    } else {
      println("error score matrix")
    }
    compute(xSequence, ySequence, scoreMatrixValue, open, gap)

  }

  def compute(query: String, ref: String, bcBlosumValue: Array[Array[Int]], open: Int, gap: Int): (Double, Array[Array[Int]], Array[Array[Char]]) = {
    // get name and content of each database sequences

    var refLen = ref.length + 1
    val queryLen = query.length + 1

    // new arrays and initialize them for matrices
    //    var F = new Array[Array[Double]](queryLen)
    //    var E = new Array[Array[Double]](queryLen)
    //    var H = new Array[Array[Double]](queryLen)
    //    val moveMatrix = new Array[Array[Char]](queryLen)
    var F = Array.ofDim[Int](queryLen, refLen)
    var E = Array.ofDim[Int](queryLen, refLen)
    var H = Array.ofDim[Int](queryLen, refLen)
    var moveMatrix = Array.ofDim[Char](queryLen, refLen)

    for (i <- 0 until queryLen) {
      //      F(i) = new Array[Double](refLen)
      F(i)(0) = 0
      //      E(i) = new Array[Double](refLen)
      E(i)(0) = 0
      //      H(i) = new Array[Double](refLen)
      H(i)(0) = 0
      //      moveMatrix(i) = new Array[Char](refLen)
      moveMatrix(i)(0) = 'T'
    }
    for (i <- 0 until refLen) {
      F(0)(i) = 0
      E(0)(i) = 0
      H(0)(i) = 0
      moveMatrix(0)(i) = 'T'
    }
    // initialize one maximum score to zero
    var maxScore = 0

    // core of SW algorithm
    for (i <- 1 to (queryLen - 1)) {
      for (j <- 1 to (refLen - 1)) {

        var moveFlag: Char = 'T'
        var f1 = F(i - 1)(j) - 2
        val h1 = H(i - 1)(j) - 12
        F(i)(j) = if (f1 > h1) {
          f1
        } else {
          h1
        }

        var e2 = E(i)(j - 1) - 2
        var h2 = H(i)(j - 1) - 12
        E(i)(j) = if (e2 > h2) {
          e2
        } else {
          h2
        }


        //max
        var maxTmp = 0
        val eTmp = E(i)(j)
        if (eTmp > maxTmp) {
          maxTmp = eTmp
          moveFlag = 'I'
        }

        val fTmp = F(i)(j)
        if (fTmp > maxTmp) {
          maxTmp = fTmp
          moveFlag = 'J'
        }

        val hTmp = H(i - 1)(j - 1) + score(query(i - 1).toInt, ref(j - 1).toInt)
        if (hTmp > maxTmp) {
          maxTmp = hTmp
          moveFlag = 'B'
        }
        H(i)(j) = maxTmp

        if (H(i)(j) > maxScore) {
          maxScore = H(i)(j)
        }
        moveMatrix(i)(j) = moveFlag
      }
    }

    def score(up: Int, left: Int): Int = {
      bcBlosumValue(up)(left)
    }
    (maxScore, H, moveMatrix)
  }
}

