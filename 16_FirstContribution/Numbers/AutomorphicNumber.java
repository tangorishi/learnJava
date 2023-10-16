import java.util.Scanner;

/*
 * An automorphic number is a number whose square ends with the number itself.
 * For example, 5 is an automorphic number, 5 * 5 = 25, 6 * 6 = 36, 25 * 25 = 625 and so on.
 */
public class AutomorphicNumber {
    public static void main(String[] args) {
        // Initialize the scanner class to take input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter number to check if it is Automorphic or not : ");

        // Take input
        int num = sc.nextInt();

        // Check if number is automorphic and print the desired message
        if (checkAutomorphic(num))
            System.out.println("This number is an Automorphic Number");
        else
            System.out.println("This number is not an Automorphic Number");
    }

    /**
     * Check if the given number is automorphic or not
     *
     * @param number The number to check
     * @return true if the number is automorphic, false otherwise
     */
    public static boolean checkAutomorphic(int number) {
        // Store the square of the number
        int square = number * number;

        // Check if the number is automorphic or not
        while (number > 0) {
            // If the last digit of the number and square are not equal, return false
            if (number % 10 != square % 10) {
                return false;
            }
            // Remove the last digit from the number and square
            number /= 10;

            // Remove the last digit from the square
            square /= 10;
        }
        return true;
    }
}
