Set ClassPath=.;.\Lib\naztools.jar;

rem Add all jars....
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i
rem C:\j2sdk1.4.2_04\bin\java JViewReport
C:\j2sdk1.4.2_04\bin\java -version

Pause