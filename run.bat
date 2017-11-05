@echo off
set /p file="enter your file: "
"c:\Program Files\Java\jdk-9.0.1\bin\javac" %file%.java
set /p execute="do you want to execute it? y/n "
if %execute%=="y" goto execute_it
goto finish

:execute_it
call r_.bat %file%

:finish