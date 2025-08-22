package Arrays;
import java.util.*;
public class GFGGreatestNumberofCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array of kids with candies : ");
        int num = sc.nextInt();
        int[] candies = new int[num];
        System.out.println("Fill the array with values : ");
        for(int i = 0; i<num; i++)
        {
            candies[i] = sc.nextInt();
        }
        System.out.println("Enter number of extra Candies : ");
        int ec = sc.nextInt();
        System.out.println(kidsWithCandies(candies,  ec));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int max = 0;
        List<Boolean> TF = new ArrayList<Boolean>();
        for(int i = 0; i<candies.length; i++)
        {
            if(max<candies[i])
            {
                max = candies[i];
            }
        }
        for(int i = 0; i<candies.length; i++)
        {
            if((extraCandies + candies[i])>=max)
            {
                TF.add(true);
            }
            else{
                TF.add(false);
            }
        }
        return TF;
    
    }
}
