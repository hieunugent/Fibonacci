JC=javac
JA=java
JFLAG = -g
CP= -cp

default: clean program test run
clean:
	rm -f *.class
program:
	$(JC) $(JFLAG) Fibonacci.java
test:
	$(JC) $(JFLAG) TestFibonacci.java TestRunner.java
run:
	$(JA) TestRunner
