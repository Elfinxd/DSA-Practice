package BasicQues;
import java.util.*;
public class nextdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Date : ");
        int date = sc.nextInt();
        System.out.print("Enter the Month : ");
        int month = sc.nextInt();
        System.out.print("Enter the Year : ");
        int year = sc.nextInt();

        int maxdays = 0;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
        {
            maxdays = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            maxdays = 30;
        }
        else if(month == 2)
        {
            if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
            {
                maxdays = 29;
            }
            else
            {
                maxdays = 28;
            }
        }

        if (date < maxdays)
        {
            date++;
        }
        else{
            date = 1;
            if(month == 12)
            {
                month = 1;
                year++;
            }
            else{
                month++;
            }
        }
        
        System.out.println(date + "-" + month + "-" + year);
    }
}
