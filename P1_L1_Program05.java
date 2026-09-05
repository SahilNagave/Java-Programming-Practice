// Take two numbers and print:

// Addition
// Subtraction
// Multiplication
// Division
// Remainder

import java.util.Scanner;

public class P1_L1_Program05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();

        double addition  = num1 + num2;
        System.out.println("Addition of two numbers       : " + addition);

        double subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers    : " + subtraction);

        double multiplication = num1 * num2;
        System.out.println("Multiplication of two numbers : " + multiplication);

        double division = num1 / num2;
        System.out.println("Division of two numbers       : " + division);

        double remainder = num1 % num2;
        System.out.println("Remainder of two numbers      : " + remainder);

        sc.close();

    }

}