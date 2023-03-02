[Previous](../00_introduction/introduction.md) Introduction

[Next](../02_Variables/variables.md) Variables

* [Hello World](./hello_world.md#hello-world)
	* [Comments](./hello_world.md#comments)

# Hello World

The process of Java programming can be simplified in three steps: 

1)Create the program by typing it into a text editor and saving it to a file – HelloWorld.java.








2)Compile it by typing “javac HelloWorld.java” in the terminal window.






3)Execute (or run) it by typing “java HelloWorld” in the terminal window.


Now, we are going to break down the Java syntax

Look at the following code:

```C
// This is a simple Java program.
// FileName : "HelloWorld.java".

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

1) public: So that JVM can execute the method from anywhere.




2) static: The main method is to be called without an object. The modifiers public and static can be written in either order.



3) void: The main method doesn’t return anything.




4) main(): Name configured in the JVM. The main method must be inside the class definition. The compiler executes the codes starting always from the main function.




5) String[]: The main method accepts a single argument, i.e., an array of elements of type String.
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
In a program, comments are like indents one makes, they are used so that it is easier for someone who isn’t familiar with the language to be able to understand the code. It will also make the job easier for you, as a coder, to find errors in the code since you will be easily able to find the location of the bug. Comments are ignored by the compiler while compiling a code, which makes the job more complex in the long run when they have to go through so much code to find one line.



### Types of Comments in C

1. Single-line comments.
2. Multi-line comments.
3. Documentation comments.

A. Single-line comments
A beginner-level programmer uses mostly single-line comments for describing the code functionality. It’s the easiest typed comments.

Syntax:  
```
//Comments here( Text in this line only is considered as comment )
```
Illustration: 

![image](https://user-images.githubusercontent.com/110519406/222536618-64f1d320-d299-40a8-9cf0-c5b0e95043d6.png)


Example:

```c
// Java program to show single line comments
 
class Scomment
{
    public static void main(String args[])
    {
         // Single line comment here
         System.out.println("Single line comment above");
    }
}
```
Output:

```
Single line comment above
```

B. Multi-line Comments:
To describe a full method in a code or a complex snippet single line comments can be tedious to write since we have to give ‘//’ at every line. So to overcome this multi-line comments can be used. 

Syntax: 

```C
/*Comment starts
continues
continues
.
.
.
Comment ends*/
```
Example:  

```C
//Java program to show multi line comments
class Scomment
{
    public static void main(String args[])
    {
        System.out.println("Multi line comments below");
        /*Comment line 1
          Comment line 2
          Comment line 3*/
    }
}
```
Output:
```
Multi line comments below
```
We can also accomplish single line comments by using the above syntax as shown below: 

/*Comment line 1*/

C. Documentation Comments:
This type of comment is used generally when writing code for a project/software package, since it helps to generate a documentation page for reference, which can be used for getting information about methods present, its parameters, etc. For example, http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html is an auto-generated documentation page that is generated by using documentation comments and a javadoc tool for processing the comments.

Syntax:  

```C
/**Comment start
*
*tags are used in order to specify a parameter
*or method or heading
*HTML tags can also be used 
*such as <h1>
*
*comment ends*/

/*package whatever //do not write package name here */
 
import java.io.*;
 
class GFG {
    public static void main (String[] args) {
        /**
        comment line 1
        comment line 2
        */
    }
}
```





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







[Previous](../00_introduction/introduction.md) Introduction

[Next](../02_Variables/variables.md) Variables
