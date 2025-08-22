package BasicQues;
//Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.
import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter any 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b)
        {
            System.out.println("Sum of the two nums: " + (a+b));
        }
        else
        {
            System.out.println("Nums r not same: " + ((a+b)*2));
        }
        
    }
}
