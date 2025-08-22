package KKQues.conditional;
import java.util.*;
public class till0sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nums and input 0 if no more numbers: ");
        int sum = 0;
        while(true)
        {
            int num = sc.nextInt();
            if(num == 0)
            {
                break;
            }
            else
            {
                sum = sum + num;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
