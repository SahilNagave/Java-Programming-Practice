// Take basic salary as input.

// Calculate:

// HRA = 20% of basic salary
// DA = 10% of basic salary

// Gross Salary = Basic + HRA + DA

import java.util.Scanner;

public class P1_L4_Program19 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Basic Salary : ");
        double basicSalary = sc.nextDouble();

        double hra         = basicSalary * 0.2;
        double da          = basicSalary * 0.1;
        double grossSalary = basicSalary + hra + da;

        System.out.printf("HRA           : %.2f%n"  , hra);
        System.out.printf("DA            : %.2f%n"  , da);
        System.out.printf("Gross Salary  : %.2f%n " , grossSalary);

        sc.close();
    
    }
}