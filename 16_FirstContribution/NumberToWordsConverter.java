import java.util.Scanner;

public class NumberToWordsConverter {
    private static final String[] ones = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };
    
    private static final String[] teens = {
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    
    private static final String[] thousands = {
        "", "thousand", "million", "billion", "trillion"
    };

    public static String convertToWords(long number) {
        if (number == 0) {
            return "zero";
        }
        
        return convertToWordsHelper(number).trim();
    }

    private static String convertToWordsHelper(long number) {
        if (number < 10) {
            return ones[(int)number];
        } else if (number < 20) {
            return teens[(int) (number - 10)];
        } else if (number < 100) {
            return tens[(int) (number / 10)] + " " + ones[(int) (number % 10)];
        } else if (number < 1000) {
            return ones[(int) (number / 100)] + " hundred " + convertToWordsHelper(number % 100);
        } else {
            int i = 0;
            String words = "";
            while (number > 0) {
                if (number % 1000 != 0) {
                    words = convertToWordsHelper(number % 1000) + " " + thousands[i] + " " + words;
                }
                number /= 1000;
                i++;
            }
            return words;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();

        String words = convertToWords(number);
        System.out.println("In words: " + words);
    }
}