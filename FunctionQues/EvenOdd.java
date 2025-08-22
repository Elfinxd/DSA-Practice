package FunctionQues;
import java.util.*;
public class EvenOdd {

    public static void calcevenodd(int n)
    {
        if(n % 2 == 0)
        System.out.println("It is Even!");
        else
        System.out.println("It is Odd!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        calcevenodd(num);
    }
}


