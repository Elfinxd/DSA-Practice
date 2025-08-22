package BasicQues;
import java.util.*;
public class loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account No.: ");
        int Accno = sc.nextInt();
        System.out.println("Accout Balance: ");
        double AccBal = sc.nextDouble();
        System.out.println("Enter the Salary: ");
        double sal = sc.nextDouble();
        System.out.println("Which type of loan needed: ");
        String LT = sc.next();
        System.out.println("Loan Amount Expected: ");
        double ExpLamt = sc.nextDouble();
        System.out.println("Expected Num of EMIs: ");
        int ExpEMI = sc.nextInt();
        if((Accno<1000) || (Accno>9999) || Integer.toString(Accno).charAt(0) != '1')
        {
            System.out.println("Invalid Account Number!");
        }
        else if(AccBal<1000)
        {
            System.out.println("Insufficient Balance!");
        }
        else
        {
            double EliLamt = 0;
            int EliEMI = 0;
            boolean eligible = false;

            if(sal>25000 && LT.equalsIgnoreCase("Car"))
            {
                EliLamt = 500000;
                EliEMI = 36;
                eligible = true;
            }
            else if(sal>50000 && LT.equalsIgnoreCase("House"))
            {
                EliLamt = 6000000;
                EliEMI = 60;
                eligible = true;
            }
            else if(sal>75000 && LT.equalsIgnoreCase("Business"))
            {
                EliLamt = 7500000;
                EliEMI = 84;
                eligible = true;
            }

            if (eligible && ExpLamt<=EliLamt && ExpEMI<=EliEMI)
            {
                System.out.println("Account Number: " + Accno + " is eligible for Loan.");
                System.out.println("Eligible Loan Amt: " + EliLamt);
                System.out.println("Eligible EMIs: " + EliEMI);
            }
            else{
                System.out.println("Sorry, not eligible for Loan!");
            }
        }
    }
}
