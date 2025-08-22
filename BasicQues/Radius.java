package BasicQues;
import java.util.*;
public class Radius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.println("Area of the Circle: " + a);
    }
}
