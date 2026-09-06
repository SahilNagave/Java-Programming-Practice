// Take a three-digit number and calculate the sum of its digits.

import java.util.Scanner;

public class P1_L4_Program21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int number = sc.nextInt();

        int total           = 0;
        int lastDigit       = number % 10;
        total               = total + lastDigit;
        int removeLastDigit = number / 10;
        int middleDigit     = removeLastDigit % 10;
        total               = total + middleDigit;
        int firstDigit      = removeLastDigit / 10;
        total               = total + firstDigit;
        
        System.out.println("Sum : " + total);

        sc.close();

    }
}