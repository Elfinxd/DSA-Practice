package StriverA2Z.Recursion;
import java.util.*;
public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of times u wat get your name to be printed : ");
        int n = sc.nextInt();
        Name(0, n);
    }
    public static void Name(int i, int n)
    {
        if(i==n)
        return;
        System.out.println("Shivansh Dixit");
        i++;
        Name(i, n);
    }
}
