@echo off
REM This batch file compiles and runs the RegexGame application
REM It assumes that the Java Development Kit (JDK) and ANTLR are installed.

echo Compiling RegexGame grammar...
java org.antlr.v4.Tool RegexGame.g4 -o gen

echo Creating obj directory if it doesn't exist...
if not exist obj mkdir obj

echo Compiling Java files...
javac -cp ".;lib/antlr-4.13.2-complete.jar" gen\RegexGame*.java RegexGame.java -d obj

echo Running RegexGame...
java -cp "obj;lib/antlr-4.13.2-complete.jar" RegexGame

echo Done!