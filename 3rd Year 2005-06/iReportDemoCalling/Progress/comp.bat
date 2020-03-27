rem Set ClassPath=.;.\Lib\naztools.jar;

rem Add all jars....
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i

set path=I:\Progra~1\Java\jdk1.5.0_06\bin\  
javac JReportViewer.java

Pause