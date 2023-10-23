import java.util.Scanner;
import java.util.Random;

class spsgame {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0 ;
        while (i != 5) {
            System.out.println("1 --- Stone");
            System.out.println("2 --- Paper");
            System.out.println("3 --- Scissors");
            System.out.println();
            int u;
            u = sc.nextInt();
        if (u == 1) {
            System.out.println("User got Stone");
        }
        if (u == 2) {
            System.out.println("User got Paper");
        }
        if (u == 3) {
            System.out.println("User got Scissors");
        }
            Random r = new Random();
            int c = r.nextInt(1, 4);
            if (c == 1) {
                System.out.println("Computer got Stone");
            }
            if (c == 2) {
                System.out.println("Computer got Paper");
            }
            if (c == 3) {
                System.out.println("Computer got Scissors");
            }

            if (u == c) {
                System.out.println("It's a tie");
            } else if (u == 1 && c == 2) {
                System.out.println(("Computer wins!"));
            } else if (u == 1 && c == 3) {
                System.out.println(("User wins!"));
            } else if (u == 2 && c == 1) {
                System.out.println(("User wins!"));
            } else if (u == 2 && c == 3) {
                System.out.println(("Computer wins!"));
            } else if (u == 3 && c == 1) {
                System.out.println(("Computer wins!"));
            } else if (u == 3 && c == 2) {
                System.out.println(("User wins!"));
            }
            System.out.println("");
            System.out.println("4 --- Play Again ");
            System.out.println("5 --- EXIT ");
            i = sc.nextInt();
        }
        System.out.println("Thanks for playing");
    }
}
