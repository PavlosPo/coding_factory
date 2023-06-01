package gr.aueb.cf.ch4.homework;

import java.util.Scanner;

/**
 * Prints n value of stars and descend one each row.
 */
public class untilOneStar {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give n value:");
        n = in.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
