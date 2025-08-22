package FunctionQues;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        fact(num);
    }
    public static void fact(int num)
    {
        if(num == 1)
        System.out.println("Factorial is : 1");
        else if(num == 0)
        System.out.println("Factorial is : 0");
        else
        {   
            int f = 1;
            for(int i = 1; i <= num; i++)
            {
                f = f * i;
            }
            System.out.println("Factorial is : " + f);
        }
    }
}
