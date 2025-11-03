package StriverA2Z.Patterns;

import java.util.Scanner;

public class Pattern16 {
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
    {   char ch = 'A';
        for(int i = 1; i<=n; i++)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            ch++;   
        }
        }
}
