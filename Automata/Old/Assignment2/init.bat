PATH=%PATH%;"C:\Program Files\Java\jdk-22\bin"
SET CLASSPATH=%CLASSPATH%;obj;antlr-4.10.1-complete.jar
doskey a4=java org.antlr.v4.Tool MyGrammar.g4 -o gen
doskey jc=javac gen\MyGrammar*.java Main.java -d obj
doskey grun=java org.antlr.v4.gui.TestRig PersonalInfo document -gui input.txt
doskey run=java Main $L input.txt
doskey clean=del /Q gen\* obj\*

