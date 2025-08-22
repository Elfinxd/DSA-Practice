package FunctionQues;
import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks :");
        int marks = sc.nextInt();

        gradeis(marks);
    }

    public static void gradeis(int num)
    {
        if(num<=40)
        System.out.println("You have failed!");
        else if(num>=41 && num<=50)
        System.out.println("YOur Grade is : DD");
        else if(num>=51 && num<=60)
        System.out.println("Your Grade is : CD");
        else if(num>=61 && num<=70)
        System.out.println("Your Grade is : BC");
        else if(num>=71 && num<=80)
        System.out.println("Your Grade is : BB");
        else if(num>=81 && num<=90)
        System.out.println("Your Grade is : AB");
        else if(num>=91 && num<=100)
        System.out.println("Your grade is : AA");

    }
}
