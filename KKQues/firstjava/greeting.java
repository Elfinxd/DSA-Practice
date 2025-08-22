package KKQues.firstjava;
import java.util.*;
public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        greet(name);
    }
        public static void greet(String n){
        System.out.println("Hey " + n+"!" + "\nJust wanted to drop by and send some good vibes your way. Hope your day is as awesome as you are — keep shining and doing great things!");
    }
}
