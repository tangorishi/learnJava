[Previous](../00_introduction/introduction.md) Introduction

[Next](../02_Variables/variables.md) Variables

* [Hello World](./hello_world.md#hello-world)
	* My First Program
	* [Comments](./hello_world.md#comments)

# Hello World

The process of Java programming can be simplified in three steps: 

1)Create the program by typing it into a text editor and saving it to a file – HelloWorld.java.








2)Compile it by typing “javac HelloWorld.java” in the terminal window.






3)Execute (or run) it by typing “java HelloWorld” in the terminal window.


Now, we are going to break down the Java syntax

Look at the following code:

// This is a simple Java program.
// FileName : "HelloWorld.java".
```C
class HelloWorld
{
	// Your program begins with a call to main().
	// Prints "Hello, World" to the terminal window.
	public static void main(String args[])
	{
		System.out.println("Hello, World");
	}
}

```
### Syntax Explained:

```
Note: you don't have to understand everything now, it'll all come to you.
```

Line 1:  1. Class definition
This line uses the keyword class to declare that a new class is being defined.
```c
class HelloWorld {
    //
    //Statements
}
```


Line 2: ``Hello world``
It is an identifier that is the name of the class. The entire class definition, including all of its members, will be between the opening curly brace “{” and the closing curly brace “}“.

Line 3: main method: 
In the Java programming language, every application must contain a main method. The main function(method) is the entry point of your Java application, and it’s mandatory in a Java program. whose signature in Java is: 
```c
public static void main(String[] args)
```

1)public: So that JVM can execute the method from anywhere.




2)static: The main method is to be called without an object. The modifiers public and static can be written in either order.



3)void: The main method doesn’t return anything.




4)main(): Name configured in the JVM. The main method must be inside the class definition. The compiler executes the codes starting always from the main function.




5)String[]: The main method accepts a single argument, i.e., an array of elements of type String.
Line 4: 
Like in C/C++, the main method is the entry point for your application and will subsequently invoke all the other methods required by your program.

The next line of code is shown here. Notice that it occurs inside the main() method. 
```
System.out.println("Hello, World");
```
This line outputs the string “Hello, World” followed by a new line on the screen. 

Output is accomplished by the built-in println( ) method. 

The System is a predefined class that provides access to the system, and out is the variable of type output stream connected to the console.

## Comments

### Types of Comments in C
there are two(2) types of comments in C:
* **Single line comments**:This type of comment must begin with // as in C/C++. 
  Example:
```C
//This is a Comment
```
* **Multiline Comments**: For multiline comments, they must begin from /* and end with */. 
* . Example:
```C
/* This

is

a 

multiline

comment */
```
## Important Points 

The name of the class defined by the program is HelloWorld, which is the same as the name of the file(HelloWorld.java). 


This is not a coincidence!!



In Java, all codes must reside inside a class, and there is at most one public class which contains the main() method.



By convention, the name of the main class(a class that contains the main method) should match the name of the file that holds the program.



Every Java program must have a class definition that matches the filename (class name and file name should be same).





## Compile and Run


After successfully setting up the environment, we can open a terminal in both Windows/Unix and go to the directory where the file – HelloWorld.java is present.
Now, to compile the HelloWorld program, execute the compiler – javac, to specify the name of the source file on the command line, as shown:

```c
javac HelloWorld.java 
```

The compiler creates a HelloWorld.class (in the current working directory) that contains the bytecode version of the program. Now, to execute our program, JVM(Java Virtual Machine) needs to be called using java, specifying the name of the class file on the command line, as shown:
And that's it.

```c
java HelloWorld
```
This will print ```  “Hello World”   ``` to the terminal screen.



LESSSGOOOOO





[Previous](../00_introduction/introduction.md) Introduction

[Next](../02_Variables/variables.md) Variables
