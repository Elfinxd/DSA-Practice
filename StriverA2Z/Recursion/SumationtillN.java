package StriverA2Z.Recursion;
import java.util.*;
public class SumationtillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
       System.out.println( sumationtilln(n));
       //sumationtilln(n, 0);
    }
    //Paremeterized way 1
    // public static void sumationtilln(int i, int sum)
    // {
    //     if(i<1)
    //     {
    //         System.out.println(sum);
    //         return;
    //     }
    //     sumationtilln(i-1, sum+i);
    // }

    //Functional Way 2
    public static int sumationtilln(int n) 
    {
        if(n == 0)
        return 0;
        return (n + sumationtilln(n-1));
    }
}
