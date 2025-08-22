package BasicQues;
import java.util.*;
public class ChickenRabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the num of head and legs: ");
        int Head = sc.nextInt();
        int Leg = sc.nextInt();
        /*  we know Head = Chicken + Rabbit
            SO eq1: chicken = head - Rabbit
            and for legs we know that 2 for chicken and 4 for rabbit
            so equation 2 will be 2C + 4R = L
            now we put eq1 in 2: 2(H-R)+4R = L
            2H-2R+4R=L => 2H + 2R = L
            R = (L - 2H)/2
            so the rabbit is = (Leg - 2*head)/2
        */
        int rabbit = (Leg - 2*Head)/2;
        int chicken = Head - rabbit;

        if (rabbit<0 || chicken<0 || Leg % 2 != 0)
        {
            System.out.println("The number of chicken and rabbits cannot be found!");
        }
        else{
            System.out.println("No of Chickens: " + chicken);
            System.out.println("No of Rabbits: " + rabbit);
        }
    }
}
