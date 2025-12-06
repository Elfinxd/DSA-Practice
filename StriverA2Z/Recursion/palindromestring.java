package StriverA2Z.Recursion;
import java.util.*;
public class palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        int n = s.length();
        if(!palindrome(s, 0, n))
        System.out.println("Not palindrome!");
        else
        System.out.println("Palindrome!");
    }
    public static boolean palindrome(String s, int i, int n)
    {
        if(i>=n/2)
            return true;
        if(s.charAt(i) != s.charAt(n-i-1)) 
            return false;
        else
            return palindrome(s, i+1, n);     
    }
}
