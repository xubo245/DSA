#!/bin/bash
  spark-submit \
  --conf "spark.executor.extraJavaOptions=-Djava.library.path=/home/hadoop/disk2/xubo/lib" \
  --jars /home/hadoop/cloud/adam/lib/adam-apis_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-cli_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-core_2.10-0.18.3-SNAPSHOT.jar \
  --class "org.dsa.api.DSA" \
  --master spark://Master:7077 \
  --executor-memory 8G \
  DSA.jar $1 $2 $3
