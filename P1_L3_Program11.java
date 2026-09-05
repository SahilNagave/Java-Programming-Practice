// Swap Two Numbers using third variable

import java.util.Scanner;

public class P1_L3_Program11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();

        System.out.println();
        System.out.println("Before Swapping -->");
        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
        System.out.println();

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After Swapping (using third variable) -->");
        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        sc.close();

    }
}