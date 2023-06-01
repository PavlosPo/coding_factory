package gr.aueb.cf.ch4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Adds and multiplies
 * n first numbers.
 * n is given by the user.
 */
public class AddMulApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int result = 1;

        System.out.println("Please give n number for range.");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
            result *= i;
        }

        System.out.printf(Locale.US, "sum: %d, mul result: %,d", sum, result);

    }
}
