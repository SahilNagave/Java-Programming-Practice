// Take hours, minutes and seconds as input and convert everything into seconds.

import java.util.Scanner;

public class P1_L4_Program23 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours   : ");
        int hours   = sc.nextInt();

        System.out.print("Enter minutes : ");
        int minutes = sc.nextInt();

        System.out.print("Enter seconds : ");
        int seconds = sc.nextInt();

        int hoursSeconds   = hours * 3600;
        int minutesSeconds = minutes * 60;
        int totalSeconds   = hoursSeconds + minutesSeconds + seconds;

        System.out.println("Total Seconds : " + totalSeconds);

        sc.close();

    }
}