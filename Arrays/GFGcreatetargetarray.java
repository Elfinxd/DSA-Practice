package Arrays;
import java.util.*;
public class GFGcreatetargetarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter same length of both arrays : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int [] index = new int[n];
        System.out.println("Enter the values in the array1 :");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the values in the array2 :");
        for(int i = 0; i<n; i++)
        {
            index[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(TargetArray(arr, index)));
    }
    //naive approach
    // public static int[] TargetArray(int[] nums, int[] index)
    // {
    //     int[] TA = new int[nums.length]; Arrays.fill(TA, -1);
    //     for(int i = 0; i<nums.length; i++)
    //     {
    //         if(TA[index[i]] == -1)
    //         {
    //             TA[index[i]] = nums[i];
    //         }

    //         for(int j = nums.length-1; j>index[i]; j--)
    //         {
    //             TA[j] = TA[j-1];
    //         }
    //         TA[index[i]] = nums[i];
    //     }
    //     return TA;
    // }

    //efficient approach
    public static int[] TargetArray(int[] nums, int[] index)
    {
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            l.add(index[i], nums[i]);
        }
        for(int i = 0; i<l.size();i++)
        {
            nums[i] = l.get(i);
        }
        return nums;
    }
}
