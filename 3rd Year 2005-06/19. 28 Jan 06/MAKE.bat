@ Echo Off
echo Preparing Class files, Please Wait...
rem Add all jars....
 for %%i in (".\Lib\*.jar") do call "CP.bat" %%i
echo **********************************************  
echo.
Call Home
javac *.java
echo.
echo **********************************************
Pause