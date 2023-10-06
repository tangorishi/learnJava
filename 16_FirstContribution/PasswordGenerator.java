import java.security.SecureRandom;
import java.util.*;


public class PasswordGenerator {

    static char[] SYMBOLS = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static char[] NUMBERS = "0123456789".toCharArray();
    static char[] EASY = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] MED = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

    static char[] ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    static Random rand = new SecureRandom();

    public static String getPassword(int length , int c) {
        assert length >= 4;
        char[] password = new char[length];

        switch (c){
            case 1:
                password[0] = LOWERCASE[rand.nextInt(LOWERCASE.length)];
                password[1] = UPPERCASE[rand.nextInt(UPPERCASE.length)];

                //populate rest of the password with random chars
                for (int i = 2; i < length; i++) {
                    password[i] = EASY[rand.nextInt(EASY.length)];
                }
                break;

            case 2:
                password[0] = LOWERCASE[rand.nextInt(LOWERCASE.length)];
                password[1] = UPPERCASE[rand.nextInt(UPPERCASE.length)];
                password[2] = NUMBERS[rand.nextInt(NUMBERS.length)];

                for (int i = 3; i < length; i++) {
                    password[i] = MED[rand.nextInt(MED.length)];
                }
                break;


            case 3:
                password[0] = LOWERCASE[rand.nextInt(LOWERCASE.length)];
                password[1] = UPPERCASE[rand.nextInt(UPPERCASE.length)];
                password[2] = NUMBERS[rand.nextInt(NUMBERS.length)];
                password[3] = SYMBOLS[rand.nextInt(SYMBOLS.length)];


                for (int i = 4; i < length; i++) {
                    password[i] = ALL_CHARS[rand.nextInt(ALL_CHARS.length)];
                }
                break;

            default:
                return "";
        }


        //shuffle it up
        for (int i = 0; i < password.length; i++) {
            int randomPosition = rand.nextInt(password.length);
            char temp = password[i];
            password[i] = password[randomPosition];
            password[randomPosition] = temp;
        }

        return new String(password);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the password you want");
        int l=sc.nextInt();
        System.out.println("Enter the complexity of Password you want 1-Easy 2-Medium 3-Hard");
        int c=sc.nextInt();
        System.out.println(getPassword(l,c));
    }
}