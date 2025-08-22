package Arrays;
import java.util.*;
public class GFGShufflingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        System.out.println("Enter the values in the array : ");
        for(int i = 0; i < (2 * n); i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
    public static int[] shuffle(int[] nums, int n)
    {
        int[] arr = new int [2 * n];
        int start = 0, end = n;
        for (int i = 0; i<(2*n); i= i + 2)
        {
            arr[i] = nums[start];
            arr[i+1] = nums[end];
            start++;
            end++;
        }
        return arr;
    }
}
