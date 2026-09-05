// Take two integers from the user and print their sum.

import java.util.Scanner;

public class P1_L1_Program04 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int total = num1 + num2;
        System.out.println("Sum :  " + total);

        sc.close();
        
    }

}