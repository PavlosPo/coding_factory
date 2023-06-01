package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει και εκτυπώνει από το stdin,
 * το start-end- step value and prints
 * the number of itterations.
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endvalue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Provide start, end and step values:");
        startValue = in.nextInt();
        endvalue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endvalue; i = i + step) {
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println("Iterations: " + iterations);



    }
}
