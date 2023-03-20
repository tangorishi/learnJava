[Previous](../06_Arrays/Arrays.md) Arrays

[Next](../08_Strings/strings.md) Strings


* [Lists](./lists.md)
	* [Lists in Java](./lists.md#lists-in-java)
	* [Creating Lists](./lists.md#creating-lists)
	* [Convert Array to List](./lists.md#convert-array-to-list)
	* [Convert List to Array](./lists.md#convert-list-to-array)
	* [Sort List](./lists.md#sort-list)
	* [Adding elements to List class](./lists.md#adding-elements-to-list-class)
	* [Updating elements](./lists.md#updating-elements)
	* [Searching for elements](./lists.md#searching-for-elements)
	* [Removing elements](./lists.md#removing-elements)

## Lists in Java
 
The List interface in Java provides a way to store the ordered collection. It is a child interface of Collection. It is an ordered collection of objects in which duplicate values can be stored. Since List preserves the insertion order, it allows positional access and insertion of elements. 

The List interface is found in java.util package and inherits the Collection interface. It is a factory of ListIterator interface. Through the ListIterator, we can iterate the list in forward and backward directions. The implementation classes of the List interface are ArrayList, LinkedList, Stack, and Vector. ArrayList and LinkedList are widely used in Java programming. The Vector class is deprecated since Java 5.



## Creating Lists

The ArrayList and LinkedList classes provide the implementation of List interface. Let's see the examples to create the List:

```c
//Creating a List of type String using ArrayList  
List<String> list=new ArrayList<String>();  
  
//Creating a List of type Integer using ArrayList  
List<Integer> list=new ArrayList<Integer>();  
  
//Creating a List of type Book using ArrayList  
List<Book> list=new ArrayList<Book>();  
  
//Creating a List of type String using LinkedList  
List<String> list=new LinkedList<String>();  
```

In short, you can create the List of any type. The ArrayList<T> and LinkedList<T> classes are used to specify the type. Here, T denotes the type.


## Convert Array to List

We can convert the Array to List by traversing the array and adding the element in list one by one using list.add() method. Let's see a simple example to convert array elements into List.

```c
import java.util.*;  
public class ArrayToListExample{  
public static void main(String args[]){  
//Creating Array  
String[] array={"Java","Python","PHP","C++"};  
System.out.println("Printing Array: "+Arrays.toString(array));  
//Converting Array to List  
List<String> list=new ArrayList<String>();  
for(String lang:array){  
list.add(lang);  
}  
System.out.println("Printing List: "+list);  
  
}  
} 
```

Output:

```
Printing Array: [Java, Python, PHP, C++]
Printing List: [Java, Python, PHP, C++]
```

## Convert List to Array

We can convert the List to Array by calling the list.toArray() method. Let's see a simple example to convert list elements into array.

```c
import java.util.*;  
public class ListToArrayExample{  
public static void main(String args[]){  
 List<String> fruitList = new ArrayList<>();    
 fruitList.add("Mango");    
 fruitList.add("Banana");    
 fruitList.add("Apple");    
 fruitList.add("Strawberry");    
 //Converting ArrayList to Array  
 String[] array = fruitList.toArray(new String[fruitList.size()]);    
 System.out.println("Printing Array: "+Arrays.toString(array));  
 System.out.println("Printing List: "+fruitList);  
}  
}
```
Output:

```
Printing Array: [Mango, Banana, Apple, Strawberry]
Printing List: [Mango, Banana, Apple, Strawberry]
```

## Sort List

There are various ways to sort the List, here we are going to use Collections.sort() method to sort the list element. The java.util package provides a utility class **Collections** which has the static method sort(). Using the ```Collections.sort()``` method, we can easily sort any List.

```c
import java.util.*;  
class SortArrayList{  
 public static void main(String args[]){  
  //Creating a list of fruits  
  List<String> list1=new ArrayList<String>();  
  list1.add("Mango");  
  list1.add("Apple");  
  list1.add("Banana");  
  list1.add("Grapes");  
  //Sorting the list  
  Collections.sort(list1);  
   //Traversing list through the for-each loop  
  for(String fruit:list1)  
    System.out.println(fruit);  
      
 System.out.println("Sorting numbers...");  
  //Creating a list of numbers  
  List<Integer> list2=new ArrayList<Integer>();  
  list2.add(21);  
  list2.add(11);  
  list2.add(51);  
  list2.add(1);  
  //Sorting the list  
  Collections.sort(list2);  
   //Traversing list through the for-each loop  
  for(Integer number:list2)  
    System.out.println(number);  
 }  
   
}  
```

Output:

```
Apple
Banana
Grapes
Mango
Sorting numbers...
1
11
21
51
```


## Operations in a List interface

Since List is an interface, it can be used only with a class that implements this interface. Now, let’s see how to perform a few frequently used operations on the List.  

1) Operation 1: Adding elements to List class using add() method


2) Operation 2: Updating elements in List class using set() method


3) Operation 3: Searching for elements using indexOf(), lastIndexOf, contains() methods


4) Operation 4: Removing elements using remove() method


## Adding elements to List class

In order to add an element to the list, we can use the add() method. This method is overloaded to perform multiple operations based on different parameters.

**Parameters**

**add(Object)**: This method is used to add an element at the end of the List.

**add(int index, Object)**: This method is used to add an element at a specific index in the List


Example

```c

// Java Program to Add Elements to a List

// Importing all utility classes
import java.util.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List interface
		// Custom elements
		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "For");

		// Print all the elements inside the
		// List interface object
		System.out.println(al);
	}
}

```

Output

```
[Geeks, For, Geeks]

```

##  Updating elements

After adding the elements, if we wish to change the element, it can be done using the set() method. Since List is indexed, the element which we wish to change is referenced by the index of the element. Therefore, this method takes an index and the updated element which needs to be inserted at that index. 

Example:

```c

// Java Program to Update Elements in a List

// Importing utility classes
import java.util.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an object of List interface
		List<String> al = new ArrayList<>();

		// Adding elements to object of List class
		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "Geeks");

		// Display theinitial elements in List
		System.out.println("Initial ArrayList " + al);

		// Setting (updating) element at 1st index
		// using set() method
		al.set(1, "For");

		// Print and display the updated List
		System.out.println("Updated ArrayList " + al);
	}
}

```

Output

```c

Initial ArrayList [Geeks, Geeks, Geeks]
Updated ArrayList [Geeks, For, Geeks]

```

## Searching for elements

Searching for elements in the List interface is a common operation in Java programming. The List interface provides several methods to search for elements, such as the indexOf(), lastIndexOf(), and contains() methods.


The ```indexOf()``` method returns the index of the first occurrence of a specified element in the list, while the lastIndexOf() method returns the index of the last occurrence of a specified element.


The ```contains()``` method returns true if the list contains the specified element, and false otherwise. These methods allow for quick and easy searching of elements in a list and enable efficient operations on them.


Parameters:

 ```indexOf(element)```: Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found      
 
 
 ```lastIndexOf(element)```: Returns the index of the last occurrence of the specified element in the list, or -1 if the element is not found
 
 
 ```contains(element)```: Returns true if the list contains the specified element.


Example 

```c

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		// create a list of integers
		List<Integer> numbers = new ArrayList<>();

		// add some integers to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);

		// use indexOf() to find the first occurrence of an element in the list
		int index = numbers.indexOf(2);
		System.out.println("The first occurrence of 2 is at index " + index);

		// use lastIndexOf() to find the last occurrence of an element in the list
		int lastIndex = numbers.lastIndexOf(2);
		System.out.println("The last occurrence of 2 is at index " + lastIndex);

		// use contains() to check if the list contains a specific element
		boolean containsTwo = numbers.contains(2);
		System.out.println("The list contains 2: " + containsTwo);
	}
}

```

Output

```
The first occurrence of 2 is at index 1
The last occurrence of 2 is at index 3
The list contains 2: true

```

## Removing Elements

In order to remove an element from a list, we can use the remove() method. This method is overloaded to perform multiple operations based on different parameters. They are:

**Parameters**

```remove(Object)```: This method is used to simply remove an object from the List. If there are multiple such objects, then the first occurrence of the object is removed.


```remove(int index)```: Since a List is indexed, this method takes an integer value which simply removes the element present at that specific index in the List. After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.


Example

```c

// Java Program to Remove Elements from a List

// Importing List and ArrayList classes
// from java.util package
import java.util.ArrayList;
import java.util.List;

// Main class
class GFG {

	// Main driver method
	public static void main(String args[])
	{

		// Creating List class object
		List<String> al = new ArrayList<>();

		// Adding elements to the object
		// Custom inputs
		al.add("Geeks");
		al.add("Geeks");

		// Adding For at 1st indexes
		al.add(1, "For");

		// Print the initialArrayList
		System.out.println("Initial ArrayList " + al);

		// Now remove element from the above list
		// present at 1st index
		al.remove(1);

		// Print the List after removal of element
		System.out.println("After the Index Removal " + al);

		// Now remove the current object from the updated
		// List
		al.remove("Geeks");

		// Finally print the updated List now
		System.out.println("After the Object Removal "
						+ al);
	}
}

```


Output

```
Initial ArrayList [Geeks, For, Geeks]
After the Index Removal [Geeks, Geeks]
After the Object Removal [Geeks]

```

#
[Previous](../06_Loops/loops.md) Loops

[Next](../08_Strings/strings.md) Strings


