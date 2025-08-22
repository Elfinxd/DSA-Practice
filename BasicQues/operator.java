package BasicQues;
import java.util.*;
public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Two Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter a Operator: ");
        String op = sc.next();
        if (op.equals("+"))
        {
            System.out.println("Sum of two nums : " + (x+y));
        }
        else if (op.equals("-"))
        {
            System.out.println("Diff of two nums : " + (x-y));
        }
        else if (op.equals("*"))
        {
            System.out.println("Product of two nums : " + (x*y));
        }
        else if (op.equals("/"))
        {
            System.out.println("Division of two nums : " + (x/y));
        }
        else{
            System.out.println("Invalid Operator!");
        }
    }
}
