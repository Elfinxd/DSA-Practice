package BasicQues;
import java.util.*;
public class ZZZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 ==0)
        {
            System.out.println("Zoom");
        }
        else if (num % 3 == 0)
        {
            System.out.println("Zip");
        }
        else if (num % 5 == 0)
        {
            System.out.println("Zap");
        }
        else
        {
            System.out.println("Invalid");
        }
        

    }
}
