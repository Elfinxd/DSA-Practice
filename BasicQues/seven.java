package BasicQues;
import java.util.*;
public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a != 7 && b != 7 && c != 7)
        {
            System.out.println("Product of Three nums: " + (a*b*c));
        }
        else{
            if(a == 7)
            {
                System.out.println("A is 7 so Result: " + (b*c));
            }
            else if(b == 7)
            {
                System.out.println("B is 7 so Result: " + c);
            }
            else if(c == 7)
            {
                System.out.println("C is 7 so Result: -1");
            }
        }

    }
}
