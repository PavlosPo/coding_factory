package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει
 * με βάση την θερμοκρασία. Αν η
 * θερμοκρασία είναι μικρότερη από 0,
 * τότε χιονίζει αλλιώς δεν χιονίζει.
 * Ο χρήστης δίνει την θερμοκρασία.
 *
 */

public class TeemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("is snowing: " + isSnowing);
    }
}
