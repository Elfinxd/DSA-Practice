package BasicQues;
//A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.

import java.util.*;
public class seed {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any 2 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int t = n1; int n = n1;
        while(t>0)
        {
            int r = t%10;
            n = n*r;
            t = t/10;
        }
        if(n == n2)
        {
            System.out.println("X is seed of Y");
        }
        else{
            System.out.println("Not a seed!");
        }
    }
    
}
