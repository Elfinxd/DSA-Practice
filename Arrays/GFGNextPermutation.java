package Arrays;
import java.util.*;
public class GFGNextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements in the array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(permutation(arr)));
    }
    public static int[] permutation(int[] arr)
    {
        int pivot = -1;
        for(int i = arr.length-1; i>0; i--)
        {
            if(arr[i] > arr[i-1])
            {
                pivot = i-1;
                break;
            }
        }
        int start = 0, end = arr.length-1;
        if(pivot == -1)
        {   
            while(start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return arr;
        }
        else
        {
            for(int i = arr.length-1; i>pivot; i--)
            {
                if(arr[i]>arr[pivot])
                {
                    int temp = arr[pivot];
                    arr[pivot] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
            start = pivot+1; end = arr.length-1;
            while(start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        return arr;
    }
}
