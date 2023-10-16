import java.util.Scanner;

/*
 * This class contains code to check if a number is a Pronic number (or Narcissistic number)
 * A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
 * The first few pronic numbers are:
 * 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, …….
 */
public class PronicNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number
        int n = sc.nextInt();

        // Check if n is a pronic number
        if (isPronic(n)) {
            System.out.println(n + " is a pronic number");
        } else {
            System.out.println(n + " is not a pronic number");
        }
    }


    /**
     * This method checks if a number is a pronic number
     * @param number The number to be checked
     * @return true if the number is a pronic number, false otherwise
     */
    public static boolean isPronic(int number) {
        // Loop variable
        int i = 0;

        // Loop until i * (i + 1) is less than or equal to n
        while (i * (i + 1) <= number) {
            // Check if i * (i + 1) is equal to n
            if (i * (i + 1) == number) {
                // If yes, then n is a pronic number
                return true;
            }

            // Increment i
            i++;
        }

        // If no, then n is not a pronic number
        return false;
    }
}
