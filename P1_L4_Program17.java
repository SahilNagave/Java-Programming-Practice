// Take a two-digit number and print its:

// Tens digit
// Ones digit

import java.util.Scanner;

public class P1_L4_Program17 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two digit number : ");
        int number = sc.nextInt();

        int tensDigit = number / 10;
        int onesDigit = number % 10;

        System.out.println("Tens Digit : " + tensDigit);
        System.out.println("Ones Digit : " + onesDigit);

        sc.close();

    }
}