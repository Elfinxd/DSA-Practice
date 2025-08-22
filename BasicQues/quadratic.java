package BasicQues;
import java.util.*;
class quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c :");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat(); 
        if(a == 0)
        {
            System.out.println("Not a quadratic Equation.");
            return;
        }
		float D = (b * b) - (4 * a * c); 
		if (D == 0)
		{
		    double x = (-b + Math.sqrt(D))/(2*a);
		    System.out.println("The root value is same: " + x);
		}
		else if(D > 0)
		{
		    double x1 = (-b + Math.sqrt(D))/(2*a);
		    double x2 = (-b - Math.sqrt(D))/(2*a);
		    System.out.println("The roots will be unequal real roots: " + x1 + "," + x2);
		    
		}
		else if(D < 0)
		{
		    System.out.println("The equation has no real roots");
		}
	}
}
