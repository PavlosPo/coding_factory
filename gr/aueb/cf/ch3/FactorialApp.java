package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Υπολογίζει το n!
 *
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long facto = 1L;
        int i = 1;
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            facto *= i;
            i++;
        }

        System.out.printf("%d! = %,d", n, facto);
    }
}
