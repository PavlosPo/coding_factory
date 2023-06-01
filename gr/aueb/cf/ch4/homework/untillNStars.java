package gr.aueb.cf.ch4.homework;


import java.util.Scanner;

/**
 * Prints 1 star at first loop and adds one, until number of n loops.
 *
 */
public class untillNStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give n value:");
        n = in.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
