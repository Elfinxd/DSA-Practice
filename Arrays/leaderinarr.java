package Arrays;
import java.util.*;
public class leaderinarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value in array : ");
        for(int i = 0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        leader(arr);

    }
    public static void leader(int[] arr)
    {
        int curr_lead = arr[arr.length-1];
        System.out.println(curr_lead);

        for(int i = arr.length-2; i>=0; i--)
        {
            if(curr_lead < arr[i])
            {
                curr_lead = arr[i];
                System.out.println(curr_lead);
            }
        }
    }
}
