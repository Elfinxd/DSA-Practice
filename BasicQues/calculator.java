package BasicQues;

class Calculator {

public double findAverage(int num1, int num2, int num3)
{
    int avg = (num1 + num2 + num3)/3;
    return Math.round(avg * 100.0)/100.0;
}
}
    
class Tester{
    
    public static void main(String[] args) {
       
        Calculator calculator = new Calculator();
        System.out.println(calculator.findAverage(12,8 , 15));
        System.out.println(calculator.findAverage(10, 20, 30));
    }
}
 