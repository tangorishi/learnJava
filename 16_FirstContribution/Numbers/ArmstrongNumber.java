import java.util.Scanner;

/**
 * This class contains code to check if a number is an Armstrong number (or Narcissistic number)
 * An Armstrong number (or Narcissistic number) is a number that is equal to the sum of its own digits
 * each raised to the power of the number of digits.
 * Example: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Initialize the scanner class to take input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter number to check if it is Armstrong or not : ");

        // Take input
        int num = sc.nextInt();

        // Check if number is armstrong and print the desired message
        if (checkArmstrong(num))
            System.out.println("This number is an Armstrong Number");
        else
            System.out.println("This number is not an Armstrong Number");
    }


    /**
     * This method checks if a number is Armstrong number (or Narcissistic number) or not
     *
     * @param number The number to check if Armstrong or not
     * @return true if the number is an armstrong number, otherwise false
     */
    public static boolean checkArmstrong(int number) {
        // Store the number in a temporary variable to be used in loop for condition
        int temp = number;

        // Stores the number of digits in the provided number
        int numberOfDigits = 0;

        // Counts the number of digits in the provided number
        // temp gets decreased inside the loop
        while (temp > 0) {
            // We increment number of digits by 1 since temp > 0
            numberOfDigits += 1;

            // "temp" will become 0 if all the digits are counted since it is an integer
            temp = temp / 10;
        }

        // Store the number in a temporary variable to be used in loop for condition
        temp = number;

        // Stores the sum of digits each to the power of "numberOfDigits"
        int sumOfPoweredDigits = 0;

        // Counts the number of digits in the provided number
        // temp gets decreased inside the loop
        while (temp > 0) {
            // Stores the last digit of a number
            int lastDigitOfNumber = temp % 10;

            // Add the last digit to the power "numberOfDigits" to the sum
            sumOfPoweredDigits += (int) Math.pow(lastDigitOfNumber, numberOfDigits);

            // Removes the last digit of the number
            temp = temp / 10;
        }

        // Return if the sum is equal to the original number
        return number == sumOfPoweredDigits;
    }
}
