package KKQues.conditional;
import java.util.*;
public class subtractproductsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int sum = 0; int prod = 1;
        while(num>0)
        {
            int r = num % 10;
            sum = sum + r;
            prod = prod * r;
            num = num / 10;
        }
        System.out.println("The Difference of Product and Sum of the digits of the entered integer : " + (prod-sum));
    }
}
