@ echo off
Set ClassPath=.;.\Lib\naztools.jar;

rem Add all jars....
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i
  
set path=I:\Program Files\Java\jdk1.5.0_06\bin\
javac *.java

Pause