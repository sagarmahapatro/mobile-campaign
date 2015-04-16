echo off
set arg1=%1
echo %1

IF "%1" == "testON" GOTO WithTest

GOTO WithOutTest

:WithTest
echo skipping unit test
D:\software\apache-maven-3.2.5\bin\mvn.bat clean install 
GOTO EOF
:WithOutTest
echo best of luck doing build with unit test
D:\software\apache-maven-3.2.5\bin\mvn.bat clean install -Dmaven.test.skip=true
GOTO EOF
:EOF