package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */
public class LinearBingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;

        while (true) {
            System.out.println("Please provide a secret num");
            num = in.nextInt();

            if (SECRET != num) {
                System.out.println("Try Again!");
                continue;
            }
            System.out.println("Try again!");
            break;

        }
    }
}
