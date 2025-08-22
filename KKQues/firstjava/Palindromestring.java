package KKQues.firstjava;
import java.util.*;
public class Palindromestring {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String: ");
            String str = sc.next();
            int l = str.length();
            String rev = "";
            char t;
            for (int i = l-1; i >= 0; i--)
            {
                t = str.charAt(i);
                rev = rev + t;
            }
            if (str.equals(rev))
            {
                System.out.println("Palindrome!");
            }
            else{
                System.out.println("Not an Palindrome!");
            }
        }    
}
