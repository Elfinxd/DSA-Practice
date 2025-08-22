package KKQues.FlowofPrograms;
import java.util.*;
public class HCFLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        LCMHCFis(a, b);
    }

    public static void LCMHCFis(int n1, int n2)
    {
        int a = n1, b = n2; int r = 0;
        while(n2 != 0)
        {
            r = n2;
            n2 = n1 % n2;
            n1 = r;
        }
        int hcf = n1;
        System.out.println("HCF of the given two numbers is: " + hcf);
        int lcm = (a * b)/hcf;
        System.out.println("LCM of the given two numbers is: " + lcm);

    }
}
