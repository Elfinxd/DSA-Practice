package FunctionQues;
import java. util.*;
public class product {

    public static int multiply(int n1, int n2)
    {
        return (n1*n2);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiply(a, b);
        System.out.println("Product of the two are: " + product);
    }
}
