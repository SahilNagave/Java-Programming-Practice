// Take temperature in Celsius and convert it to Fahrenheit.

import java.util.Scanner;

public class P1_L1_Program09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Temperature in Celsius : ");
        double celsius    = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32 ;
        System.out.println("Temperature in Fahrenheit is : " + fahrenheit);

        sc.close();

    }
}
