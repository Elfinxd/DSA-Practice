package StriverA2Z.Recursion;
import java.util.*;
public class Count {
    static int c = 0;   //we have to take global variable else what we can do is we have to give condition accordingly
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Till you want to print : ");
        int n = sc.nextInt();
        cnt(n);
    }
    public static void cnt(int a)
    {   
        if(c == a)
        return;
        System.out.println(c);
        c++;
        cnt(a);
    }
}
