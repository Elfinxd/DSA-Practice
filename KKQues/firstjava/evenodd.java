package KKQues.firstjava;
import java.util.*;
    public class evenodd
    {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number!");
            int num = sc.nextInt();

            isevenodd(num);
        }
        public static void isevenodd(int n){
            if (n % 2 == 0)
            {
                System.out.println("Even Number!");
            }
            else{
                System.out.println("Odd Number!");
            }
        }
    }