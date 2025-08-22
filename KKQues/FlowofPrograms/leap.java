package KKQues.FlowofPrograms;
import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        isleap(year);
    }
    public static void isleap(int n)
    {
        if(((n % 4 == 0)&&(n % 100 != 0)) || (n % 400 == 0))
        System.out.println("Its Leap year!");
        else
        System.out.println("Not a Leap Year!");
    }
}
