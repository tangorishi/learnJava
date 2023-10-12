//Finding the Largest and Smallest value from user input of 10 values

import java.util.Scanner;
 
public class minMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cat = new int[10];
 
 
        for (int i = 0; i < cat.length; i++) {
            System.out.print("Enter the value of [" + i + "]: ");
            cat[i] = scanner.nextInt();
        }
 
        int small = cat[0];
        int large = cat[0];
        for (int i = 1; i < cat.length; i++) {
            if (cat[i] < small) {
                small = cat[i];
            }
            if (cat[i] > large) {
                large = cat[i];
            }
        }
 
        System.out.println("Largest is " + large + " and smallest is " + small);

        scanner.close();
    }
}
 