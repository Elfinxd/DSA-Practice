package BasicQues;
import java.util.*;
public class lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int l = 0; int t = 0;
        int temp = num; int sum = 0;
        while(temp>0)
        {
            ++l;
            temp = temp /10;
        }
        temp = num;
        for(int i = 2; i<=l; i= i+2)
        {
            t = temp / (int)(Math.pow(10, l-i));
            t = t % 10;
            sum = sum + (t*t);
        }

        if(sum % 9 == 0)
        {
            System.out.println("Lucky Number!");
        }
        else{
            System.out.println("Not a Lucky Number!");
        }
    }
}
