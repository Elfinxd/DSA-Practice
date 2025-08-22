package BasicQues;
import java.util.*;
public class coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of $5 coins available: ");
        int x = sc.nextInt();
        System.out.println("No of $1 coin available: ");
        int y = sc.nextInt();
        System.out.println("Amount to be paid: ");
        int rem = 0;
        int z = sc.nextInt();
        int Fused = 0;
        if ((z/5)<=x)
        {
            Fused = z/5;
        }
        else{
            Fused = x;
        }

        rem = z - (Fused*5);

        if(rem<=y)
        {
            System.out.println("No of $5 used: " + Fused);
            System.out.println("No of $1 used: " + rem);
        }
        else{
            System.out.println("-1");
        }
    }
}
