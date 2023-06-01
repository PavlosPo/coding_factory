package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 5;
        int num2 = 0;
        int result;

        System.out.println("Please insert num");
        num1 = in.nextInt();
        num2 = in.nextInt();

        // num2 = 0 : state dependent, δημιουργείται από μία τιμή.
//        try {
//            result = num1 / num2;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println("Please take care");
//        }
        // Στα state dependent θέλουμε να βάζουμε if δηλαδή ένα state testing.
        // Αν θέλουμε να κάνουμε propagate το exception, να το επιστρέψουμε δηλαδή,
        // τότε κάμνουμε το try catch και κάνουμε rethrow το exception.
        if (num2 == 0) {
            System.out.println("Please");
            System.exit(1);
        }

        result = num1 / num2;
    }
}
