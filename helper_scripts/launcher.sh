#!/bin/bash

PORT=$1
if [ -z $PORT ] ; then PORT=49362 ; fi
echo Launching MAS on port $PORT
nohup java -jar mailarchiveserver-launchpad-0.1.0-SNAPSHOT.jar -p $PORT &
echo MAS pid is $!


