package Arrays;
import java.util.*;
public class LEETBuySellStocksNtransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(TotalProfit(arr));
    }
    //Approach 1
    // public static int TotalProfit(int[] arr)
    // {
    //     int n = arr.length;
    //     int lmin = arr[0];
    //     int lmax = arr[0];
    //     int  i = 0;
    //     int res = 0;
    //     while(i < n-1)
    //     {
    //         while((i<n-1)&&(arr[i]>=arr[i+1]))
    //         {
    //             i = i+1;
    //             lmin = arr[i];
    //         }
    //         while((i<n-1)&&(arr[i]<=arr[i+1]))
    //         {
    //             i = i+1;
    //             lmax = arr[i];
    //         }
    //         res = res + (lmax - lmin);
    //     }
    //     return res;
    // }
   
   
    //Approach 2(best approach)
    public static int TotalProfit(int[] arr)
    {
        int res = 0;
        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i]<arr[i+1])
            {
                res = res + (arr[i+1] - arr[i]);
            }
        }
        return res;
    }
}
