package Arrays;
import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted values in array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] ar;
        ar = duplicate(arr, n);
        
        System.out.println(Arrays.toString(ar));
        System.out.println("Size : " + ar.length);
    }
    public static int[] duplicate(int[] arr, int size)
    {   if(size == 0 || size ==1)
        {
            return arr;
        }
        
        
        int j = 0;
        for(int i = 0; i<size-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j] = arr[i];
                j++;
            }
            
        }
        arr[j] = arr[arr.length-1];
        j++;
        return Arrays.copyOf(arr, j);
    }
}
