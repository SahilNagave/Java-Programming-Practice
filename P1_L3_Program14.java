// Take a number of seconds and convert it into:

// Hours
// Minutes
// Seconds

import java.util.Scanner;

public class P1_L3_Program14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds : ");
        int inputSeconds = sc.nextInt();

        int hours            = inputSeconds / 3600;
        int remainingSeconds = inputSeconds % 3600;
        int minutes          = remainingSeconds / 60;
        int seconds          = remainingSeconds %  60;

        System.out.println("Hours   : " + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds);

        sc.close();

    } 
}