@ echo Off
Call Path
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i

java JReportViewer
Pause