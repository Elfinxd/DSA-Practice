package KKQues.firstjava;
import java.util.*;
public class USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amt in Rupees: ");
        double amt = sc.nextDouble();
        double usd = amt / 83.0;
        System.out.println("Rupees in USD are: " + usd);
    }
}
