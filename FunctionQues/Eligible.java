package FunctionQues;
import java.util.*;
public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        VoteEligible(age);
    }

    public static void VoteEligible(int n)
    {
        if (n>=18)
        System.out.println("Eligible to Vote!");
        else
        System.out.println("Sorry, Not Eligible!");
    }
}
