@ echo Off
echo Please Wait...
Set ClassPath=.;.\Lib\naztools.jar;
rem Add all jars....
 for %%i in (".\lib\*.jar") do call "CP.bat" %%i
cls
"C:\BTSSS\JVM\bin\java" frmTest
Pause