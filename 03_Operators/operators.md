[Previous](../02_Variables/variables.md) Variables

[Next](../04_Control_flow/control_flow.md) Control Flow

* [Operators in Java](./operators.md)
	
  ## JAVA OPERATORS
  
  
  
  
  Operators are used to perform operations on variables and values.
  
  ```Java divides the operators into the following groups:```
 

***1)Arithmetic operators***


***2)Assignment operators***


***3)Comparison operators***



***4)Logical operators***



***5)Bitwise operators***


***6)Shift operator***


***7)Instanceof operator***


***8)Ternary operator***

  
  
# Arithmetic Operators


***They are used to perform simple arithmetic operations on primitive data types.***


| Operator   |	Meaning of Operator |
| --------- | -------------------- |
| +	  | 	addition or unary plus |
| -	 |  	subtraction or unary minus     |
| *	 |  	multiplication     |
| /   |       	Tedivision     |
| %	  |      remainder after division (modulo division)     |
| ++	  | 	increment(value of the variable increases by 1) |
| -- |  	decrement(value of the variable decreses by 1)     |

***Example for Addition(+)-:***

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

*Output*

```
num1 = 10
num2 = 20
The sum = 30

```
**Subtraction(-)**

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

*Output-*
```
num1 = 20
num2 = 10
Subtraction = 10

```

**Multiplication(*)**

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

*Output*
```
num1 = 20
num2 = 10
Multiplication = 200

```
**Division(/)**

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

*Output-*

```
num1 = 20
num2 = 10
Division = 2

```

**Modulus(%)**

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

*Output-*

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


***Examples-:**

**(=) operator**

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

*Output-*

```
num is assigned: 5
name is assigned: Shivangi Singh

```
**(+ =) operator**

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

*Output*
```
num1 = 10
num2 = 20
num1 = 30

```

**( - = )operator**

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

*Output*

```

num1 = 10
num2 = 20
num1 = -10

```

 **(* =) operator **
 
 ```c 
 
 // Java code to illustrate "*="

import java.io.*;

class Assignment {
	public static void main(String[] args)
	{

		// Declaring variables
		int num1 = 10, num2 = 20;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Multiplying & Assigning values
		num1 *= num2;

		// Displaying the assigned values
		System.out.println("num1 = " + num1);
	}
}

```

*Output *

```
num1 = 10
num2 = 20
num1 = 200

```

**(/=) operator:** 

```c

// Java code to illustrate "/="

import java.io.*;

class Assignment {
	public static void main(String[] args)
	{

		// Declaring variables
		int num1 = 20, num2 = 10;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Dividing & Assigning values
		num1 /= num2;

		// Displaying the assigned values
		System.out.println("num1 = " + num1);
	}
}

```

**(%=) operator: **

```c

// Java code to illustrate "%="

import java.io.*;

class Assignment {
	public static void main(String[] args)
	{

		// Declaring variables
		int num1 = 5, num2 = 3;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Moduling & Assigning values
		num1 %= num2;

		// Displaying the assigned values
		System.out.println("num1 = " + num1);
	}
}

```

*Output*

```

num1 = 5
num2 = 3
num1 = 2

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
 
 
 
 **‘Equal to’ operator (==)**
 
 ```c
 
 // Java Program to Illustrate equal to Operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		int var1 = 5, var2 = 10, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2 and
		// printing corresponding boolean value
		System.out.println("var1 == var2: "
						+ (var1 == var2));

		// Comparing var1 and var3 and
		// printing corresponding boolean value
		System.out.println("var1 == var3: "
						+ (var1 == var3));
	}
}

```

*Output*

```

Var1 = 5
Var2 = 10
Var3 = 5
var1 == var2: false
var1 == var3: true

```

**‘Not equal to’ Operator(!=)**

```c

// Java Program to Illustrate No- equal-to Operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		int var1 = 5, var2 = 10, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2 and
		// printing corresponding boolean value
		System.out.println("var1 == var2: "
						+ (var1 != var2));

		// Comparing var1 and var3 and
		// printing corresponding boolean value
		System.out.println("var1 == var3: "
						+ (var1 != var3));
	}
}

```

*Output*

```
Var1 = 5
Var2 = 10
Var3 = 5
var1 == var2: true
var1 == var3: false

```

**‘Greater than’ operator(>)**

```c

// Java code to Illustrate Greater than operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		int var1 = 30, var2 = 20, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2 and
		// printing corresponding boolean value
		System.out.println("var1 > var2: " + (var1 > var2));

		// Comparing var1 and var3 and
		// printing corresponding boolean value
		System.out.println("var3 > var1: "
						+ (var3 >= var1));
	}
}

```

*Output*

```
Var1 = 30
Var2 = 20
Var3 = 5
var1 > var2: true
var3 > var1: false

```

**‘Less than’ Operator(<)**

```c

// Java code to Illustrate Less than Operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		int var1 = 10, var2 = 20, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2 and
		// printing corresponding boolean value
		System.out.println("var1 < var2: " + (var1 < var2));

		// Comparing var2 and var3 and
		// printing corresponding boolean value
		System.out.println("var2 < var3: " + (var2 < var3));
	}
}

```

*Output*

```
Var1 = 10
Var2 = 20
Var3 = 5
var1 < var2: true
var2 < var3: false

```
**Greater than or equal to (>=)**

```c
// Java Program to Illustrate Greater than or equal to
// Operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		int var1 = 20, var2 = 20, var3 = 10;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2 and
		// printing corresponding boolean value
		System.out.println("var1 >= var2: "
						+ (var1 >= var2));

		// Comparing var2 and var3 and
		// printing corresponding boolean value
		System.out.println("var2 >= var3: "
						+ (var3 >= var1));
	}
}

```

*Output*

```
Var1 = 20
Var2 = 20
Var3 = 10
var1 >= var2: true
var2 >= var3: false

```

**Less than or equal to (<=)**

```c

// Java Program to Illustrate Less
// than or equal to operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		int var1 = 10, var2 = 10, var3 = 9;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2 and
		// printing corresponding boolean value
		System.out.println("var1 <= var2: "
						+ (var1 <= var2));

		// Comparing var2 and var3 and
		// printing corresponding boolean value
		System.out.println("var2 <= var3: "
						+ (var2 <= var3));
	}
}

```

*Output*

```
Var1 = 10
Var2 = 10
Var3 = 9
var1 <= var2: true
var2 <= var3: false

```

**program that implements all relational operators in Java for user input:**

```c
import java.util.Scanner;

public class RelationalOperators {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//System.out.println("Enter first number: ");
// int num1 = scan.nextInt();
	
// System.out.println("Enter second number: ");
// int num2 = scan.nextInt();
	
	int num1 =1;
	int num2 = 2;
	
	
	System.out.println("num1 > num2 is " + (num1 > num2));
	System.out.println("num1 < num2 is " + (num1 < num2));
	System.out.println("num1 >= num2 is " + (num1 >= num2));
	System.out.println("num1 <= num2 is " + (num1 <= num2));
	System.out.println("num1 == num2 is " + (num1 == num2));
	System.out.println("num1 != num2 is " + (num1 != num2));
}
}

```

*Output*

```
num1 > num2 is false
num1 < num2 is true
num1 >= num2 is false
num1 <= num2 is true
num1 == num2 is false
num1 != num2 is true
```

## Java Logical Operators

You can also test for ```true or false``` values with logical operators.

Logical operators are used to determine the logic between variables or values:

|Operator	 |Meaning					 |		Example |
| ----------- | ----------------- | ---------------- |
| &&	 |	Logical AND. | If c = 5 and d = 2 then, expression ((c==5) && (d>5)) equals to FALSE. 
| &#124;&#124;	 |	Logical OR. | 	If c = 3 and d = 4 then, expression ((c==3) || (d>3)) equals to TRUE. |
| !	 |	Logical NOT. | If c = 5 then, expression !(c==5) equals to TRUE. |


**Logical ‘AND’ Operator (&&)** 

```c

// Java code to illustrate
// logical AND operator

import java.io.*;

class Logical {
	public static void main(String[] args)
	{
		// initializing variables
		int a = 10, b = 20, c = 20, d = 0;

		// Displaying a, b, c
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);
		System.out.println("Var3 = " + c);

		// using logical AND to verify
		// two constraints
		if ((a < b) && (b == c)) {
			d = a + b + c;
			System.out.println("The sum is: " + d);
		}
		else
			System.out.println("False conditions");
	}
}

```

*Output*

```
Var1 = 10
Var2 = 20
Var3 = 20
The sum is: 50

```

**Logical ‘OR’ Operator (||)** 

```c

// Java code to illustrate
// logical OR operator

import java.io.*;

class Logical {
	public static void main(String[] args)
	{
		// initializing variables
		int a = 10, b = 1, c = 10, d = 30;

		// Displaying a, b, c
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);
		System.out.println("Var3 = " + c);
		System.out.println("Var4 = " + d);

		// using logical OR to verify
		// two constraints
		if (a > b || c == d)
			System.out.println("One or both + the conditions are true");
		else
			System.out.println("Both the + conditions are false");
	}
}

```

*Output*

```
Var1 = 10
Var2 = 1
Var3 = 10
Var4 = 30
One or both + the conditions are true

```

**Logical ‘NOT’ Operator (!)**

```c

// Java code to illustrate
// logical NOT operator
import java.io.*;

class Logical {
	public static void main(String[] args)
	{
		// initializing variables
		int a = 10, b = 1;

		// Displaying a, b, c
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);

		// Using logical NOT operator
		System.out.println("!(a < b) = " + !(a < b));
		System.out.println("!(a > b) = " + !(a > b));
	}
}

```

*Output*

```
Var1 = 10
Var2 = 1
!(a < b) = true
!(a > b) = false

```

 **Implementing all logical operators on Boolean values (By default values – TRUE or FALSE)**
 
 ```c
 
 public class LogicalOperators {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("a && b: " + (a && b));
		System.out.println("a || b: " + (a || b));
		System.out.println("!a: " + !a);
		System.out.println("!b: " + !b);
	}
}

```

*Output*

```
a: true
b: false
a && b: false
a || b: true
!a: false
!b: true

```

## Bitwise Operators

| Operator |	Name	|	Example |
| --------- | --------- | ---------- |
 |&|	Bitwise AND operator	 |	returns bit by bit AND of input values 
 || |Bitwise OR operator	 |	returns bit by bit OR of input values 
 |^ |	 Bitwise XOR operator	 |	returns bit-by-bit XOR of input values 
 |~	 |Bitwise Complement Operator |	 This is a unary operator which returns the one’s complement representation of the input value, i.e., with all bits inverted.
 
 
  **Bitwise OR (|)** 
  
  ```
  a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise OR Operation of 5 and 7
  0101
| 0111
 ________
  0111  = 7 (In decimal)
  
  ```
  
  **Bitwise AND (&)**
  
  ```
  a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise AND Operation of 5 and 7
  0101
& 0111
 ________
  0101  = 5 (In decimal) 
  
  ```
  
  **Bitwise XOR (^)** 
  
  ```
  a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise XOR Operation of 5 and 7
  0101
^ 0111
 ________
  0010  = 2 (In decimal) 
  
  ```
  
  **Bitwise Complement (~)**
  
  ```a = 5 = 0101 (In Binary)

Bitwise Complement Operation of 5

~ 0101
 ________
  1010  = 10 (In decimal) 
  
  ```
  
```
Note: Compiler will give 2’s complement of that number, i.e., 2’s complement of 10 will be -6.
```

```c

// Java program to illustrate
// bitwise operators

public class operators {
	public static void main(String[] args)
	{
		// Initial values
		int a = 5;
		int b = 7;

		// bitwise and
		// 0101 & 0111=0101 = 5
		System.out.println("a&b = " + (a & b));

		// bitwise or
		// 0101 | 0111=0111 = 7
		System.out.println("a|b = " + (a | b));

		// bitwise xor
		// 0101 ^ 0111=0010 = 2
		System.out.println("a^b = " + (a ^ b));

		// bitwise not
		// ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
		// will give 2's complement (32 bit) of 5 = -6
		System.out.println("~a = " + ~a);

		// can also be combined with
		// assignment operator to provide shorthand
		// assignment
		// a=a&b
		a &= b;
		System.out.println("a= " + a);
	}
}

```

*Output*

```
a&b = 5
a|b = 7
a^b = 2
~a = -6
a= 5

```

```c
// Demonstrating the bitwise logical operators


class GFG {
	public static void main (String[] args) {
	
		String binary[]={
		"0000","0001","0010","0011","0100","0101",
		"0110","0111","1000","1001","1010",
		"1011","1100","1101","1110","1111"
		};
	
	// initializing the values of a and b
	int a=3; // 0+2+1 or 0011 in binary
	int b=6; // 4+2+0 or 0110 in binary
	
	// bitwise or
	int c= a | b;
	
	// bitwise and
	int d= a & b;
	
	// bitwise xor
	int e= a ^ b;
	
	// bitwise not
	int f= (~a & b)|(a &~b);
	int g= ~a & 0x0f;
	
	
	System.out.println(" a= "+binary[a]);
	System.out.println(" b= "+binary[b]);
	System.out.println(" a|b= "+binary);
	System.out.println(" a&b= "+binary[d]);
	System.out.println(" a^b= "+binary[e]);
	System.out.println("~a & b|a&~b= "+binary[f]);
	System.out.println("~a= "+binary[g]);
	}
}

```

*Output*

```
a= 0011
 b= 0110
 a|b= 0111
 a&b= 0010
 a^b= 0101
~a & b|a&~b= 0101
~a= 1100

```

**program to implement all Bitwise operators in java for user input**

```c
import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = input.nextInt();

		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		System.out.println("Bitwise AND: " + (num1 & num2));
		System.out.println("Bitwise OR: " + (num1 | num2));
		System.out.println("Bitwise XOR: " + (num1 ^ num2));
		System.out.println("Bitwise NOT: " + (~num1));
		System.out.println("Bitwise Left Shift: " + (num1 << 2));
		System.out.println("Bitwise Right Shift: " + (num1 >> 2));
		System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));

		input.close();
	}
}

```

*Output*

```
This program prompts the user to enter two numbers, num1 and num2. It then performs the following bitwise operations using the &, |, ^, ~, <<, >>, and >>> operators:

Bitwise AND
Bitwise OR
Bitwise XOR
Bitwise NOT
Bitwise Left Shift
Bitwise Right Shift
Bitwise Zero Fill Right Shift

The results of these operations are printed to the console

```
*The advantages of using Bitwise Operators in Java are:*

1)**Speed** : Bitwise operations are much faster than arithmetic operations as they operate directly on binary representations of numbers.



2)**Space Optimization** : Bitwise operations can be used to store multiple values in a single variable, which can be useful when working with limited memory.



3)**Bit Manipulation** : Bitwise operators allow for precise control over individual bits of a number, which can be useful in various applications such as cryptography, error detection, and compression.




4)**Code Simplification**: Bitwise operations can simplify the code by reducing the number of conditional statements and loops required to perform certain tasks.


5)**Improved Readability** : Bitwise operations can make the code more readable by encapsulating complex logic into a single operation, making the code easier to understand and maintain.





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


**Signed Left Shift Operator in Java(<<)**

```c
// Java Program to demonstrate
// Signed Left-Shift Operator

// Importing required classes
import java.io.*;

// Main class
class GFG {

	// main driver method
	public static void main(String[] args)
	{
		int number = 2;

		// 2 bit left shift operation
		int Ans = number << 2;

		System.out.println(Ans);
	}
}

```

*Output*

```
8

```
**Signed Right Shift Operator in Java( >> )**

```c

// Java program to demonstrate
// the Signed right shift operator
import java.io.*;

class GFG
	{
	public static void main (String[] args) {
		{		
		int number = 8;
	
		// 2 bit signed right shift
		int Ans = number >> 2;
	
		System.out.println(Ans);
		}
	}
}
```

*Output*

```
the binary number 1000 (in decimal 8) becomes 0010 after shifting the bits to the right (in decimal 2).

```

**Unsigned Right Shift Operator in Java( >>>)**

```c

// Java program to demonstrate
// the Unsigned right shift operator
import java.io.*;

class GFG
	{
	public static void main (String[] args)
	{
		byte num1 = 8;
		byte num2 = -8;
	
		System.out.println(num1 >>> 2);
		System.out.println(num2 >>> 2);
	}
}

```

Output

```
2
1073741822
```

```
Note: For negative bits, the signed and unsigned right shift operators provide different results.
```

 ## Instanceof operator
 
 The instance of the operator is used for type checking.
 
 It can be used to test if an object is an instance of a class, a subclass, or an interface.
 
 *Format-*
 
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

Examples-

```c

// Java program to find largest among two
// numbers using ternary operator

import java.io.*;

class Ternary {
	public static void main(String[] args)
	{

		// variable declaration
		int n1 = 5, n2 = 10, max;

		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);

		// Largest among n1 and n2
		max = (n1 > n2) ? n1 : n2;

		// Print the largest number
		System.out.println("Maximum is = " + max);
	}
}

```

Output

```
First num: 5
Second num: 10
Maximum is = 10

```
**Implementing ternary operator on Boolean values-**

```c
public class TernaryOperatorExample {
	public static void main(String[] args)
	{
		boolean condition = true;
		String result = (condition) ? "True" : "False";
		System.out.println(result);
	}
}

```

Output

```
True

```
## Advantages of ternary operator

1)**Compactness**: The ternary operator allows you to write simple if-else statements in a much more concise way, making the code easier to read and maintain.


2)**Improved readability** : When used correctly, the ternary operator can make the code more readable by making it easier to understand the intent behind the code.


3)**Increased performance** : Since the ternary operator evaluates a single expression instead of executing an entire block of code, it can be faster than an equivalent if-else statement.


4)**Simplification of nested if-else statements** : The ternary operator can simplify complex logic by providing a clean and concise way to perform conditional assignments.


5)**Easy to debug** : If a problem occurs with the code, the ternary operator can make it easier to identify the cause of the problem because it reduces the amount of code that needs to be examined.

*NOTE*

```
It’s worth noting that the ternary operator is not a replacement for all if-else statements. 
For complex conditions or logic, 
it’s usually better to use an if-else statement to avoid making the code more difficult to understand.

```
In the next section we'll be diving into the topic of control flow in Java.....


#
[Previous](../02_Variables/variables.md) Variables

[Next](../04_Control_flow/control_flow.md) Control Flow
