package BasicQues;
import java.util.*;
public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit :");
        double F = sc.nextDouble();
        double C = ((F - 32)/9)*5;
        System.out.println("Temp in Celcius: " + C);
    }
}
