[Previous](../README.md) LearnJava

[Next](../01_Hello_world/hello_world.md) Hello-World 


* [Introduction](./introduction.md#introduction)
	* [Requirements](./introduction.md#requirement)
	* [Setup](./introduction.md#setup)
	* [Coding Style (Betty)](./introduction.md#coding-style-betty)
	* [Keywords](./introduction.md#keywords) 



# Introduction

Java is a class-based, object-oriented programming language and is designed to have as few implementation dependencies as possible. A general-purpose programming language made for developers to write once run anywhere that is compiled Java code can run on all platforms that support Java. Java applications are compiled to byte code that can run on any Java Virtual Machine. The syntax of Java is similar to C/C++

## Requirement

You should aware of control flow statements like , if else, for loop, while loop ,do while loop ,operators 
This is the bare minimum requirement to start with any programming language.

You could also use an IDE, which most times come with a text editor and compiler.

Other Requirement-


1)Install Java 8 above version


2)Eclipse IDE(any other Java code editor)

## Setup

Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. The latest version is Java 19. 

Few things must be clear before setting up the environment

1)JDK(Java Development Kit): JDK is intended for software developers and includes development tools such as the Java compiler, Javadoc, Jar, and a debugger.

2)JRE(Java Runtime Environment): JRE contains the parts of the Java libraries required to run Java programs and is intended for end-users. JRE can be viewed as a subset of JDK.

3)JVM: JVM (Java Virtual Machine) is an abstract machine. It is a specification that provides a runtime environment in which java bytecode can be executed. JVMs are available for many hardware and software platforms.

Steps for setting the environment in Windows operating system are as follows: 

1)Step 1: Java8 JDK is available at Download Java 8. Click the second last link for Windows(32 bit) and the last link for Windows(64 bit) as highlighted below. 

2)Step 2: After download, run the .exe file and follow the instructions to install Java on your machine. Once you install Java on your machine, you have to set up the environment variable.

Step 3: Go to Control Panel -> System and Security -> System. Under the Advanced System Setting option click on Environment Variables as highlighted below. 
 
Step 4: Now, you have to alter the “Path” variable under System variables so that it also contains the path to the Java environment. Select the “Path” variable and click on the Edit button as highlighted below. 

Step 5: You will see a list of different paths, click on the New button, and then add the path where java is installed. By default, java is installed in “C:\Program Files\Java\jdk\bin” folder OR “C:\Program Files(x86)\Java\jdk\bin”. In case, you have installed java at any other location, then add that path. 

Step 6: Click on OK, Save the settings, and you are done !! Now to check whether the installation is done correctly, open the command prompt and type javac -version. You will see that java is running on your machine.

Note: To make sure whether the compiler is set up, type javac in the command prompt. You will see a list related to javac.


## Coding Style (Betty)
In this tutorial, we are going to be using the Betty Coding Style. To read more about the rules of this style, checkout [Betty Repository](https://github.com/holbertonschool/Betty/wiki).

And also a Video on how to install Betty in your Linux Based Computer [here](https://youtu.be/wDDKOOEPED0).
## KeyWords


Java keywords are also known as reserved words. Keywords are particular words that act as a key to a code. These are predefined words by Java so they cannot be used as a variable or object name or class name.

Keywords in Java are as follows

|KeyWords |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |
|:-------:|:-------:|:-------:|:-------:|
| abstract|boolean	|break|	byte|
|case|	catch	|char	|class|
| continue |	default|	do|	double|
|float|	for|	goto|	if|
|else	|enum	|extends|	final|
|finally|	float	|for	|if|
|implements	|import	|instanceof	|int|
|interface	|long|	native|	new|
| null|package	|private|	protected|
|public|	return	|short	|static|
| stripfp |	super|	switch|	synchronized|
|this|	throw|	throws|	transient|
|try	|void	|volatile|while|

Enough of the introduction






In the Next Section, we are going to write some crazy codes.

[Previous](../README.md) LearnJava

[Next](../01_Hello_world/hello_world.md) Hello-World


