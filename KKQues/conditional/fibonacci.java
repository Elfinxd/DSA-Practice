package KKQues.conditional;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        int a = 0, b =1;
        System.out.println(a);
        System.out.println(b);
        int sum = 0;
        while (sum!=n)
        {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum); 
            
        }
    }
}
