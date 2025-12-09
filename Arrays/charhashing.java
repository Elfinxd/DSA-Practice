package Arrays;
import java.util.*;
public class charhashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //input
        System.out.println("Enter the  String : ");
        String s = sc.next();

        int[] hash = new int[26];       //pre-compute
        for(int i = 0; i<s.length(); i++)
        {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.println("Enter the no of queries : ");       //fetch
        int q = sc.nextInt();
        while(q-->0)
        {
            char c = sc.next().charAt(0);
            System.out.println("Frequency : " + hash[c - 'a']);
        }
    }
}
