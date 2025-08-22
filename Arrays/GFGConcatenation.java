package Arrays;
import java.util.*;
public class GFGConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in Array :");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums)
    {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i<n; i++)
        {
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }
        return ans;
    }
}
