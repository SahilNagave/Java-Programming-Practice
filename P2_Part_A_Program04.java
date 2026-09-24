// Take two numbers and print the greater number.

import java.util.Scanner;

public class P2_Part_A_Program04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();

        if(firstNumber == secondNumber) {
            System.out.println("Both numbers are equal");
        }

        else if(firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);                 
        }

        else {
            System.out.println(secondNumber + " is greater than " + firstNumber);     
        }
        
        sc.close();

    }
}