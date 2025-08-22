package FunctionQues;
import java.util.*;
public class sum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        add(a, b);
    }


    public static void add(int n1, int n2)
    {
        System.out.println("Sum of two numbers : " + (n1+n2));
    }


}

    
