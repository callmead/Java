@ Echo Off
Call Path
echo Compiling...
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i
javac JReportViewer.java
Pause