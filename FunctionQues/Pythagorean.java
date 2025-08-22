package FunctionQues;
import java.util.*;
public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers!");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isPytha(a, b, c);
    }
        public static void isPytha(int n1, int n2, int n3)
        {
            if((n1*n1)+(n2*n2) == (n3*n3) || (n2*n2)+(n3*n3) == (n1*n1) || (n1*n1)+(n3*n3) == (n2*n2))
            {
                System.out.println("Its Pythagorean Triplet!");
            }
            else{
                System.out.println("Sorry its Not!");
            }
        }

    
}
