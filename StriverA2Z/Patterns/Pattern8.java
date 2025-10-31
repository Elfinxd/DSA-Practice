package StriverA2Z.Patterns;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Pattern8 {
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
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<2*n-(2*i+1); j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        }
}
