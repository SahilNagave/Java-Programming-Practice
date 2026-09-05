// Area of Circle
// Take radius as input and calculate the area of a circle.

import java.util.Scanner;

public class P1_L1_Program07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius(cm) : ");
        double radius = sc.nextDouble();

        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("Area of Circle(cm²) : " + areaOfCircle);

        sc.close();
        
    }
}