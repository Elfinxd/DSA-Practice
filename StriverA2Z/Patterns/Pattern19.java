package StriverA2Z.Patterns;

import java.util.Scanner;

public class Pattern19 {
    
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
    {   int iniS = 0;
        for(int i = 0; i<n; i++)
        {   //stars
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j<=iniS; j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print("*");
            }
            iniS = iniS+2;
            System.out.println();
        }
        iniS = 8;
        for(int i = 0; i<n; i++)
        {   //stars
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j<=iniS; j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            iniS = iniS-2;
            System.out.println();
        }
        }
}
