echo off
set arg1=%1
echo %1

IF "%1" == "testON" GOTO WithTest

GOTO WithOutTest

:WithTest
echo best of luck doing build with unit test
D:\software\apache-maven-3.1.1-bin\apache-maven-3.1.1\bin\mvn.bat clean install 
GOTO EOF
:WithOutTest
echo skipping unit test
D:\software\apache-maven-3.1.1-bin\apache-maven-3.1.1\bin\mvn.bat clean install -Dmaven.test.skip=true
GOTO EOF
:EOF
http://www.drdobbs.com/web-development/building-scalable-web-architecture-and-d/240142422?pgno=1