package BasicQues;
import java.util.*;
public class sequence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements for sequence: ");
        int n = sc.nextInt();
        int s = 1;
        int a = 0;
        System.out.println(s);
        for (int  i = 1; i<=n; i++)
        {
            a = s + s;
            s = a;
            System.out.println(a);
        }
    }
}
