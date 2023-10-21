// Java Program to Illustrate Autoboxing

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an empty Arraylist of integer type
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Adding the int primitives type values
		// using add() method
		// Autoboxing
		al.add(1);
		al.add(2);
		al.add(24);

		// Printing the ArrayList elements
		System.out.println("ArrayList: " + al);
	}
}
