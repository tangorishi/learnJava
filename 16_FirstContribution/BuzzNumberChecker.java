import java.util.Scanner;

public class BuzzNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // Read the input integer
        int number = scanner.nextInt();
        
        // Check if it's a Buzz number
        if (isBuzzNumber(number)) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Function to check if a number is a Buzz number
    public static boolean isBuzzNumber(int number) {
        // Check if the number ends with 7 or is divisible by 7
        return (number % 10 == 7) || (number % 7 == 0);
    }
}
