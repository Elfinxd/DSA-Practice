package StriverA2Z.BASICS;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a,b);
    }
    public static void gcd(int a, int b)
    {
        while(a>0 && b>0)
        {
            if(a>b)
            a=a%b;
            else
            b=b%a;
        }
        if(a==0)
        System.out.println("GCD : " + b);
        else
        System.out.println("GCD : " + a);
    }
}
