package Arrays;
import java.util.*;
public class GFGGoodPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the value in that array : ");
        for(int i = 0; i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Number of Good Pairs : " + numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums)
    {
        int gp = 0;
        for(int i=0; i<nums.length;i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i] == nums[j] && i<j)
                {
                    gp++;
                }
            }
        }
        return gp;
    }
}
