package FunctionQues;
import java.util.*;
public class MaxMin 
{
    public static int max(int n1, int n2, int n3)
{   
    int max =0; 
    if (n1>n2)
    max = n1;
    else
    max = n2;

    if(max>n3)
    return max;
    else
    return n3;
}

    public static int min( int n1, int n2, int n3)
    {
        int min = 0;
        if(n1<n2)
        min = n1;
        else
        min = n2;

        if(min<n3)
        return min;
        else
        return n3;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum num among three: " + max(a, b, c));
        System.out.println("Minimum num among three: " + min(a, b, c));    
    }    
}
