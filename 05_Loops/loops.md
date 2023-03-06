[Previous](../04_Control_structure/control_structure.md) Control Flow

[Next](../06_Arrays/arrays.md) Arrays

* [Loops](./loops.md#loops)
	* [While Loop](./loops.md#While-loop)
	* [For Loop](./loops.md#For-loop)
	* [Do while Loop](./loops.md#Do-while)
	* [Nested Loop](./loops.md#Nested-loop)
	* [Nested while Loop ](./loops.md#Nested-while)
	
	

# Loops

Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true. Java provides three ways for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.



Here are the types of loops in C:
* While loop
* For loop
* Do while loop
Nested loop
* Nested while
* Nested do while
* Nested while and for loop
 

## While loop

A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement. 


basic syntax of a while loop:

```C
while (boolean condition)
{
   loop statements...
}
```

Example:

```C
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	int i=0;
	while (i<=10)
	{
		System.out.println(i);
		i++;
	}
	}
}

```
Output
```
0
1
2
3
4
5
6
7
8
9
10

```

## for loop

for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping. 

Syntax:
```C
for (initialization condition; testing condition;increment/decrement)
{
    statement(s)
}
```

Example:

```c
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	for (int i=0;i<=10;i++)
	{
		System.out.println(i);
	}
	}
}

```
Output
```
0
1
2
3
4
5
6
7
8
9
10
```

## Do while

do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop. 

Syntax:
```C
do
{
    statements..
}
while (condition);
```
Example:

```c
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	int i=0;
	do
	{
		System.out.println(i);
		i++;
	}while(i<=10);
	}
}

```
Output
```
0
1
2
3
4
5
6
7
8
9
10
```

# Nested Loop

Nested loop means a loop statement inside another loop statement.

There are different combinations of loop using ```for loop```, ```while loop,``` ```do-while loop.```

## Nested for loop

```c

/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		for(int i = 0; i < 3; i++){
		for(int j = 0; j < 2; j++){
			System.out.println(i);
		}
		System.out.println();
		}
	}
}

```

Output
```
0
0

1
1

2
2
```

## Nested while loop

```c
import java.io.*;

class GFG {
	public static void main(String[] args)
	{
		int i = 1, j = 1;
		while (i <= 3) {
			while (j <= 3) {
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println("");
			j = 1;
		}
	}
}

```
Output
```
123
123
123
```

## Nested do while loop

```c
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main(String[] args)
	{

		int row = 1, column = 1;
		int x;
		do {
			x = 4;
			do {
				System.out.print("");
				x--;
			} while (x >= row);
			column = 1;
			do {
				System.out.print(column + " ");
				column++;

			} while (column <= 5);
			System.out.println(" ");
			row++;
		} while (row <= 5);
	}
}

```

Output
```
1 2 3 4 5  
1 2 3 4 5  
1 2 3 4 5  
1 2 3 4 5  
1 2 3 4 5  

```
## Nested while and for loop

```c
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main(String[] args)
	{

		int weeks = 3;
		int days = 7;
		int i = 1;

		// outer loop
		while (i <= weeks) {
			System.out.println("Week: " + i);

			// inner loop
			for (int j = 1; j <= days; ++j) {
				System.out.println(" Days: " + j);
			}
			++i;
		}
	}
}

```
Output

```
Week: 1
  Days: 1
  Days: 2
  Days: 3
  Days: 4
  Days: 5
  Days: 6
  Days: 7
Week: 2
  Days: 1
  Days: 2
  Days: 3
  Days: 4
  Days: 5
  Days: 6
  Days: 7
Week: 3
  Days: 1
  Days: 2
  Days: 3
  Days: 4
  Days: 5
  Days: 6
  Days: 7
  
 ```

 # Pitfalls of Java
 
 ```Infinite loop```
 
 One of the most common mistakes while implementing any sort of looping is that it may not ever exit, that is the loop runs for infinite time. This happens when the condition fails for some reason
 
 Example
 
 Infinite for loop
 
 ```c
 /*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main(String[] args)
	{
		for (;;) {
		}
	}
}

```
Infinite while loop

```c
//Java program to illustrate various pitfalls.
public class LooppitfallsDemo
{
	public static void main(String[] args)
	{

		// infinite loop because condition is not apt
		// condition should have been i>0.
		for (int i = 5; i != 0; i -= 2)
		{
			System.out.println(i);
		}
		int x = 5;

		// infinite loop because update statement
		// is not provided.
		while (x == 5)
		{
			System.out.println("In the loop");
		}
	}
}

```


 
[Previous](../04_Control_structure/control_structure.md) Control Flow

[Next](../06_Arrays/arrays.md) Arrays
