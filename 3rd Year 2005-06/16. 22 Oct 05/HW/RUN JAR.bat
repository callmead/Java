@ echo Off
echo Please Wait...
Set ClassPath=.;.\Lib\naztools.jar;

rem Add all jars....
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i
cls
"C:\Program Files\Java\jdk1.5.0_04\bin\java" -jar BTSSS.jar

Pause