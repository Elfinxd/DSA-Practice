package Arrays;
import java.util.*;

public class GFGRichestcustomerwealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the values in matrix : ");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j<c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
       System.out.println("Richest Customer Wealth : " + maximumwealth(arr)); 
    }
    public static int maximumwealth(int[][] nums)
    {   
        int max = 0;
        for (int i = 0; i<nums.length; i++)
        {
            int sum = 0;
            for (int j = 0; j<(nums[i].length); j++)
            {
                sum = sum + nums[i][j];
            }
            if(max<sum)
            {
                max = sum;
            }
            
        }
        return max;
    }
}
