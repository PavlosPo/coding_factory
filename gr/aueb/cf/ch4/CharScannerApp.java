package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει έναν char με
 * Scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        inputChar = in.next().charAt(0);

        System.out.println("Char: " + inputChar);
    }
}
