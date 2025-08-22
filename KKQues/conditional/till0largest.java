package KKQues.conditional;
import java.util.*;
public class till0largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers and 0 for no more inputs : ");
        int max = Integer.MIN_VALUE;
        while (true)
        {   
            int num = sc.nextInt();
            if(num == 0)
            {
                break;
            }
            else{
                if(max<num)
                {
                    max = num;
                }
                else{
                    continue;
                }
            }    
        }
        System.out.println("Largest num among the numbers entered : " + max);
    }
}
