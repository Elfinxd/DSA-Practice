package BasicQues;
import java.util.*;
    public class SI {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Principal amount: ");
            int P = sc.nextInt();
            System.out.println("Enter Time period: ");
            int T = sc.nextInt();
            System.out.println("Enter Rate: ");
            int R = sc.nextInt();
            int si = (P*R*T)/100;
            System.out.println("Simple Interest is: " + si);
        }
}
