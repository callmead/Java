Set ClassPath=.;.\Lib\naztools.jar;

rem Add all jars....
for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i
  
C:\j2sdk1.4.2_04\bin\javac *.java

Pause