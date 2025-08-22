package FunctionQues;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();

        ispalindrome(num);
    }

    public static void ispalindrome(int n)
    {
        int t = n; int r = 0; int copy = 0;
        while(t>0)
        {
            r = t % 10;
            copy = (copy * 10) + r;
            t = t / 10; 
        }

        if(copy == n)
        System.out.println("It's Palindorme!");
        else
        System.out.println("Not a Palindrome!");
    }
}
