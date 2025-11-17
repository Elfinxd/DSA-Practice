package StriverA2Z.Recursion;
import java.util.*;
public class BacktrackNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from where u want to print : ");
        int n = sc.nextInt();
        backtracknto1(1, n);
    }
    public static void backtracknto1(int i , int n)
    {
        if(i>n)
        return;
        backtracknto1(i+1, n);
        System.out.print(i + " ");
    }
}
