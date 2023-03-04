[Previous](../02_Variables/variables.md) Variables

[Next](../04_Control_flow/control_flow.md) Control Flow

* [Operators in Java](./operators.md)
	
  **JAVA OPERATORS**
  
  
  
  
  Operators are used to perform operations on variables and values.
  
  ```Java divides the operators into the following groups:```
 

1)Arithmetic operators


2)Assignment operators


3)Comparison operators



4)Logical operators



5)Bitwise operators


6)Shift operator


7)Instanceof operator


8)Ternary operator

  
  
# Arithmetic Operators


They are used to perform simple arithmetic operations on primitive data types. 


| Operator   |	Meaning of Operator |
| --------- | -------------------- |
| +	  | 	addition or unary plus |
| -	 |  	subtraction or unary minus     |
| *	 |  	multiplication     |
| /   |       	Tedivision     |
| %	  |      remainder after division (modulo division)     |
| ++	  | 	increment(value of the variable increases by 1) |
| -- |  	decrement(value of the variable decreses by 1)     |

Example for Addition(+)-

```c
// Java code to illustrate Addition operator

import java.io.*;

class Addition {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 10, num2 = 20, sum = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// adding num1 and num2
		sum = num1 + num2;
		System.out.println("The sum = " + sum);
	}
}

```

Output

```
num1 = 10
num2 = 20
The sum = 30

```
Subtraction(-)

```c
// Java code to illustrate Subtraction operator

import java.io.*;

class Subtraction {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 20, num2 = 10, sub = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// subtracting num1 and num2
		sub = num1 - num2;
		System.out.println("Subtraction = " + sub);
	}
}


```

Output-
```
num1 = 20
num2 = 10
Subtraction = 10

```

Multiplication(*)

```c

// Java code to illustrate Multiplication operator

import java.io.*;

class Multiplication {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 20, num2 = 10, mult = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Multiplying num1 and num2
		mult = num1 * num2;
		System.out.println("Multiplication = " + mult);
	}
}

```

Output
```
num1 = 20
num2 = 10
Multiplication = 200

```
Division(/)
```c

// Java code to illustrate Division operator

import java.io.*;

class Division {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 20, num2 = 10, div = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Dividing num1 and num2
		div = num1 / num2;
		System.out.println("Division = " + div);
	}
}

```

Output-

```
num1 = 20
num2 = 10
Division = 2

```

Modulus(%)

```c


// Java code to illustrate Modulus operator

import java.io.*;

class Modulus {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 5, num2 = 2, mod = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Remaindering num1 and num2
		mod = num1 % num2;
		System.out.println("Remainder = " + mod);
	}
}

```

Output-

```
num1 = 5
num2 = 2
Remainder = 1

```




## Assignment Operators

Assignment operators are used to assign values to variables.

1) operator (=) to assign the value 10 to a variable called x:


```c
int x = 10;
```

2)addition assignment operator (+=) adds a value to a variable:

```c
int x = 10;
x += 5;
```

| Operator   |	Example | Same as
| --------- | -------------------- | ------------ |
| =	  | x = 5	 |x = 5
| += |   x += 3   |x = x + 3
| -= |  	x - = 3    |x = x - 3	
| * =  |       	x * = 3   |x = x * 3	
| /=  |      x /= 3    |x = x / 3	
| %=  | 	x %= 3 |x = x % 3
| &=  |  	x &= 3     |x = x & 3	
| |= | 	x |= 3 |x = x | 3
| ^=	 |  	x ^= 3     |x = x ^ 3	
| >>=	 |  x >>= 3	     |x = x >> 3	
| <<=  |    x <<= 3    |x = x << 3


Example

= operator

```c
// Java code to illustrate "=" operator

import java.io.*;

class Assignment {
	public static void main(String[] args)
	{
		// Declaring variables
		int num;
		String name;

		// Assigning values
		num = 5;
		name = "Shivangi Singh";

		// Displaying the assigned values
		System.out.println("num is assigned: " + num);
		System.out.println("name is assigned: " + name);
	}
}

```

Output-

```
num is assigned: 5
name is assigned: Shivangi Singh

```
+= operator

```c

// Java code to illustrate "+="

import java.io.*;

class Assignment {
	public static void main(String[] args)
	{

		// Declaring variables
		int num1 = 10, num2 = 20;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Adding & Assigning values
		num1 += num2;

		// Displaying the assigned values
		System.out.println("num1 = " + num1);
	}
}

```

Output
```
num1 = 10
num2 = 20
num1 = 30

```

-= operator

```c

// Java code to illustrate "-="

import java.io.*;

class Assignment {
	public static void main(String[] args)
	{

		// Declaring variables
		int num1 = 10, num2 = 20;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Subtracting & Assigning values
		num1 -= num2;

		// Displaying the assigned values
		System.out.println("num1 = " + num1);
	}
}

```

Output-

```

num1 = 10
num2 = 20
num1 = -10

```



## Java Comparison Operators

Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

The return value of a comparison is either true or false. 


These values are known as Boolean values


**we use the greater than operator (>) to find out if 5 is greater than 3:**

```c

int x = 5;
int y = 3;
System.out.println(x > y); // returns true, because 5 is higher than 3

```
| Operator |	Name	|	Example |
| --------- | --------- | ---------- |
 |=	=|	equal to	 |	x == y |
 |! =	 |not equal to	 |	x != y |
 |>	 |	greater than	 |	x > y |
 |<	 |	less than	 |	x < y |
 |>= |	Greater than or equal to	 |	x >= y |
 |< = |	Less than or equal to	 |		x <= y |

## Java Logical Operators

You can also test for ```true or false``` values with logical operators.

Logical operators are used to determine the logic between variables or values:

|Operator	 |Meaning					 |		Example |
| ----------- | ----------------- | ---------------- |
| &&	 |	Logical AND. | If c = 5 and d = 2 then, expression ((c==5) && (d>5)) equals to FALSE. 
| &#124;&#124;	 |	Logical OR. | 	If c = 3 and d = 4 then, expression ((c==3) || (d>3)) equals to TRUE. |
| !	 |	Logical NOT. | If c = 5 then, expression !(c==5) equals to TRUE. |

## Bitwise Operators

| Operator |	Name	|	Example |
| --------- | --------- | ---------- |
 |&|	Bitwise AND operator	 |	returns bit by bit AND of input values 
 || |Bitwise OR operator	 |	returns bit by bit OR of input values 
 |^ |	 Bitwise XOR operator	 |	returns bit-by-bit XOR of input values 
 |~	 |Bitwise Complement Operator |	 This is a unary operator which returns the one’s complement representation of the input value, i.e., with all bits inverted.



## Shift Operators

These operators are used to shift the bits of a number left or right, thereby multiplying or dividing the number by two, respectively. They can be used when we have to multiply or divide a number by two

```<<, Left shift operator```
shifts the bits of the number to the left and fills 0 on voids left as a result. 

Similar effect as multiplying the number with some power of two.

```>>, Signed Right shift operator```
shifts the bits of the number to the right and fills 0 on voids left as a result. 


The leftmost bit depends on the sign of the initial number.


Similar effect as dividing the number with some power of two.


```>>>, Unsigned Right shift operator```
shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.

 ## Instanceof operator
 
 The instance of the operator is used for type checking.
 
 It can be used to test if an object is an instance of a class, a subclass, or an interface.
 
 Format-
 ```object instance of class/subclass/interface```
```c

// Java program to illustrate
// instance of operator
class operators {
	public static void main(String[] args)
	{

		Person obj1 = new Person();
		Person obj2 = new Boy();

		// As obj is of type person, it is not an
		// instance of Boy or interface
		System.out.println("obj1 instanceof Person: "
						+ (obj1 instanceof Person));
		System.out.println("obj1 instanceof Boy: "
						+ (obj1 instanceof Boy));
		System.out.println("obj1 instanceof MyInterface: "
						+ (obj1 instanceof MyInterface));

		// Since obj2 is of type boy,
		// whose parent class is person
		// and it implements the interface Myinterface
		// it is instance of all of these classes
		System.out.println("obj2 instanceof Person: "
						+ (obj2 instanceof Person));
		System.out.println("obj2 instanceof Boy: "
						+ (obj2 instanceof Boy));
		System.out.println("obj2 instanceof MyInterface: "
						+ (obj2 instanceof MyInterface));
	}
}

class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}

```

Output
```
obj1 instanceof Person: true
obj1 instanceof Boy: false
obj1 instanceof MyInterface: false
obj2 instanceof Person: true
obj2 instanceof Boy: true
obj2 instanceof MyInterface: true
```

## Ternary operator

Ternary operator is a shorthand version of the if-else statement. It has three operands and hence the name ternary

```
condition ? if true : if false
```

```c
// Java program to illustrate
// max of three numbers using
// ternary operator.
public class operators {
	public static void main(String[] args)
	{
		int a = 20, b = 10, c = 30, result;

		// result holds max of three
		// numbers
		result
			= ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		System.out.println("Max of three numbers = "
						+ result);
	}
}
```
Output-
```
Max of three numbers = 30
```







#
[Previous](../02_Variables/variables.md) Variables

[Next](../04_Control_flow/control_flow.md) Control Flow
