import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz{
  
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number - ");      
      int n = sc.nextInt();
      List<String> result = fizzBuzz(n);
      System.out.println("Resultant String Array" + result);
  }

  private static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i=1; i<=n; i++){
            if ((i%3 == 0) && (i%5 == 0))
                list.add("FizzBuzz");
            else if (i%3 == 0)
                list.add("Fizz");
            else if (i%5 == 0)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }
        return list;
  }
}
