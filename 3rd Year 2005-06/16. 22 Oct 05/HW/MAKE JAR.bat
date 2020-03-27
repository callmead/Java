@ echo Off
echo Please Wait...
rem Add all jars....
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i
cls
"C:\Program Files\Java\jdk1.5.0_04\bin\jar" cmf z.mf BTSSS.jar *.class Lib

Pause