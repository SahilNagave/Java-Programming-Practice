// Take an integer and print its last digit.

import java.util.Scanner;

public class P1_L3_Program15 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        int lastDigit = number % 10;

        System.out.println("Last Digit : " + lastDigit);

        sc.close();

    }
}