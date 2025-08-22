package BasicQues;
import java.util.*;
    public class evenodd
    {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number!");
            int num = sc.nextInt();
            if (num % 2 == 0)
            {
                System.out.println("Even Number!");
            }
            else{
                System.out.println("Odd Number!");
            }
        }
    }