package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ternary operator
 * τριαδικος τελεστής
 */

public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please provide num");
        num = in.nextInt();

        abs = (num > 0) ? num : -num;
        abs = (num > 0) ? num : (num < 0) ? -num : 0;

        System.out.println("ABS Num: " + abs);
    }
}
