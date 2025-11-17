package StriverA2Z.BASICS;
import java.util.*;
public class Linearprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num you want to print till : ");
        int n = sc.nextInt();
        linearprint(1, n);
    }
    public static void linearprint(int i, int n)
    {
        if(i==n)
        {
            return;
        }
        System.out.print(i + " ");
        i++;
        linearprint(i, n);
    }
}
