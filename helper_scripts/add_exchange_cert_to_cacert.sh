#!/bin/bash

SRV=$1
ALI=$2
if [ -z $SRV ] || [ -z $ALI ] ; then 
	echo 'Usage: script.sh <Exchange server address> <cert alias>' 
else
	echo | openssl s_client -connect $SRV:443 2>&1 | sed -ne '/-BEGIN CERTIFICATE-/,/-END CERTIFICATE-/p' > cert.txt
	openssl x509 -outform der -in cert.txt -out cert.der
	sudo keytool -import -file cert.der -alias $ALI -keystore $JAVA_HOME/lib/security/cacerts
	rm cert.txt cert.der
fi


