package StriverA2Z.Patterns;

import java.util.Scanner;

public class Pattern22 {
    
    
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
        for(int i = 0; i<(2*n)-1; i++)
        {
            for(int j = 0; j<(2*n)-1; j++)
        {
            int top = i;
            int left = j;
            int bottom = (2*n-2)-i;
            int right = (2*n-2)-j;

            int min = Math.min(Math.min(top, bottom), Math.min(left, right));
            System.out.print(n-min);
        }
        System.out.println();
    }
}
}
