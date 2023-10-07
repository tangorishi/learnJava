import java.util.Scanner;

public class NeonNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        boolean foundNeonNumber = false;
        System.out.println("\nNeon numbers up to " + limit + ":");

        for (int i = 0; i <= limit; i++) {
            if (isNeonNumber(i)) {
                System.out.println(i);
                foundNeonNumber = true;
            }
        }

        if (!foundNeonNumber) {
            System.out.println("\nNo Neon numbers present in the specified limit.");
        }
    }

    // Function to check if a number is a Neon number
    public static boolean isNeonNumber(int num) {
        int sumOfDigitSquares = 0;

        // Calculate the sum of squares of digits
        int square = num * num;
        while (square > 0) {
            int digit = square % 10;
            sumOfDigitSquares += digit;
            square /= 10;
        }

        // Check if the sum of squares equals the original number
        return sumOfDigitSquares == num;
    }
}
