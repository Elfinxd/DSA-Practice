package StriverA2Z.Recursion;
import java.util.*;
public class reversecount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Reverse(n);
    }
    public static void Reverse(int n)
    {
        if(n == 0)
        return;
        System.out.print(n + " ");
        n--;
        Reverse(n);
    }
}
