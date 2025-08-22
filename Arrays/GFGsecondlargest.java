package Arrays;
import java.util.*;
public class GFGsecondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values in array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(seclar(arr));
    }
    public static int seclar(int[] arr)
    {
        int max = -1; int secmax = -1;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                secmax = max;
                max =arr[i];
            }
            else if(arr[i] > secmax && arr[i]<max)
            {
                secmax = arr[i];
            }

        }
        if(secmax == -1)
        return -1;
        else
        return secmax;
    }
}
