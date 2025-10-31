package StriverA2Z.Patterns;

import java.util.Scanner;

public class Pattern10 {
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
        for(int i = 0; i <=2*n-1; i++)
        {
            int star = i;
            if(i>n)
            {
                star = 2*n-i;
            }
            for(int j =1; j<=star; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        }
}
