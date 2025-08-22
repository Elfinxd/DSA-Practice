package KKQues.FlowofPrograms;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        sumis(a, b);
    }
    public static void sumis(double n1, double n2)
    {
        System.out.println("Sum of two numbers is : " + (n1 + n2));
    }
}
