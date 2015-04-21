echo off
set arg1=%1
set mvnpath=D:/software/apache-maven-3.2.5/bin
set mvnbin=%mvnpath%/mvn.bat
set JAVA_HOME=C:/Program Files/Java/jdk1.7.0_75
echo ======================
echo path %path%
echo JAVA_HOME %JAVA_HOME%
echo mvnbin %mvnbin%
echo ======================
IF "%~1"=="" GOTO pareseError
IF "%~1"=="-bwu" GOTO builtWithUnitTest
IF "%~1"=="-bwou" GOTO builtWithOutUnitTest
IF "%~1"=="-re" GOTO refreshEclipse
IF "%~1"=="-run"  GOTO run
:builtWithOutUnitTest
%mvnbin% clean install -Dmaven.test.skip=true
GOTO EOF
:builtWithUnitTest
%mvnbin% clean install 
GOTO EOF
:run
echo start running the app
java -jar target/adalyist-rest-api-0.0.1-SNAPSHOT.jar
GOTO EOF
:pareseError
echo bad input
GOTO EOF
:refreshEclipse
%mvnbin% eclipse:eclipse
GOTO EOF
:EOF
REM ready for action!