
[Previous](../01_Hello_world/hello_world.md) Hello World

[Next](../03_Operators/operators.md) Operators
# 
* [Variables](./variables.md#variables)
* [Declaring Variables](./variables.md#declaring-variables)
* [Types of Variables](./variables.md#types-of-variables)
* [Difference](./variables.md#difference)

	
# Variables
Variables are containers for storing data values.

Different variables used in Java are as-:

1)```String``` - stores text, such as "Hello". 

String values are surrounded by double quotes







2)```int``` - stores integers (whole numbers), without decimals, such as 123 or -123





3)```float``` - stores floating point numbers, with decimals, such as 19.99 or -19.99





4)```char``` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes





5)```boolean``` - stores values with two states: true or false





## Declaring Variables

Syntax

```type variableName = value;```

Where type is one of Java's types (such as ```int``` or ```String```)


*variableName* is the name of the variable (such as x or name). The equal sign is used to assign values to the variable.

***To create a variable that should store text, look at the following example:***

a variable called name of type String and assign it the value "XYZ":
```c 

String name = "XYZ";
System.out.println(name);

````

***To create a variable that should store a number, look at the following example:***

 a variable called myNum of type int and assign it the value 5:
 
```c
int myNum = 5;
System.out.println(myNum);

```

***Note-that if you assign a new value to an existing variable, it will overwrite the previous value:***

Change the value of myNum from 5 to 20:


```c
int myNum = 5;
myNum = 20;  // myNum is now 20
System.out.println(myNum);
```
**Final Variables**

If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

```c
final int myNum = 5;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
```
**Other Types**

```c
int myNum = 5;
```

```c
float myFloatNum = 5.99f;
```

```c
char myLetter = 'D';
```

```c
boolean myBool = true;
```


```c
String myText = "Hello";
```

## Types of variables


*1)Local variables*


*2)Instance variables*


*3)Static variables*



**1)Local Variables**


i)A variable defined within a block or method or constructor is called a local variable. 

ii)These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.

iii)The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block.
```
Initialization of the local variable is mandatory before using it in the defined scope.
```

```c

class GFG {
	public static void main(String[] args)
	{
		int var = 10; // Declared a Local Variable
		// This variable is local to this main method only
		System.out.println("Local Variable: " + var);
	}
}
```

*Output*
```
Local Variable: 10
```
**2)Instance Variables**

i)Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block. 

ii)As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.


iii)Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.


iv)Initialization of an instance variable is not mandatory. Its default value is 0.


v)Instance variables can be accessed only by creating objects.

```c

/*package whatever //do not write package name here */

import java.io.*;

class GFG {

	public String geek; // Declared Instance Variable

	public GFG()
	{ // Default Constructor

		this.geek = "XYZ"; // initializing Instance Variable
	}
//Main Method
	public static void main(String[] args)
	{

		// Object Creation
		GFG name = new GFG();
		// Displaying O/P
		System.out.println("Geek name is: " + name.geek);
	}
}

```

*Output*

```
Geek name is: XYZ
```

**3)Static Variables**

Static variables are also known as ```class variables.``` 

i)These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block.



ii)Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.

iii)Static variables are created at the start of program execution and destroyed automatically when execution ends.


iv)Initialization of a static variable is not mandatory. Its default value is 0.


v)If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.


vi)If we access a static variable without the class name, the compiler will automatically append the class name.

```c

/*package whatever //do not write package name here */

import java.io.*;

class GFG {

public static String geek = "XYZ";		 //Declared static variable

	public static void main (String[] args) {
		
	//geek variable can be accessed without object creation
	//Displaying O/P
	//GFG.geek --> using the static variable
		System.out.println("Geek Name is : "+GFG.geek);
	}
}

```



*Output*
```
Geek Name is : XYZ
```

## Difference

```
We can access instance variables through object references, and static variables can be accessed directly using the class name.
```



*Instance Variables*

* Any variable that is defined in class body and outside bodies of methods; and it should not be declared static, abstract, stricftp, synchronized, and native modifier.
* An instance variable cannot live without its object, and it is a part of the object.
* Every object has their own copies of instance variables.

*Static Variables (class variables)*

* Use static modifier

* Belong to the class (not to an object of the class)

* One copy of a static variable

* Initialize only once at the start of the execution.

* Enjoy the program’s lifetime

Consider a class MyClass, having one static and one non-static member:

```c
public class MyClass {
    public static int STATICVARIABLE = 0;
    public int nonStaticVariable = 0;
}
```

Now, let's create a main() to create a couple of instances:

```c
public class AnotherClass{  
    public static void main(String[] args) {    
        // Create two instances of MyClass
        MyClass obj1  = new MyClass();
        MyClass obj2  = new MyClass();
        obj1.nonStaticVariable = 30;  // Setting value for nonstatic varibale
        obj1.STATICVARIABLE = 40; //Setting value for static variable       
        obj2.nonStaticVariable = 50;
        obj2.STATICVARIABLE = 60;

        // Print the values actually set for static and non-static variables.
        System.out.println(obj1.STATICVARIABLE);
        System.out.println(obj1.nonStaticVariable);
        System.out.println(obj2.STATICVARIABLE);
        System.out.println(obj2.nonStaticVariable);
    }
}
```
Result:
```
60
30
60
50
```

Now you can see value of the static variable printed 60 both the times, as both obj1 and obj2 were referring to the same variable. With the non-static variable, the outputs differ, as each object when created keeps its own copy of non-static variable; changes made to them do not impact on the other copy of the variable created by another object.





## 
# Operators
[Previous](../01_Hello_world/hello_world.md) Hello World

[Next](../03_Operators/operators.md) Operators
