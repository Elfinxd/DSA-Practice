package FunctionQues;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        isPrime(n);
    }
    public static void isPrime(int num)
    {
        int c = 0;
        for(int i = 1; i<=num; i++)
        {
            if(num % i == 0)
            {
                c++;
            }
        }
        if(c == 2)
        System.out.println("It is Prime!");
        else
        System.out.println("No. Not a Prime Number!");

    }

}
