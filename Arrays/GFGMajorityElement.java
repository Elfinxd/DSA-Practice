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
        // List<Integer> l = new ArrayList<Integer>();
        // for(int i = 0; i<arr.length; i++)
        // {  int c = 1;
        //     for(int j = i+1; j<arr.length; j++)
        //     {
        //         if(arr[i] == arr[j])
        //         {
        //             c++;
        //         }
        //     }
        //     if((c>(arr.length/3)) && !l.contains(arr[i]))
        //     {
        //         l.add(arr[i]);
        //     }
        
        // }
        // return l;

        
        //Moore's Voting Algorithm
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(ele1 == arr[i])
            cnt1++;
            else if(ele2 ==arr[i])
            cnt2++;
            else if(cnt1 == 0)
            {
                ele1 = arr[i];
                cnt1++;
            }
            else if(cnt2 == 0)
            {
                ele2 = arr[i];
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(ele1 == arr[i])
            cnt1++;
            if(ele2 == arr[i])
            cnt2++;
        }
        if(cnt1 > (arr.length/3))
        l.add(ele1);
        if(cnt2 > (arr.length/3))
        l.add(ele2);

        if(l.size() == 2 && l.get(0)>l.get(1))
        {
            int temp = l.get(0);
            l.set(0, l.get(1));
            l.set(1, temp);
        }
        return l;
    }
}
