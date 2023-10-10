import java.util.Scanner;

/**
 * This class contains code to check if a number is a Palindrome number
 * A Palindrome number is a number that is equal to the number formed by reversing the digits
 * Example: 121 is a Palindrome number because 121 reversed is 121.
 * Example: 123 is not a Palindrome number because 123 reversed is 321.
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number from the console
        int number = scanner.nextInt();

        // Check if the number is a Palindrome number
        if (checkPalindrome(number)) {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is not a Palindrome number");
        }
    }

    /**
     * This method checks if a number is a Palindrome number
     * @param number The number to be checked
     * @return true if the number is a Palindrome number, otherwise false
     **/
    public static boolean checkPalindrome(int number) {
        // Store the number in a temporary variable to be used in loop for condition
        int temp = number;

        // Stores the number formed by reversing the digits of the provided number
        int reversedNumber = 0;

        // Counts the number of digits in the provided number
        // temp gets decreased inside the loop
        while (temp > 0) {
            // We multiply the reversedNumber by 10 to shift the digits to the left
            // Example: 123 becomes 1230
            reversedNumber = reversedNumber * 10;

            // We add the last digit of the number to the reversedNumber
            // Example: 123 becomes 1230 + 3 = 1233
            reversedNumber = reversedNumber + temp % 10;

            // We divide the original number by 10 to remove the last digit
            // Example: 123 becomes 12
            temp = temp / 10;
        }

        // Return if the reversed number is equal to the original number
        return reversedNumber == number;
    }
}
