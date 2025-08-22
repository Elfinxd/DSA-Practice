package KKQues.firstjava;
import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int l = 0;
        if (a > b)
        l = a;
        else
        l = b;
        if (l > c)
        System.out.println("Largest Number :" + l);
        else
        System.out.println("Largest Number :" + c);
        
    }
}
