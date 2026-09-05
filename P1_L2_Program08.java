// Simple Interest
// Take:

// Principal
// Rate
// Time

import java.util.Scanner;

public class P1_L1_Program08 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal : ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate      : ");
        double rate      = sc.nextDouble();

        System.out.print("Enter the Time      : ");
        double time      = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100 ; 
        System.out.println("Simple Interest     : " + simpleInterest);

        sc.close();
    }
}