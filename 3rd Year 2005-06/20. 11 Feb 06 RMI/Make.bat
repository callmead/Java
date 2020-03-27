@ Echo Off
Call Home

rem Add all jars....
for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i
  
javac *.java

Pause