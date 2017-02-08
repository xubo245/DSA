# DSA
DSA

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
##run example

    spark-submit \
    --conf "spark.executor.extraJavaOptions=-Djava.library.path=/AlluxioPath/JNIlib" \
    --jars /home/hadoop/cloud/adam/lib/adam-apis_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-cli_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-core_2.10-0.18.3-SNAPSHOT.jar \
    --class "org.dsw.api.DSA" \
    --master spark://MasterIP:7077 \
    --executor-memory 8G \
    DSA.jar DSAType queryFile refFile
 
 DSAType includes: dsw, dnw, dsg, dswAdam,  dnwAdam, dsgAdam.

  queryFile and refFile should be paths in Alluxio.


##Tutorial

the Tutorial or docs is being written.
