package Arrays;
import java.util.*;
public class GFGMovezerostoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in Array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(movezeros(arr)));
    }
    public static int[] movezeros(int[] arr)
    // {
    //     int count = 0;
    //     for(int i= 0; i<arr.length; i++)
    //     {
    //         if(arr[i] != 0)
    //         {
    //             int temp = arr[i];
    //             arr[i] = arr[count];
    //             arr[count] = temp;
    //             count++;
    //         }
    //     }
    //     return arr;
    // }
    {
        // List<Integer> l = new ArrayList<>();
        // for(int i = 0; i<arr.length; i++)
        // {
        //     if(arr[i] != 0)
        //     {
        //         l.add(arr[i]);
        //     }
        // }
        // for(int i = 0; i<arr.length; i++)
        // {
        //     if(arr[i] ==0)
        //     {
        //         l.add(arr[i]);
        //     }
        // }
        // for(int i = 0; i<arr.length; i++)
        // {
        //     arr[i] = l.get(i);
        // }
        // return arr;

        int j = 0; 
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<arr.length)
        {
            arr[j] = 0;
            j++;
        }
       return arr;
    }
    }

