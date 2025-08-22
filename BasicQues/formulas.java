package BasicQues;
import java.util.*;
public class formulas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What u want to calculate? :\n"+ 
                            "1 - Area Of Triangle\n"+
                            "2 - Area Of Rectangle Program\n"+
                            "3 - Area Of Isosceles Triangle\n"+
                            "4 - Area Of Parallelogram\n"+
                            "5 - Area Of Rhombus\n"+
                            "6 - Area Of Equilateral Triangle\n"+
                            "7 - Perimeter Of Circle\n"+
                            "8 - Perimeter Of Equilateral Triangle\n"+
                            "9 - Perimeter Of Parallelogram\n"+
                            "10 - Perimeter Of Rectangle\n"+
                            "11 - Perimeter Of Square\n"+
                            "12 - Perimeter Of Rhombus\n"+
                            "13 - Volume Of Cone\n"+
                            "14 - Volume Of Prism\n"+
                            "15 - Volume Of Cylinder\n"+
                            "16 - Volume Of Sphere\n"+
                            "17 - Volume Of Pyramid\n"+
                            "18 - Curved Surface Area Of Cylinder\n"+
                            "19 - Total Surface Area Of Cube\n" 
                            );
        int choice = sc.nextInt(); Double area;
        switch (choice) {
            case 1:
                System.out.println("For Area of Circle enter radius  : ");
                double r = sc.nextDouble();
                area = 3.14 * r * r;
                System.out.println("Area: " + area);                
                break;
            case 2:
                System.out.println("For Area of Triangle enter base and height  : ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                area = (1/2)*base*height;
                System.out.println("Area :" + area);
                break;
            case 3:
                System.out.println("For Area of Rectangle enter Length and Breadth  : ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                area = length * breadth;
                System.out.println("Area :" + area);
                break;
            case 4:
                System.out.println("For Area of Isosceles Triangle enter equal side (a) and base (b): ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                area = (b / 4.0) * Math.sqrt((4 * a * a) - (b * b));
                System.out.println("Area: " + area);
                break;
            case 5:
                System.out.println("For Area of Parallelogram enter base and height: ");
                double baseP = sc.nextDouble();
                double heightP = sc.nextDouble();
                area = baseP * heightP;
                System.out.println("Area: " + area);
                break;
            case 6:
                System.out.println("For Area of Rhombus enter diagonals d1 and d2: ");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                area = 0.5 * d1 * d2;
                System.out.println("Area: " + area);
                break;
            case 7:
                System.out.println("For Area of Equilateral Triangle enter side: ");
                double sideEq = sc.nextDouble();
                area = (Math.sqrt(3) / 4) * sideEq * sideEq;
                System.out.println("Area: " + area);
                break;
            case 8:
                System.out.println("For Perimeter of Circle enter radius: ");
                double r1 = sc.nextDouble();
                area = 2 * 3.14 * r1;
                System.out.println("Perimeter: " + area);
                break;
            case 9:
                System.out.println("For Perimeter of Equilateral Triangle enter side: ");
                double s = sc.nextDouble();
                area = 3 * s;
                System.out.println("Perimeter: " + area);
                break;
            case 10:
                System.out.println("For Perimeter of Parallelogram enter side1 and side2: ");
                double p1 = sc.nextDouble();
                double p2 = sc.nextDouble();
                area = 2 * (p1 + p2);
                System.out.println("Perimeter: " + area);
                break;
            case 11:
                System.out.println("For Perimeter of Rectangle enter length and breadth: ");
                double l1 = sc.nextDouble();
                double b1 = sc.nextDouble();
                area = 2 * (l1 + b1);
                System.out.println("Perimeter: " + area);
                break;
            case 12:
                System.out.println("For Perimeter of Square enter side: ");
                double side = sc.nextDouble();
                area = 4 * side;
                System.out.println("Perimeter: " + area);
                break;
            case 13:
                System.out.println("For Perimeter of Rhombus enter side: ");
                double rh = sc.nextDouble();
                area = 4 * rh;
                System.out.println("Perimeter: " + area);
                break;
            case 14:
                System.out.println("For Volume of Cone enter radius and height: ");
                double r2 = sc.nextDouble();
                double h2 = sc.nextDouble();
                area = (1.0 / 3) * 3.14 * r2 * r2 * h2;
                System.out.println("Volume: " + area);
                break;
            case 15:
                System.out.println("For Volume of Prism enter base area and height: ");
                double baseArea = sc.nextDouble();
                double h3 = sc.nextDouble();
                area = baseArea * h3;
                System.out.println("Volume: " + area);
                break;
            case 16:
                System.out.println("For Volume of Cylinder enter radius and height: ");
                double r3 = sc.nextDouble();
                double h4 = sc.nextDouble();
                area = 3.14 * r3 * r3 * h4;
                System.out.println("Volume: " + area);
                break;
            case 17:
                System.out.println("For Volume of Sphere enter radius: ");
                double rs = sc.nextDouble();
                area = (4.0 / 3) * 3.14 * rs * rs * rs;
                System.out.println("Volume: " + area);
                break;
            case 18:
                System.out.println("For Volume of Pyramid enter base area and height: ");
                double bArea = sc.nextDouble();
                double h5 = sc.nextDouble();
                area = (1.0 / 3) * bArea * h5;
                System.out.println("Volume: " + area);
                break;
            case 19:
                System.out.println("For Curved Surface Area of Cylinder enter radius and height: ");
                double r4 = sc.nextDouble();
                double h6 = sc.nextDouble();
                area = 2 * 3.14 * r4 * h6;
                System.out.println("CSA: " + area);
                break;
            case 20:
                System.out.println("For Total Surface Area of Cube enter side: ");
                double cubeSide = sc.nextDouble();
                area = 6 * cubeSide * cubeSide;
                System.out.println("TSA: " + area);
                break;
            default:
                System.out.println("Invalid choice!");
        }   
         
    }
}