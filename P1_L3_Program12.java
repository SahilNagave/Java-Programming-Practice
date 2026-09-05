// Swap Two Numbers without using a third variable

import java.util.Scanner;

public class P1_L3_Program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int firstNumber  = sc.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();

        System.out.println();
        System.out.println("Before Swapping -->");
        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
        System.out.println();

        firstNumber  = firstNumber * secondNumber;
        secondNumber = firstNumber / secondNumber;
        firstNumber  = firstNumber / secondNumber;

        System.out.println("After Swapping (without third variable) -->");
        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        sc.close();

    }
}