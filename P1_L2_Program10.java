// Average of Three Numbers
// Take three numbers from the user and calculate their average.

import java.util.Scanner;

public class P1_L2_Program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int firstNumber  = sc.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter third number  : ");
        int thirdNumber  = sc.nextInt();

        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        System.out.printf("Average of Three Numbers :  %.2f%n", average);

        sc.close();
        
    }
}