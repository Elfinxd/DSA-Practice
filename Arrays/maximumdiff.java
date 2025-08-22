package Arrays;
import java.util.*;
public class maximumdiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.println("Max diff is : " + maxdiff(arr));
    }
    public static int maxdiff(int[] arr)
    {
        //Naive Approach
        // int diff = arr[1] - arr[0];
        // for(int i = 0; i<arr.length - 1; i++)
        // { 
        //     for(int j = i+1; j<arr.length; j++)
        //     {
        //         if(diff < (arr[j] - arr[i]))
        //         {
        //             diff = arr[j] - arr[i];
        //         }
        //     }
        // }
        // return diff;
        //Efficient approach
        int diff = arr[1] - arr[0];
        int minval = arr[0];
        for(int j = 1; j < arr.length; j++)
        {
            if(diff < (arr[j] - minval))
            {
                diff = arr[j] - minval;
            }
            if(minval > arr[j])
            {
                minval = arr[j];
            }
        }
        return diff;
    }
}
