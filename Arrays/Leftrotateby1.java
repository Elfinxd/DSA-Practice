package Arrays;
import java.util.*;
public class Leftrotateby1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values in array : ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(leftRotate(arr)));
    }
    public static int[] leftRotate(int[] arr)
    {
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
