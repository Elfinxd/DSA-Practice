package Arrays;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements on array:");
        for(int i = 0; i<n; i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(reverseis(arr)));
    }
    //extra space is their!
    // public static int[] reverseis(int[] arr)
    // {
    //     int[] arr2 = new int[arr.length];
    //     int j = 0;
    //     for(int i = arr.length-1;i>=0;i--)
    //     {
    //         arr2[j] = arr[i];
    //         j++;
    //     }
    //     return arr2;
    // }
    public static int[] reverseis(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
