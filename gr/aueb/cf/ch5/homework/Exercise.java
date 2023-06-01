package gr.aueb.cf.ch5.homework;

import java.util.Scanner;

/**
 * It prints a menu with 6 choices.
 * the user inserts one.
 * The program will be illustrated with methods.
 */
public class Exercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int choice = 0;

        do {

            showMenuOptions();

            // Choice given
            System.out.println("Δώσε επιλογή");
            choice = in.nextInt();

            // Raise error if not in range of choices
            if (choice > 6 || choice < 1) {
                System.out.println("Please give a correct choice option!");
                continue;
            }

            // Quit if 6 is given
            if (choice == 6) {
                // A method I created to exit the program
                exit();
            }

            // Number of Stars given
            System.out.println("Δώστε αριθμό για αστεράκια");
            n = in.nextInt();

            doInputFromMenu(choice, n);

        } while (true);
    }

    /**
     * Creates n horizontal Stars
     * @param n
     */
    public static void horizontalStars(int n) {
        for (int i = 1; i <= n ; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    /**
     * It prints n vertical Stars
     * @param n
     */
    public static void verticalStars(int n) {
        for (int i = 1; i <= n ; i++) {
            System.out.println("*");
        }
    }

    /**
     * It prints n x n Stars.
     * @param n
     */
    public static void nxnStars(int n){
        // It changes the row
        for (int i = 1; i<= n; i++) {
            // It prints in every row
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * It prints 1 star more in every row, having n rows.
     * @param n
     */
    public static void oneToNStars(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /** Tt prints n stars and subtracts one in every row.
     * There are n rows.
     * @param n
     */
    public static void nToOneStars(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exit(){
        System.exit(1);
    }

    /**
     * It prints the Menu Options available
     */
    public static void showMenuOptions() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια  κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    /**
     * Gets the choice givven, as well as the n number of stars
     * and does the relevant functionality.
     * @param choice    The choice given from the menu
     * @param n         The n number of stars, given by the user
     */
    public static void doInputFromMenu(int choice, int n) {
        switch (choice) {
            case 1:
                horizontalStars(n);
                break;
            case 2:
                verticalStars(n);
                break;
            case 3:
                nxnStars(n);
                break;
            case 4:
                oneToNStars(n);
                break;
            case 5:
                nToOneStars(n);
                break;
            case 6:
                exit();
                break;
            default:
                break;
        }
    }
}
