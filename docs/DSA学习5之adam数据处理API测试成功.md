更多代码请见：https://github.com/xubo245/SparkLearning
测试Adam数据的序列比对
# 1.实现

##1.1 实现类
org.dsw.api.DSA：

	object DSA {
	  def main(args: Array[String]) {
	    val dsa = new DSA()
	    val conf = new SparkConf().setAppName("DSA").set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
	    if (System.getProperties.getProperty("os.name").contains("Windows")) {
	      conf.setMaster("local[16]")
	    }
	
	    val sc = new SparkContext(conf)
	    val dsaType = args(0)
	    val queryFile = args(1)
	    val refFile = args(2)
	
	    var result = new Array[AlignmentRecordTopK](0);
	    if (dsaType.equals("dsw")) {
	      result = dsa.dsw(queryFile, refFile, sc)
	      printArray(result)
	    } else if (dsaType.equals("dnw")) {
	      result = dsa.dnw(queryFile, refFile, sc)
	      printArray(result)
	    } else if (dsaType.equals("dsg")) {
	      result = dsa.dsg(queryFile, refFile, sc)
	      printArray(result)
	    } else if (dsaType.equals("dswAdam")) {
	      result = dsa.dswAdam(queryFile, refFile, sc)
	      printArray(result)
	    } else if (dsaType.equals("dnwAdam")) {
	      result = dsa.dnwAdam(queryFile, refFile, sc)
	      printArray(result)
	    } else if (dsaType.equals("dsgAdam")) {
	      result = dsa.dsgAdam(queryFile, refFile, sc)
	      printArray(result)
	    } else {
	      println("dsa type error")
	    }
	    sc.stop()
	    println("end")
	  }

## 1.2 测试基本脚本

	hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ cat testDSA.sh 
	#!/bin/bash
	
	#sbt clean
	#sbt package
	#/home/zgg/lib/spark-1.0.1-bin-hadoop2/bin/spark-submit \
	  spark-submit \
	  --conf "spark.executor.extraJavaOptions=-Djava.library.path=/home/hadoop/disk2/xubo/lib" \
	  --jars /home/hadoop/cloud/adam/lib/adam-apis_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-cli_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-core_2.10-0.18.3-SNAPSHOT.jar \
	  --class "org.dsw.api.DSA" \
	  --master spark://MasterIP:7077 \
	  --executor-memory 8G \
	  DSA.jar $1 $2 $3

# 2 测试

## 2.1 测试读入fasta、fastq到Adam格式：

###2.1.1 脚本

hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ cat dsa.sh 



	./testDSA.sh dswAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.fastq alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.fasta
	./testDSA.sh dnwAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.fastq alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.fasta
	./testDSA.sh dsgAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.fastq alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.fasta

### 2.1.2 运行第一次
	
	hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ ./dsa.sh 
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, 60M, 424, 362, 0, 59, 0, 59, 89)
	AlignmentRecord(UniRef100_Q6GZX3, 20M, 45, 30, 40, 285, 40, 59, 85)
	AlignmentRecord(UniRef100_Q197F5, 2M1I4M1D4M2I2M3D4M, 38, 30, 41, 177, 41, 59, 75)
	AlignmentRecord(UniRef100_Q91G88, 22M, 38, 34, 25, 143, 25, 46, 106)
	AlignmentRecord(UniRef100_Q6GZX2, 7M, 36, 34, 14, 18, 14, 20, 339)
	end
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, , 22, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX1, , -33, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZW8, , -128, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q197F7, , -163, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX0, , -236, 0, 0, 0, 0, 0, 0)
	end
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, , 424, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX0, , 27, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q197F7, , 23, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX3, , 23, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q91G88, , 22, 0, 0, 0, 0, 0, 0)
	end

###2.1.3运行第二次

hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ ./dsa.sh 
UniRef100_Q6GZX4	RG	ID:foo	SM:bar
5
AlignmentRecord(UniRef100_Q6GZX4, 60M, 424, 362, 0, 59, 0, 59, 89)
AlignmentRecord(UniRef100_Q6GZX3, 20M, 45, 30, 40, 285, 40, 59, 85)
AlignmentRecord(UniRef100_Q197F5, 2M1I4M1D4M2I2M3D4M, 38, 30, 41, 177, 41, 59, 75)
AlignmentRecord(UniRef100_Q91G88, 22M, 38, 34, 25, 143, 25, 46, 106)
AlignmentRecord(UniRef100_Q6GZX2, 7M, 36, 34, 14, 18, 14, 20, 339)
end
UniRef100_Q6GZX4	RG	ID:foo	SM:bar
5
AlignmentRecord(UniRef100_Q6GZX4, , 22, 0, 0, 0, 0, 0, 0)
AlignmentRecord(UniRef100_Q6GZX1, , -33, 0, 0, 0, 0, 0, 0)
AlignmentRecord(UniRef100_Q6GZW8, , -128, 0, 0, 0, 0, 0, 0)
AlignmentRecord(UniRef100_Q197F7, , -163, 0, 0, 0, 0, 0, 0)
AlignmentRecord(UniRef100_Q6GZX0, , -236, 0, 0, 0, 0, 0, 0)
end
UniRef100_Q6GZX4	RG	ID:foo	SM:bar
5
AlignmentRecord(UniRef100_Q6GZX4, , 424, 0, 0, 0, 0, 0, 0)
AlignmentRecord(UniRef100_Q6GZX0, , 27, 0, 0, 0, 0, 0, 0)
AlignmentRecord(UniRef100_Q197F7, , 23, 0, 0, 0, 0, 0, 0)
AlignmentRecord(UniRef100_Q6GZX3, , 23, 0, 0, 0, 0, 0, 0)
AlignmentRecord(UniRef100_Q91G88, , 22, 0, 0, 0, 0, 0, 0)
end


## 2.2 直接处理Adam格式数据

### 2.2.1脚本

hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ cat dsa.sh 

		
	./testDSA.sh dswAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.adam alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.adam
	./testDSA.sh dnwAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.adam alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.adam
	./testDSA.sh dsgAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.adam alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.adam


### 2.2.2第一次运行记录

	hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ ./dsa.sh 
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, 60M, 424, 362, 0, 59, 0, 59, 89)
	AlignmentRecord(UniRef100_Q6GZX3, 20M, 45, 30, 40, 285, 40, 59, 85)
	AlignmentRecord(UniRef100_Q197F5, 2M1I4M1D4M2I2M3D4M, 38, 30, 41, 177, 41, 59, 75)
	AlignmentRecord(UniRef100_Q91G88, 22M, 38, 34, 25, 143, 25, 46, 106)
	AlignmentRecord(UniRef100_Q6GZX2, 7M, 36, 34, 14, 18, 14, 20, 339)
	end
	Dec 16, 2016 10:05:45 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Dec 16, 2016 10:05:47 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, , 22, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX1, , -33, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZW8, , -128, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q197F7, , -163, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX0, , -236, 0, 0, 0, 0, 0, 0)
	end
	Dec 16, 2016 10:05:55 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Dec 16, 2016 10:05:58 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, , 424, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX0, , 27, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q197F7, , 23, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX3, , 23, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q91G88, , 22, 0, 0, 0, 0, 0, 0)
	end
	Dec 16, 2016 10:06:06 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Dec 16, 2016 10:06:09 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1

### 2.2.3 第二次运行记录

	hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ ./dsa.sh 
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, 60M, 424, 362, 0, 59, 0, 59, 89)
	AlignmentRecord(UniRef100_Q6GZX3, 20M, 45, 30, 40, 285, 40, 59, 85)
	AlignmentRecord(UniRef100_Q197F5, 2M1I4M1D4M2I2M3D4M, 38, 30, 41, 177, 41, 59, 75)
	AlignmentRecord(UniRef100_Q91G88, 22M, 38, 34, 25, 143, 25, 46, 106)
	AlignmentRecord(UniRef100_Q6GZX2, 7M, 36, 34, 14, 18, 14, 20, 339)
	end
	Dec 16, 2016 10:06:37 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Dec 16, 2016 10:06:40 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, , 22, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX1, , -33, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZW8, , -128, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q197F7, , -163, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX0, , -236, 0, 0, 0, 0, 0, 0)
	end
	Dec 16, 2016 10:06:47 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Dec 16, 2016 10:06:50 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(UniRef100_Q6GZX4, , 424, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX0, , 27, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q197F7, , 23, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q6GZX3, , 23, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q91G88, , 22, 0, 0, 0, 0, 0, 0)
	end
	Dec 16, 2016 10:06:57 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Dec 16, 2016 10:07:00 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1


参考

	【1】http://spark.apache.org/
	【2】https://github.com/xubo245/SparkLearning
	【3】https://github.com/xubo245/DSA