package 08_Strings;

import java.util.Scanner;

public class PalindromeChecker{

  //main() created, that will be recognised by compiler to initiate program execution
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in); // Scanner class object created to take user input from console
    System.out.print("Enter a word - ");
    String wrd = sc.next();
    if (isPalin(wrd) == true) // using function call (pass-by-value technique) to check palindrome validity
      System.out.println(wrd+" is a Palindrome word");
    else
      System.out.println(wrd+" is not a Palindrome word");
  }

  // user-defined function used to reduce code complexity and enhance readability
  private static boolean isPalin(String s){
    boolean flag = false; // using flag-variable concept to check for validity
    String rev = "";
    // reversing the word by travesing using reverse indexing
    for (int i = s.length() - 1; i >= 0; i--)  
      rev += Character.toString(s.charAt(i));
    // CONSTRAINT - CASE OF STRING WHILE CHECKING IS IGNORED
    if (rev.equalsIgnoreCase(s))
      flag = true;
    return flag; 
  }
}
    
