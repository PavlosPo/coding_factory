package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένας int είναι
 * άρτιος ή περιττός
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean isNumEven = false;

        System.out.println("Please insert an int");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.printf("Num %d is even: ", num, isNumEven);
    }

    /**
     * Evaluates an int if it is even or not.
     *
     * @param n     the number (int) to evaluate.
     * @return      true, if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

}
