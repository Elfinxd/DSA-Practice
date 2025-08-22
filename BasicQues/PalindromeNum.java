package BasicQues;
import java.util.*;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt(); int t = num;
        int rev = 0;
        while(t>0)
        {
            int r = t % 10;
            rev = rev*10 + r;
            t = t / 10;
        }

        if (num == rev)
        {
            System.out.println("Palindrome Number!");
        }
        else
        {
            System.out.println(num + " is not a Palindrome Number!");
        }

    }
}
