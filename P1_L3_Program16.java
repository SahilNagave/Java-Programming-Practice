// Take an integer and remove its last digit.

import java.util.Scanner;

public class P1_L3_Program16 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        int newNumber = number / 10;

        System.out.println("New number : " + newNumber);

        sc.close();

    }
}