package BasicQues;
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i =0;
        int lcm = 0;
        if(n1<n2)
        i = n1;
        else
        i = n2;
        while(true){
        if(i % n1 == 0 && i% n2 == 0)
        {
            lcm = i;
          System.out.println("LCM : " + lcm);
          break;
        }
        else{
            i++;
        }
    }
    }
}
