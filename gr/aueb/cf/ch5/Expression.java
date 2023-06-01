package gr.aueb.cf.ch5;

import java.util.Locale;

/**
 * Float / Double Expressions
 */
public class Expression {

    public static void main(String[] args) {
        double num1 = 1234567.5;
        double num2 = 2.0;
        double result = 0.0;
        double mod = 0.0;

        result = num1 / num2; // 6.25
        mod = num1 % num2;  // 0.5

        System.out.printf(Locale.forLanguageTag("el"),"result = %,016.2f, mod = %.2f\n", result, mod);
        System.out.printf("%,016.2f %% %.2f = %.2f", num1, num2, mod);
    }
}
