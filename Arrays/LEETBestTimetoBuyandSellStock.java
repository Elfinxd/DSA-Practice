package Arrays;
import java.util.*;
public class LEETBestTimetoBuyandSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit : " + Maxprofit(arr));
    }
    public static int Maxprofit(int[] arr)
    {
        int bp = arr[0]; int maxprofit = 0; int profit = 0;
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i]<bp)
            {
                bp = arr[i];
            }
            else{
                profit = arr[i] - bp;
                if(maxprofit<profit)
                {
                    maxprofit = profit;
                } 
            }
        }

        if(maxprofit == 0)
        {
            return 0;
        }
        return maxprofit;
    }
}
