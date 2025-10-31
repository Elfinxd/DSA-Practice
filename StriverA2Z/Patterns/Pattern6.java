package StriverA2Z.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no of test cases : ");
         int t = sc.nextInt();
        for(int a = 0; a<t; a++)
        {
            int n  = sc.nextInt();
            pattern(n);
        }
    }
    static void pattern(int n)
    {
        for(int i = 5; i>=1; i--)
        { int a=1;
            for(int j = i; j>=1; j--)
            {
                System.out.print((a++) + " ");
            }
            System.out.println();
                }        }
}
