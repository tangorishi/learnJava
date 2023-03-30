
# Strings in JAVA 

Strings are used for storing text.

A String variable contains a collection of characters surrounded by double quotes:
```c
String greeting = "Hello";
```

## String Length

A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

```c
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```

## More String Methods

There are many string methods available, for example toUpperCase() and toLowerCase():

```c
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
```

## Finding a Character in a String

The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

```c
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```

## String Concatenation

The + operator can be used between strings to combine them. This is called concatenation:

```c
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
```

You can also use the concat() method to concatenate two strings:

```c
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
```

**Java uses the + operator for both addition and concatenation.**
**Numbers are added. Strings are concatenated.**

*If you add two numbers, the result will be a number:*

```c
int x = 10;
int y = 20;
int z = x + y;  // z will be 30 (an integer/number)
```

*If you add two strings, the result will be a string concatenation:*

```c
String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)
```


