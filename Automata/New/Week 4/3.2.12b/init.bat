rem This batch file sets up the environment for Java and ANTLR development.
rem It assumes that the Java Development Kit (JDK) and ANTLR are installed.
rem Modify the paths as necessary for your system.
rem This script is intended for Windows command line (cmd.exe)

rem PATH=%PATH%;"C:\Program Files\Java\jdk-16\bin"
SET CLASSPATH=.;obj;lib\antlr-4.13.2-complete.jar;%CLASSPATH%;
doskey a4=java org.antlr.v4.Tool MyGrammar.g4 -o gen
doskey jc=javac gen\MyGrammar*.java Main.java -d obj
doskey grun=java org.antlr.v4.gui.TestRig MyGrammar myStart -gui input.txt
doskey run=java Main $L input.txt
doskey clean=del /Q gen\* obj\*

