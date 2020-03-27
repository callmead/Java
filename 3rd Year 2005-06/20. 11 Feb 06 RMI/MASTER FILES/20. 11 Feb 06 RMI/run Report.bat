Set ClassPath=.;.\Lib\naztools.jar;

rem Add all jars....
 for %%i in (".\lib\*.jar") do call "cpappend.bat" %%i

D:\JBuilder4\jdk1.3\bin\java frmSupplier
Pause