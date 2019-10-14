
#DSA
DSA: Scalable Distributed Sequence Alignment System Using SIMD Instructions

DSA's paper has beed accepted by CCGRID 2017.

In order to facilitate comparison, this project still remains SparkSW code. There will be removed after the paper published.

##prepare
we should prepare before run DSA.
###1. Apache Spark   
Please refer: https://github.com/apache/spark   
###2. Alluxio   
Please refer: http://www.alluxio.org/   
###3.Adam   
Please refer: https://github.com/bigdatagenomics/adam   
###4. SSW   
Please refer: https://github.com/mengyao/Complete-Striped-Smith-Waterman-Library   

We should obtain libsswjni.so, and libssw.so and put to /AlluxioPath/JNIlib.
##run 

    spark-submit \
    --conf "spark.executor.extraJavaOptions=-Djava.library.path=/AlluxioPath/JNIlib" \
    --jars /home/hadoop/cloud/adam/lib/adam-apis_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-cli_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-core_2.10-0.18.3-SNAPSHOT.jar \
    --class "org.dsw.api.DSA" \
    --master spark://MasterIP:7077 \
    --executor-memory 8G \
    DSA.jar DSAType queryFile refFile
 
 DSAType includes: dsw, dnw, dsg, dswAdam,  dnwAdam, dsgAdam.

  queryFile and refFile should be paths in Alluxio.

It has be written in testDSA.sh shell in file/sh folder.
###example

dsa.sh shell in file/sh fole: 

	sh testDSA.sh dsw  alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta
	sh testDSA.sh dnw  alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta
	sh testDSA.sh dsg  alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta
	sh testDSA.sh dswAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.adam alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.adam
	sh testDSA.sh dnwAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.adam alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.adam
	sh testDSA.sh dsgAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.adam alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.adam
	sh testDSA.sh dswAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.fastq alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.fasta
	sh testDSA.sh dnwAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.fastq alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.fasta
	sh testDSA.sh dsgAdam alluxio://Master:19998/xubo/project/SparkSW/input/fastq/T2.fastq alluxio://Master:19998/xubo/project/SparkSW/input/fasta/T2.fasta


the query and ref file can be found in file folder.


run：

	./dsa.sh

Results:

	P18691                                                                          
	5
	AlignmentRecord(refName=UniRef100_P18691, refSequence.take(100)=, cigar=8M, score1=67, score2=0, ref_begin1=0, ref_end1=7, read_begin1=0, read_end1=7, ref_end2=0)
	AlignmentRecord(refName=UniRef100_P18560, refSequence.take(100)=, cigar=8M, score1=51, score2=24, ref_begin1=0, ref_end1=260, read_begin1=0, read_end1=7, ref_end2=105)
	AlignmentRecord(refName=UniRef100_P0C9G3, refSequence.take(100)=, cigar=8M, score1=51, score2=21, ref_begin1=0, ref_end1=260, read_begin1=0, read_end1=7, ref_end2=117)
	AlignmentRecord(refName=UniRef100_P0C9G2, refSequence.take(100)=, cigar=8M, score1=51, score2=21, ref_begin1=0, ref_end1=260, read_begin1=0, read_end1=7, ref_end2=117)
	AlignmentRecord(refName=UniRef100_Q7K480, refSequence.take(100)=, cigar=8M, score1=50, score2=29, ref_begin1=0, ref_end1=1123, read_begin1=0, read_end1=7, ref_end2=1021)
	end
	P18691                                                                          
	5
	AlignmentRecord(refName=UniRef100_P18691, refSequence.take(100)=, cigar=, score1=67, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_P82152, refSequence.take(100)=, cigar=, score1=12, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_P81815, refSequence.take(100)=, cigar=, score1=11, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q7LZC4, refSequence.take(100)=, cigar=, score1=5, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_P80813, refSequence.take(100)=, cigar=, score1=4, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	end
	P18691                                                                          
	5
	AlignmentRecord(refName=UniRef100_P18691, refSequence.take(100)=, cigar=, score1=67, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_P0C9G3, refSequence.take(100)=, cigar=, score1=51, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_P0C9G2, refSequence.take(100)=, cigar=, score1=51, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_P18560, refSequence.take(100)=, cigar=, score1=51, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q7K480, refSequence.take(100)=, cigar=, score1=50, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	end
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(refName=UniRef100_Q6GZX4, refSequence.take(100)=, cigar=60M, score1=424, score2=362, ref_begin1=0, ref_end1=59, read_begin1=0, read_end1=59, ref_end2=89)
	AlignmentRecord(refName=UniRef100_Q6GZX3, refSequence.take(100)=, cigar=20M, score1=45, score2=30, ref_begin1=40, ref_end1=285, read_begin1=40, read_end1=59, ref_end2=85)
	AlignmentRecord(refName=UniRef100_Q197F5, refSequence.take(100)=, cigar=2M1I4M1D4M2I2M3D4M, score1=38, score2=30, ref_begin1=41, ref_end1=177, read_begin1=41, read_end1=59, ref_end2=75)
	AlignmentRecord(refName=UniRef100_Q91G88, refSequence.take(100)=, cigar=22M, score1=38, score2=34, ref_begin1=25, ref_end1=143, read_begin1=25, read_end1=46, ref_end2=106)
	AlignmentRecord(refName=UniRef100_Q6GZX2, refSequence.take(100)=, cigar=7M, score1=36, score2=34, ref_begin1=14, ref_end1=18, read_begin1=14, read_end1=20, ref_end2=339)
	end
	Feb 9, 2017 5:59:38 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Feb 9, 2017 5:59:45 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(refName=UniRef100_Q6GZX4, refSequence.take(100)=, cigar=, score1=22, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZX1, refSequence.take(100)=, cigar=, score1=-33, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZW8, refSequence.take(100)=, cigar=, score1=-128, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q197F7, refSequence.take(100)=, cigar=, score1=-163, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZX0, refSequence.take(100)=, cigar=, score1=-236, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	end
	Feb 9, 2017 5:59:59 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Feb 9, 2017 6:00:02 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(refName=UniRef100_Q6GZX4, refSequence.take(100)=, cigar=, score1=424, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZX0, refSequence.take(100)=, cigar=, score1=27, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q197F7, refSequence.take(100)=, cigar=, score1=23, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZX3, refSequence.take(100)=, cigar=, score1=23, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q91G88, refSequence.take(100)=, cigar=, score1=22, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	end
	Feb 9, 2017 6:00:11 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	Feb 9, 2017 6:00:14 PM INFO: org.apache.parquet.hadoop.ParquetInputFormat: Total input paths to process : 1
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(refName=UniRef100_Q6GZX4, refSequence.take(100)=, cigar=60M, score1=424, score2=362, ref_begin1=0, ref_end1=59, read_begin1=0, read_end1=59, ref_end2=89)
	AlignmentRecord(refName=UniRef100_Q6GZX3, refSequence.take(100)=, cigar=20M, score1=45, score2=30, ref_begin1=40, ref_end1=285, read_begin1=40, read_end1=59, ref_end2=85)
	AlignmentRecord(refName=UniRef100_Q197F5, refSequence.take(100)=, cigar=2M1I4M1D4M2I2M3D4M, score1=38, score2=30, ref_begin1=41, ref_end1=177, read_begin1=41, read_end1=59, ref_end2=75)
	AlignmentRecord(refName=UniRef100_Q91G88, refSequence.take(100)=, cigar=22M, score1=38, score2=34, ref_begin1=25, ref_end1=143, read_begin1=25, read_end1=46, ref_end2=106)
	AlignmentRecord(refName=UniRef100_Q6GZX2, refSequence.take(100)=, cigar=7M, score1=36, score2=34, ref_begin1=14, ref_end1=18, read_begin1=14, read_end1=20, ref_end2=339)
	end
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(refName=UniRef100_Q6GZX4, refSequence.take(100)=, cigar=, score1=22, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZX1, refSequence.take(100)=, cigar=, score1=-33, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZW8, refSequence.take(100)=, cigar=, score1=-128, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q197F7, refSequence.take(100)=, cigar=, score1=-163, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZX0, refSequence.take(100)=, cigar=, score1=-236, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	end
	UniRef100_Q6GZX4	RG	ID:foo	SM:bar
	5
	AlignmentRecord(refName=UniRef100_Q6GZX4, refSequence.take(100)=, cigar=, score1=424, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZX0, refSequence.take(100)=, cigar=, score1=27, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q197F7, refSequence.take(100)=, cigar=, score1=23, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q6GZX3, refSequence.take(100)=, cigar=, score1=23, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	AlignmentRecord(refName=UniRef100_Q91G88, refSequence.take(100)=, cigar=, score1=22, score2=0, ref_begin1=0, ref_end1=0, read_begin1=0, read_end1=0, ref_end2=0)
	end
	Q19LI2                                                                          

##Tutorial

the Tutorial or docs is being written.

##Help

If you have any questions or suggestions, please write it in the issue of this project or send an e-mail to me: xubo245@mail.ustc.edu.cn
