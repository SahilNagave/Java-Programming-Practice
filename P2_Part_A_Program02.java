// Take a number and print whether it is:

// Positive
// Negative
// Zero

import java.util.Scanner;

public class P2_Part_A_Program02 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if(number == 0) {
            System.out.println("Input is a ZERO");
        }

        else if(number > 0) {
            System.out.println(number + " is a POSITIVE NUMBER");
        }

        else {
            System.out.println(number + " is a NEGATIVE NUMBER");

        }

        sc.close();

    }

}