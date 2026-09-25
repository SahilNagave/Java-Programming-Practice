// Take three numbers and print the greatest.

import java.util.Scanner;

public class P2_Part_A_Program05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first  number  : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number  : ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter third  number  : ");
        int thirdNumber = sc.nextInt();

        if(firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        }

        else if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " is GREATEST");
        }

        else if(secondNumber > thirdNumber) {
            System.out.println(secondNumber + " is GREATEST");
        }

        else {
            System.out.println(thirdNumber + " is GREATEST");     
        }
        
        sc.close();

    }
}