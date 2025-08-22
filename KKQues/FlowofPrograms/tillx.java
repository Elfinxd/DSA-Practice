package KKQues.FlowofPrograms;
import java.util.*;
public class tillx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want sum of, enter 'x' is no more inputs :");
         int sum = 0;
        while(true)
        {
        if (sc.hasNextInt())
        {
            int num = sc.nextInt();
            sum = sum + num; 
        }
        else
        {
            String input = sc.next();
            if(input.equalsIgnoreCase("x"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input!");
            }
        }
       
    }
    System.out.println("Total sum = " + sum);
}
}
