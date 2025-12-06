package StriverA2Z.Recursion;
import java.util.*;
public class fibonacci {
     static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
      
        System.out.println(fibonacci(n));
        System.out.println("no of times the function is called : " + count);
    }
    public static int fibonacci(int n)
    {
        count++;
        if(n<=1)
            return n;
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}
