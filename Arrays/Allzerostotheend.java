package Arrays;
import java.util.*;
public class Allzerostotheend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values on the array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(zerototheend(arr)));
    }
    public static int[] zerototheend(int[] nums)
    {
        int j = 0;
        for(int i = 0 ; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                j = i;
            }
            nums[j] = nums[j+1];
        }
        return nums;
    }
}
