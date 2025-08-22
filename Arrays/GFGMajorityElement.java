package Arrays;
import java.util.*;
public class GFGMajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in Array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Majority(arr));
    }
    public static List<Integer> Majority(int[] arr)
    {
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++)
        {  int c = 1;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    c++;
                }
            }
            if((c>(arr.length/3)) && !l.contains(arr[i]))
            {
                l.add(arr[i]);
            }
        
        }
        return l;
    }
}
