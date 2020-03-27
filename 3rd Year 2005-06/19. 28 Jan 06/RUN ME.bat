@ echo Off
Call T
Call Home
echo Loading, Please Wait...
echo **********************************************  
echo.
rem Add all jars...
for %%i in (".\lib\*.jar") do call "CP.bat" %%i
CLS
rem java SMS
java test
echo.
echo **********************************************
Pause