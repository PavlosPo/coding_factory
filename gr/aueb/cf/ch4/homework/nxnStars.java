package gr.aueb.cf.ch4.homework;

import java.util.Scanner;

/**
 * Prints n x n matrix of stars
 */
public class nxnStars {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give n value:");
        n = in.nextInt();

        // It changes the row
        for (int i = 1; i<= n; i++) {
            // It prints in every row
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
