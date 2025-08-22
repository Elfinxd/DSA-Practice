package FunctionQues;
import java.util.*;
public class primebtwnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nums between which u want prime nums : ");
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(Prime(s, e));
    }
    public static String Prime(int start, int end)
    {   
        int size = end - start + 1; int index = 0;
        int[] arr = new int[size];
        for (int i=start; i<=end; i++)
        {
        if(isPrime(i))
        {
        arr[index] = i;
        index++;
        }
        else
        {
        continue;
        }
    }
    int[] result = new int[index];
    for(int i = 0; i< index; i++)
    {
        result[i] = arr[i];
    }
    return (Arrays.toString(result));
}
      public static boolean isPrime(int num)
    {
        int c = 0;
        for(int i = 1; i<=num; i++)
        {
            if(num % i == 0)
            {
                c++;
            }
        }
        if(c == 2)
        return true;
        else
        return false;

    }
}
