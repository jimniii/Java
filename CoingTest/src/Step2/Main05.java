package Step2;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (hour > 0 && hour < 24) {
            if (minute < 45) {
                System.out.println((hour - 1) + " " + (minute + 60 - 45));
            } else {
                System.out.println(hour + " " + (minute - 45));
            }
        } else if (hour == 0) {
            if (minute < 45) {
                System.out.println(23 + " " + (minute + 60 - 45));
            } else {
                System.out.println(hour + " " + (minute - 45));
            }
        }
    }
}
