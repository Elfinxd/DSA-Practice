package FunctionQues;
import java.util.*;
public class sumtilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any natural num : ");
        int n =  sc.nextInt();
        System.out.println(sumofn(n));
    }
public static int sumofn(int num)
{
    int sum = 0;
    for(int i = 1; i<=num; i++)
    {
        sum = sum + i;
    }
    return sum;
}
}
