// Take the number of days and convert it approximately into:

// Years
// Months
// Days

// Assume:

// 1 year = 365 days
// 1 month = 30 days

import java.util.Scanner;

public class P1_L4_Program20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days : ");
        int inputDays = sc.nextInt();

        int years         = inputDays / 365;
        int remainingDays = inputDays % 365;
        int months        = remainingDays / 30;
        int days          = remainingDays % 30;

        System.out.println("Years  : " + years);
        System.out.println("Months : " + months);
        System.out.println("Days   : " + days);

        sc.close();

    }
}