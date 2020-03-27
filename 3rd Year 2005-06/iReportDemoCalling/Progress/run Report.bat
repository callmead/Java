Set ClassPath=.;.\Lib\naztools.jar;

rem Add all jars....
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i
"C:\Program Files\Java\jdk1.5.0_04\bin\java" JReportViewer

Pause