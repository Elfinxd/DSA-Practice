package StriverA2Z.Patterns;

import java.util.Scanner;

public class Pattern12 {
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
        int space = 2 * (n-1);
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j);
            }
            for(int j = 0; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;
        }
        }
}
