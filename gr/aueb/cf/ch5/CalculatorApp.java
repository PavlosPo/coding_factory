package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υλοποιεί έναν απλό calculator που παρέχει
 * τις υπηρεσίες add, sub, mul, dic, mod.
 * Εμφανίζει ένα Μενού προς τον χρήστη με επιλογές,
 * λαμβάνει την τιμή της επιλογής, και στη
 * συνέχεια δύο ακόμα τιμές των num1, num2.
 * Και τελικά εμφανίζει το αποτέλεσμα.
 */
public class CalculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result = 0;

        do {
             printMenu();
             choice = getNextInt("Please insert your choice");
             // validation
             if (isChoiceInvalid(choice)) {
                 // main does the I.O. so here we will print the error message
                 System.out.println("Choice is invalid");
                 continue;
             }
             if (isChoiceQuit(choice)) {
                 break;
             }
             result = onChoiceGetResult(choice);
            System.out.println("Result = " + result);
        } while (true);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο");
        System.out.println("6. Έξοδος");
    }

    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        // return true when it IS invalid
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        int Value = 0;
        if (num2 == 0) {
            Value = Integer.MAX_VALUE;
        } else {
            Value = num1 / num2;
        }
        return Value;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert the first number");
        int num2 = getNextInt("Please insert the second number");
        int result = 0;

        switch (choice){
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;
        }

        return result;
    }
}
