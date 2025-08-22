package Arrays;
import java.util.*;
public class GFGbuildarrayfrompermutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter size of the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter values in array : ");
        for(int i = 0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }
     System.out.println(Arrays.toString(buildArray(arr)));   

    }
        public static int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        for(int i = 0; i < size; i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

