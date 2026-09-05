// Calculate Total and Percentage
// Take marks of 5 subjects.
// Calculate:
// Total marks
// Percentage
// Assume every subject is out of 100.

import java.util.Scanner;

public class P1_L3_Program13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks of Subject1 : ");
        int subject1 = sc.nextInt();

        System.out.print("Enter the marks of Subject2 : ");
        int subject2 = sc.nextInt();

        System.out.print("Enter the marks of Subject3 : ");
        int subject3 = sc.nextInt();

        System.out.print("Enter the marks of Subject4 : ");
        int subject4 = sc.nextInt();

        System.out.print("Enter the marks of Subject5 : ");
        int subject5 = sc.nextInt();

        int totalMarks    = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage  : " + percentage + "%");

        sc.close();

    }
}