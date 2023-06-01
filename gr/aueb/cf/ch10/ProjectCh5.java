package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * Prints stars.
 */
public class ProjectCh5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String response;

        do {
            printMenu();
            response = getChoice();

            try {
                if (response.matches("[Qq]")) {     // .matches είναι ίδια με .equals αλλά παίρνει και RegEx.
                    quit = true;
                } else {
                    printOnChoice(response);    // Throws IllegalArgumentException
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice");
            }
        } while (!quit);

    }

    public static void printMenu () {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Horizontal Stars");
        System.out.println("2. Vertical Stars");
        System.out.println("3. HV Stars");
        System.out.println("4. HV Asc Stars");
        System.out.println("5. HV Desc Stars");
        System.out.println("Q/q. Quit");
    }

    public  static void printOnChoice(String s) {
        int choice = -1;
        int n = 0;

        try {
            if (s == null) throw new IllegalArgumentException();
            choice = Integer.parseInt(s);
            if (choice >= 1 && choice <= 5) {
                System.out.println("Please insert the number of stars: ");
                n = Integer.parseInt(getChoice());
            }
            switch (choice) {
                case 1:
                    System.out.println("Horizontal Stars");
                    printStarsH(n);
                    break;
                case 2:
                    System.out.println("Vertical Stars");
                    printStarsV(n);
                    break;
                case 3:
                    System.out.println("HV Stars");
                    printStartHV(n);
                    break;
                case 4:
                    System.out.println("HV Asc Stars");
                    printStarsHVAsc(n);
                    break;
                case 5:
                    System.out.println("HV Desc Stars");
                    printStarsHVDesc(n);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            // e.printStackTrace();
            throw e;

        }
    }

    public static String getChoice () {
        return in.nextLine().trim();
    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStartHV(int n){
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    public static void printStarsHVAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printStarsHVDesc (int n) {
        for (int i = 1; i <= n ; i++) {
            printStarsH(n - i + 1);
            System.out.println();
        }
    }
}
