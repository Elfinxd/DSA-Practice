package StriverA2Z.Patterns;

import java.util.Scanner;

public class Pattern15 {
    
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
        for(int i = n; i>=0; i--)
        {
            for(char ch = 'A'; ch<= 'A'+i; ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
