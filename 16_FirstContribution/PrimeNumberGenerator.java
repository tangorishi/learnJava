
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        int startRange = 1;
        int endRange = 66; // Change the endRange as needed

        List<Integer> primeNumbers = findPrimesInRange(startRange, endRange);

        System.out.println("Prime numbers between " + startRange + " and " + endRange + ":");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }

    public static List<Integer> findPrimesInRange(int start, int end) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }

        return primeNumbers;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}