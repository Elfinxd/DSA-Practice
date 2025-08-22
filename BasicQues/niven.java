package BasicQues;
import java.util.*;
public class niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); int t = num;
        int sum = 0;
        while (t>0) 
        {
            int r = t%10;
            sum = sum + r;
            t = t/10;    
        }
        if(num%sum == 0)
        {
            System.out.println("Niven number");
        }
        else{
            System.out.println("Not a niven number!");
        }
    }
}
