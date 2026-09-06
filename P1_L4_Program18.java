// Reverse a Two-Digit Number

import java.util.Scanner;

public class P1_L4_Program18 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two digit number : ");
        int number = sc.nextInt();

        int reverse       = 0;
        int onesDigit     = number % 10;
        reverse           = reverse  * 10 + onesDigit;
        int tensDigit     = number / 10;
        reverse           = reverse * 10 + tensDigit; 

        System.out.println("Reversed Number : " + reverse);

        sc.close();

    }
}