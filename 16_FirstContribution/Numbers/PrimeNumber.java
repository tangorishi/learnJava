import java.util.Scanner;

/*
 * This program will determine if a number is prime or not.
 * A prime number is a number that is only divisible by 1 and itself.
 * Note: 1 is not a prime number.
 * Example: 2 is a prime number.
 * Example: 4 is not a prime number.
 */

public class PrimeNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input.
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is prime.
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    /**
     * This method will determine if a number is prime or not.
     * @param number The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        // If the number is 1, then it is not prime.
        if (number == 1)
            return false;

        // We loop for each divisor from 2 to square root(number) and check if there is no remainder.
        // If there is no remainder, then the number is not prime.
        // We can stop at square root(number) because after that, we will be checking the same divisors again.
        for (int i = 2; i < Math.sqrt(number); i++) {
            // If there is no remainder, then the number is not prime.
            if (number % i == 0)
                return false;
        }
        // If we get here, then the number is prime.
        return true;
    }
}
