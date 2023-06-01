package gr.aueb.cf.ch4.homework;

import java.util.Scanner;

/**
 * Prints n number of Stars horizontally.
 */
public class verticalyStars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give n value:");
        n = in.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("*");
        }
    }
}
