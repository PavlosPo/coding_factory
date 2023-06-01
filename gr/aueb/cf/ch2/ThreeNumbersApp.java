package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη τρεις ακεραίους,
 * τους μειώνει κατά μία μονάδα και τους
 * εμφανίζει με την ίδια σειρά που δόθηκαν
 * αφήνοντας ένα κενό ανάμεσά τους.
 */

public class ThreeNumbersApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // Εντολές
        System.out.println("Please insert three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        num1 -= 1;
        num2 -= 1;
        num3 -= 1;

        // Αποτελέσματα
        System.out.printf("%d %d %d", num1, num2, num3);
    }
}
