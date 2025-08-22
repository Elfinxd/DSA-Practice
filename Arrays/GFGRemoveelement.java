package Arrays;
import java.util.*;
public class GFGRemoveelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the val u need to delete! : ");
        int val = sc.nextInt();
        System.out.println(Arrays.toString(delete(arr, val)));
    }
    public static int[] delete(int[] arr, int val)
    {
        int t = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != val)
            {
                arr[t] = arr[i];
                t++;
            }
        }
        return Arrays.copyOf(arr, t);
    }
}
