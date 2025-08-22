package BasicQues;
import java.util.*;
    public class food {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Food type you need to Order: ");
            char F = sc.next().charAt(0);
            System.out.println("Quantity you want to order: ");
            int Q = sc.nextInt();
            System.out.println("Distance to be covered for delivery: ");
            int D = sc.nextInt();
            if ((F != 'V' && F != 'N') || D<=0 || Q<1)
            {
                System.out.println("Invalid Input, Bill Amt: -1");
            }
            else{
                int FC = 0;
                if(F == 'V')
                {
                    FC = FC + (12*Q);
                }
                else{
                    FC = FC + (15*Q);
                }
                int DC = 0;
                if(D > 3)
                {
                    int rem = D - 3;
                    if (rem <= 3)
                    {
                        DC = DC + (rem * 1); 
                    }
                    else{
                        DC = DC + ((3*1) + (rem-3)*2);
                    } 
                }
                
                int TC = FC + DC;
                System.out.println("Total Cost: " + TC);
                
            }

        }
    }