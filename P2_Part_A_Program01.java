// Take the number of units consumed.

// Use:

// First 100 units  → ₹5/unit
// Next 100 units   → ₹7/unit
// Above 200 units  → ₹10/unit

// Calculate the total bill.

import java.util.Scanner;

public class P2_Part_A_Program01 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed : ");
        int unitsConsumed = sc.nextInt();

        int bill = 0;

        if(unitsConsumed < 0) {
            System.out.println("Invalid Input");
        }
        
        else if(unitsConsumed <= 100) {
            bill = unitsConsumed * 5;
            System.out.println("Total Electricity Bill(Rupees) : " + bill);
        }
        
        else if(unitsConsumed <= 200) {
            bill = 100 * 5 + (unitsConsumed - 100) * 7;
            System.out.println("Total Electricity Bill(Rupees) : " + bill);
        }

        else {
            bill = 100 * 5 + 100 * 7 + (unitsConsumed - 200) * 10;
            System.out.println("Total Electricity Bill(Rupees) : " + bill);
        }

        sc.close();

    }   
}