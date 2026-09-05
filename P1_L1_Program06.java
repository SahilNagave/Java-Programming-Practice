// Area of Rectangle
// Take length and breadth as input and calculate the area.

import java.util.Scanner;

public class P1_L1_Program06 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length (m) : ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth (m) : ");
        int breadth = sc.nextInt();

        int areaOfRectangle = length * breadth;
        System.out.println("Area of Rectangle (sqm) : " + areaOfRectangle);

        sc.close();

    }
}