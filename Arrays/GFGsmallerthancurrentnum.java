package Arrays;
import java.util.*;
public class GFGsmallerthancurrentnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the value in the array : ");
        for(int i = 0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

    /*Brute Force

        int[] sm = new int[nums.length]; 
        for(int i = 0; i<nums.length; i++)
        {   int n = 0;
            for(int j = 0; j<nums.length; j++)
            {
                if(j!=i && nums[j]<nums[i])
                {
                    n++;
                }
                sm[i] = n;
            }

        }
        return sm;
    
 */
//Optimized version : 
        int[] freq = new int[101];
        for(int i = 0; i<nums.length; i++)
        {
            freq[nums[i]]++;
        }
        for(int i = 1; i<101; i++)
        {
            freq[i] = freq[i] + freq[i-1];
        }
        int[] res = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                res[i] = 0;
            }
            else{
                res[i] = freq[nums[i]-1];
            }
        }
        return res;
}
}
