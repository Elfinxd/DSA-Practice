package BasicQues;
import java.util.*;
class Tester {
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter a number: ");
	    int num = sc.nextInt();
	    int f = 1;
	    for(int i = num; i>0; i-- )
	    {
	        f = f * i;
	     }
		System.out.println("Factorial : " + f); 
		
	}
}
