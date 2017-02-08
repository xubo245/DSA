package org.dsa.utils

/**
  * Created by xubo on 2016/12/6.
  */
object ArgsDefault {

  val queryDSW = Array(
    "/xubo/project/SparkSW/input/query/D0DP18691.file",
    "/xubo/project/SparkSW/input/query/D1DP83140.file",
    "/xubo/project/SparkSW/input/query/D2DP20738.file",
    "/xubo/project/SparkSW/input/query/D3DO55746.file",
    "/xubo/project/SparkSW/input/query/D4DQ6GZW8.file",
    "/xubo/project/SparkSW/input/query/D5DQ6GZX4.file",
    "/xubo/project/SparkSW/input/query/D6DQ19LI2.file",
    "/xubo/project/SparkSW/input/query/D7DQ7TQI7.file",
    "/xubo/project/SparkSW/input/query/D8DQ8IYD8.file",
    "/xubo/project/SparkSW/input/query/D9DR0INU3.file")

  val queryDSWLonger = Array(
    "/xubo/project/SparkSW/input/query/D0DP18691.file",
    "/xubo/project/SparkSW/input/query/D1DP83140.file",
    "/xubo/project/SparkSW/input/query/D2DP20738.file",
    "/xubo/project/SparkSW/input/query/D3DO55746.file",
    "/xubo/project/SparkSW/input/query/D4DQ6GZW8.file",
    "/xubo/project/SparkSW/input/query/D5DQ6GZX4.file",
    "/xubo/project/SparkSW/input/query/D6DQ19LI2.file",
    "/xubo/project/SparkSW/input/query/D7DQ7TQI7.file",
    "/xubo/project/SparkSW/input/query/D8DQ8IYD8.file",
    "/xubo/project/SparkSW/input/query/D9DR0INU3.file",
    "/xubo/project/SparkSW/input/query/D10DUPI000814841E.file",
    "/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file",
    "/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file")

  val queryHDFS = Array(
    "/xubo/project/SparkSW/input/query/0P18691.file",
    "/xubo/project/SparkSW/input/query/1P83140.file",
    "/xubo/project/SparkSW/input/query/2P20738.file",
    "/xubo/project/SparkSW/input/query/3O55746.file",
    "/xubo/project/SparkSW/input/query/4Q6GZW8.file",
    "/xubo/project/SparkSW/input/query/5Q6GZX4.file",
    "/xubo/project/SparkSW/input/query/6Q19LI2.file",
    "/xubo/project/SparkSW/input/query/7Q7TQI7.file",
    "/xubo/project/SparkSW/input/query/8Q8IYD8.file",
    "/xubo/project/SparkSW/input/query/9R0INU3.file")

  val queryMaster = Array(
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/0P18691.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/1P83140.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/2P20738.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/3O55746.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/4Q6GZW8.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/5Q6GZX4.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/7Q7TQI7.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/8Q8IYD8.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/9R0INU3.file")


  val refSparkSW = Array(
    "/xubo/project/SparkSW/input/D1Line.fasta",
    "/xubo/project/SparkSW/input/D2Line.fasta",
    "/xubo/project/SparkSW/input/D3Line.fasta",
    "/xubo/project/SparkSW/input/D4Line.fasta",
    "/xubo/project/SparkSW/input/D5Line.fasta",
    "/xubo/project/SparkSW/input/D6Line.fasta",
    "/xubo/project/SparkSW/input/D7Line.fasta",
    "/xubo/project/SparkSW/input/D8Line.fasta",
    "/xubo/project/SparkSW/input/D9Line.fasta",
    "/xubo/project/SparkSW/input/D10Line.fasta")

  val refByLength = Array(
    "/xubo/project/SparkSW/input/Luniref/DL1Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL2Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL3Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL4Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL5Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL6Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL7Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL9Line.fasta",
    "/xubo/project/SparkSW/input/Luniref/DL10Line.fasta")

  val subMatrixDSW = "alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt"
  val subMatrixBlosum50 = "BLOSUM50"
  val subMatrixBlosum60 = "BLOSUM60"
  val subMatrixBlosum62 = "BLOSUM62"
  val subMatrixSparkSW = "/xubo/project/SparkSW/hash50.csv"

  val sparkSWQuery = Array(
    Array("/xubo/project/SparkSW/hash50.csv", "~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/0P18691.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/1P83140.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/2P20738.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/3O55746.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/4Q6GZW8.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/5Q6GZX4.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/7Q7TQI7.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/8Q8IYD8.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/9R0INU3.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5")
  )


  val sparkSWSubject = Array(
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL10Line.fasta", "512", "1", "5")
  )

  //  val sparkSWSubject = Array(
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL1Line.fasta", "16", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL2Line.fasta", "16", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL3Line.fasta", "16", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL4Line.fasta", "16", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL5Line.fasta", "16", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL6Line.fasta", "32", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL7Line.fasta", "64", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5"),
  //    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL10Line.fasta", "512", "1", "5")
  //  )

  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL1Line.fasta", 4, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL2Line.fasta", 4, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL3Line.fasta", 4, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL4Line.fasta", 12, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL5Line.fasta", 20, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL6Line.fasta", 36, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL7Line.fasta", 68, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", 128, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", 256, 1, 5),
  //  Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/xubo/project/SparkSW/input/Luniref/DL10Line.fasta", 520, 1, 5)


  //  val DSWSubject = Array(
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta", "16", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL2Line.fasta", "16", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL3Line.fasta", "16", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL4Line.fasta", "16", "1", "5")
  //  )

  val DSWSubjectD8D10 = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL10Line.fasta", "512", "1", "5")
  )
  val DSWSubject = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta", "16", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL2Line.fasta", "16", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL3Line.fasta", "16", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL4Line.fasta", "16", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL5Line.fasta", "16", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL6Line.fasta", "32", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL7Line.fasta", "64", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL10Line.fasta", "512", "1", "5")
  )

  val DSWSubjectBig = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL10Line.fasta", "512", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5")
  )

  val DSWSubjectHDFS = Array(
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL1Line.fasta", "16", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL2Line.fasta", "16", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL3Line.fasta", "16", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL4Line.fasta", "16", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL5Line.fasta", "16", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL6Line.fasta", "32", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL7Line.fasta", "64", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5"),
    Array("hdfs://Master:9000/xubo/project/SparkSW/hash50.csv", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL10Line.fasta", "512", "1", "5")
  )

  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta", 4, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL2Line.fasta", 4, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL3Line.fasta", 4, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL4Line.fasta", 12, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL5Line.fasta", 20, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL6Line.fasta", 36, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL7Line.fasta", 68, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", 128, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", 260, 1, 5),
  //  Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL10Line.fasta", 520, 1, 5)

  val DSWQueryHDFS = Array(
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5")
  )

  val DSWQueryTestOPenGap = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1")
  )

  val DSW2SQueryD9 = Array(
    //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L10240N4", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
    //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L10240avg", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryD/D9L392N1", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryD/D9L392N10", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryD/D9L392N40", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryD/D9L392N100", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")
  )
  //  /xubo/project/SparkSW/input/queryM100
  val DSWQueryD7 = Array(
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryM/DL8L32N10", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL7Line.fasta", "128", "1", "5", "11", "1")
  )
  val DSWQueryD9HDFSSmall = Array(


    //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L10240N4", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
    //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L10240avg", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryD/D9L392N1", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryD/D9L392N10", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryD/D9L392N40", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/queryD/D9L392N100", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")

  )

  //  val DSWQueryD9HDFSSmall = Array(
  //    //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L10240N4", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
  //    //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L10240avg", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
  //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L392N1", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
  //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L392N10", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
  //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L392N40", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
  //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L392N100", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")
  //
  //  )
  //    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L10240N1", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")
  //  Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L392N1", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")
  //  Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/queryD/D9L392N10", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")


  val DSWQueryD8HDFS = Array(
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1")
  )
  val DSWQueryD8BLOSUM50 = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2")
  )
  val DSWQueryD8HDFSBLOSUM50 = Array(
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2")
  )
  val DSWQueryD8 = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1")
  )
  val DSWQueryD8Longer = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1")
  )

  val DSWQueryD8Small = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2")
  )
  val DSWQueryD9Small = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2")
  )
  val DSWQueryD9HDFS = Array(
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D0DP18691.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D1DP83140.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D2DP20738.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D3DO55746.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "hdfs://Master:9000/xubo/project/SparkSW/input/query/D9DR0INU3.file", "hdfs://Master:9000/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")
  )
  val DSWQueryD9 = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")
  )
  val DSWQueryD9Longer = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")
  )

  val DSWQuery = Array(
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("BLOSUM50", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5")
  )

  //  val DSWQuery = Array(
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D10DUPI000814841E.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D11DUPI0007E66D86.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D12DUPI0006B75FB4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5")
  //  )

  //  val DSWQuery = Array(
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D1DP83140.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D2DP20738.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D3DO55746.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D4DQ6GZW8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D5DQ6GZX4.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D7DQ7TQI7.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D8DQ8IYD8.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5"),
  //    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/xubo/project/SparkSW/input/query/D9DR0INU3.file", "alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta", "128", "1", "5")
  //  )

  def main(args: Array[String]) {
    //    queryDSW.foreach(println)
    //    querySparkSW.foreach(println)
    //    refByLength.foreach(println)
    //    compute()

    //    computeSparkSWSubject

    //    computeDSWQueryHDFS
    computeDSWQueryLonger
    DSWQueryHDFS.foreach {
      each =>
        each.foreach {
          each => print(each + " ")
        }
        println()
    }

    //    computeDSWSubject
    //    DSWSubject.foreach { each =>
    //      each.foreach { each => print(each + " ") }
    //      println()
    //    }

  }

  def computeDSW(): Unit = {

  }

  def computeDSWQueryLonger(): Unit = {
    val ref = refByLength(8)
    //    val ref = refByLength(8)
    val queryDSW1 = queryDSW
    val preOne = preHDFS
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum50 + "\"", "\"" + preOne + each + "\"", "\"" + preOne + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum50 + "\"", "\"" + preOne + each + "\"", "\"" + preOne + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum60 + "\"", "\"" + preOne + each + "\"", "\"" + preOne + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum60 + "\"", "\"" + preOne + each + "\"", "\"" + preOne + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum62 + "\"", "\"" + preOne + each + "\"", "\"" + preOne + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum62 + "\"", "\"" + preOne + each + "\"", "\"" + preOne + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  def computeDSWQuery(): Unit = {
    queryDSW.map {
      each =>
        ("\"" + subMatrixDSW + "\"", "\"" + pre + each + "\"", "\"" + pre + refByLength(7) + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }


  val pre = "alluxio://Master:19998"

  def computeDSWSubject(): Unit = {
    refByLength.map {
      each =>
        ("\"" + subMatrixDSW + "\"", "\"" + pre + queryDSW(6) + "\"", "\"" + pre + each + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  val preHDFS = "hdfs://Master:9000"

  def computeDSWQueryHDFS(): Unit = {
    queryDSW.map {
      each =>
        ("\"" + preHDFS + subMatrixSparkSW + "\"", "\"" + preHDFS + each + "\"", "\"" + preHDFS + refByLength(7) + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  def computeDSWSubjectHDFS(): Unit = {
    refByLength.map {
      each =>
        ("\"" + preHDFS + subMatrixSparkSW + "\"", "\"" + preHDFS + queryDSW(6) + "\"", "\"" + preHDFS + each + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  def computeSparkSWQuery(): Unit = {
    queryMaster.map {
      each =>
        ("\"" + subMatrixSparkSW + "\"", "\"" + each + "\"", "\"" + refByLength(7) + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  //  var map= map()
  def computeSparkSWSubject(): Unit = {
    refByLength.map {
      each =>
        ("\"" + subMatrixSparkSW + "\"", "\"" + queryMaster(6) + "\"", "\"" + each + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }
}
