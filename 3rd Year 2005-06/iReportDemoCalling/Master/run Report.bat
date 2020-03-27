Set ClassPath=.;.\Lib\naztools.jar;

rem Add all jars....
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i

rem c:\jdk5\bin\java ViewReport

I:\Program Files\Java\jdk1.5.0_06\bin\java JReportViewer

Pause