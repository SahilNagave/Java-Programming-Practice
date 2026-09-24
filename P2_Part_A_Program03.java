// Take an integer and determine whether it is even or odd.

import java.util.Scanner;

public class P2_Part_A_Program03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is an EVEN number");
        }

        else {
            System.out.println(number + " is an ODD number");
        }
        
        sc.close();
    }
}