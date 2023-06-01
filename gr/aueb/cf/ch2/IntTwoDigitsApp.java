package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα διψήφιο ακέραιο
 * και βρίσκουμε το άθροισμα των δύο ψηφίων.
 */

public class IntTwoDigitsApp {

    public static void main(String[] args) {
        // Αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;

        // Εντολές
        System.out.println("Please insert a num with two digits");
        num = in.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;

        sumOfDigits = leftDigit + rightDigit;

        // Αποτελέσματα
        System.out.println("Sum: " + sumOfDigits);


    }
}
