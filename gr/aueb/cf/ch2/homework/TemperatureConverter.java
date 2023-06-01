package gr.aueb.cf.ch2.homework;

import java.util.Scanner;

/**
 * The user inputs Fahrenheit degrees of temperature and the
 * program converts it to Celsius degrees equivalent.
 *
 * @author pavlospoulos
 */

public class TemperatureConverter {

    public static void main(String[] args) {
        // Initializing
        Scanner in = new Scanner(System.in);
        int fahrenheitTemperature = 0;
        int celsiusTemperature = 0;

        // Commands / Instructions
        System.out.println("Please insert Fahrenheit Degrees ( \u2109 ): ");
        fahrenheitTemperature = in.nextInt();
        celsiusTemperature = (5 * (fahrenheitTemperature - 32)) / 9;

        // Output
        System.out.printf("%d \u2109 is %d \u2103. %d", fahrenheitTemperature, celsiusTemperature);
    }
}
