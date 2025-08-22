package KKQues.firstjava;
 import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number!");
        int num = sc.nextInt();
        int l = 0;
        int t = num;
        while (t != 0) {
        t = t / 10;
        l++;
        }
        int c = num;
        int sum = 0;
        while(c!=0)
        {
            int a = c%10;
            sum = sum +(int)(Math.pow(a, l));
            c = c/10;

        }
        if(num == sum)
        {
            System.out.println("Armstrong Number!");
        }
        else{
            System.out.println("Not an Armstrong Number!");
        }
    }
   
}
