package FunctionQues;
import java.util.*;
public class circle {
    
    public static void circumarea(double radius)
    {
        System.out.println("Circumference of a circle :" + (2 * 3.14 * radius));
        System.out.println("Area of a circle :" + (3.14 * radius * radius));
    }

   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter radius of the circle :");
    double r = sc.nextDouble();

    circumarea(r);
   }

}
