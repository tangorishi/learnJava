import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void generateFibonacci(int n) {
        long[] fibonacci = new long[n];
        
        if (n >= 1) {
            fibonacci[0] = 0;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        System.out.println("Fibonacci Sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numTerms = scanner.nextInt();
        scanner.close();
        generateFibonacci(numTerms);
    }
}
