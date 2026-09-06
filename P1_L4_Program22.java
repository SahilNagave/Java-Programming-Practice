// Reverse a 3-Digit Number

import java.util.Scanner;

public class P1_L4_Program22 {
    public static  void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int number = sc.nextInt();

        int reverse         = 0;
        int lastDigit       = number % 10;
        reverse             = reverse * 10 + lastDigit;
        int removeLastDigit = number / 10;
        int middleDigit     = removeLastDigit % 10;
        reverse             = reverse * 10 + middleDigit;
        int firstDigit      = removeLastDigit / 10;
        reverse             = reverse * 10 + firstDigit;

        System.out.println("Reversed number : " + reverse);

        sc.close();

    }
}