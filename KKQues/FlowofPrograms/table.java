package KKQues.FlowofPrograms;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        tableis(num);
    }
    public static void tableis(int n)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
}
