@ Echo Off
call T
echo Compiling Please Wait...
rem Set ClassPath=.;.\Lib\naztools.jar;
rem Add all jars....
 for %%i in (".\Lib\*.jar") do call "CP.bat" %%i
echo **********************************************  
echo.
rem "C:\Program Files\Java\jdk1.5.0_04\bin\javac" *.java
Call Home
javac *.java
echo.
echo **********************************************
Pause