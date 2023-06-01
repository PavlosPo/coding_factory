package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων
 * ενός ακεραίου, το άρθροισμα των ψηφίων
 * και το άθροισμα του πρώτου και του τελευταίου
 * ψηφίου.
 * πχ. 531 -> count: 3, sum: 9, leftmost + rightmost: 6
 */
public class DigitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightmost = 0;
        int leftmost = 0;

        System.out.println("Please insert num");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;
            currentDigit = num % 10;
            sum = sum + currentDigit;
            num = num / 10;
            if (count == 1) {
                rightmost = currentDigit;
                }

            } while (num != 0);
        leftmost = currentDigit;
        sumLeftRight = leftmost + rightmost;

        System.out.println("Count: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of leftmost, rightmost digits: " + sumLeftRight);
    }
}
