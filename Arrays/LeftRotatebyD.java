package Arrays;
import java.util.*;
public class LeftRotatebyD {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values in array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no of times it need to be rotated :");
        int d = sc.nextInt();
        System.out.println(Arrays.toString(leftRotate(arr, d)));
    }
    public static int[] leftRotate(int[] arr, int d)
    // {Brute Force******
    //     while(d!=0)
    //     {
    //         int temp = arr[0];
    //         for(int i = 1; i<arr.length; i++)
    //         {
    //             arr[i-1] = arr[i];
    //         }
    //         arr[arr.length-1] = temp;
    //         d--;
    //     }
    // return arr;
    // }
    //********************REVERSE ALGORITHM*************************** */
    { 
        int n = arr.length;
        reverse(arr, 0, d-1); //from 0 elemt to d-1 rotates
        reverse(arr, d, n-1);   //from d to n-1 rotates
        reverse(arr, 0, n-1); // whole array rotates
        return arr;
    }
    public static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {   //swapping
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
