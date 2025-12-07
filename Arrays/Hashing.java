package Arrays;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values in array :");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        //precomputation
        int[] hash = new int[100];
        for(int i = 0; i<n; i++)
        {
            hash[arr[i]]++;
        }
        //fetch
        int q = sc.nextInt();    //query
        while(q-->0)
        {
            int number = sc.nextInt();
            System.out.println("Frequency: " + hash[number]);
        }
    }    
}
