package Arrays;
import java.util.*;
public class GFGRunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values in array :");
        for (int i = 0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningsum(arr)));
    }
    public static int[] runningsum(int[] nums)
    {
        int sum = 0;
        int[] runningSum = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
