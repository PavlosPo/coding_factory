package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Calculates the exponential
 * of a^n. n is given by the
 * user
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 1;

        System.out.println("Please give us the base and the power number:");
        a = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= a;
        }

        System.out.println("Result; " + result);
    }
}
