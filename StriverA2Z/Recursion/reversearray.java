package StriverA2Z.Recursion;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        func(arr, i);
        for(int j = 0; j<arr.length; j++)
        {
            System.out.println(arr[j]);
        }
    }
    public static void func(int[] arr, int i)
    {
        if(i>=arr.length/2)
        {
            return;
        }

        int temp = arr[arr.length-i-1];
        arr[arr.length-i-1] = arr[i];
        arr[i] = temp;

        func(arr, i+1);
    }    
}
