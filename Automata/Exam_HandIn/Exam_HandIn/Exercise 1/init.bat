SET CLASSPATH=.;obj;lib\antlr-4.13.2-complete.jar;%CLASSPATH%;
doskey a4=java org.antlr.v4.Tool ExamGrammar.g4 -o gen -visitor
doskey jc=javac gen\ExamGrammar*.java Main.java -d obj
doskey grun=java org.antlr.v4.gui.TestRig ExamGrammar prog -gui input.txt
doskey run=java Main $L input.txt
doskey clean=del /Q gen\* obj\*

