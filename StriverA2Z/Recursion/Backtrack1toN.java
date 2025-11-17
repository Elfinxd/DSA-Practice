package StriverA2Z.Recursion;
import java.util.*;
public class Backtrack1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till u want to print : ");
        int n = sc.nextInt();
        backtrack1ton(n, n);
    }
    public static void backtrack1ton(int i, int n)
    {
        if(i<1)
        return;
        backtrack1ton(i-1, n);
        System.out.print(i + " ");
    }
}
