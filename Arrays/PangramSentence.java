package Arrays;
import java.util.*;
public class PangramSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        System.out.println(PangramTest(s));        
    }
    public static boolean PangramTest(String s)
    {
        boolean[] arr = new boolean[26];
        s = s.toLowerCase();
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z')
            {
                arr[s.charAt(i) - 'a'] = true;
            }
        }
        for(int i = 0; i<26; i++)
        {
            if(arr[i] == false)
            {
                return false;
            }
        }
    return true;
    }
}
