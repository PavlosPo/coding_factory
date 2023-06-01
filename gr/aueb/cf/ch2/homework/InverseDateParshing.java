package gr.aueb.cf.ch2.homework;

import java.util.Scanner;

/**
 * Users inputs 3 integers that represent
 * a date with the format of: DD/MM/YYYY
 * and the program returns the date formated as
 * DD/MM/YY
 * @author pavlospoulos
 */

public class InverseDateParshing {

    public static void main(String[] args) {
        // Initializing variables
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // Commands
        System.out.println("Please insert 3 integers to return them in a date format (DD/MM/YY).\n" +
                "Please insert the Days first then month and year last. ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        // Output
        // num3 is the year, so we will %100 to it to grab the last two digits.
        System.out.printf("%d/%d/%d",
                num1, num2, num3%100);



    }
}
