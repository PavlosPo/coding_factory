package gr.aueb.cf.ch3.homework;

import java.util.Scanner;

/**
 * Here we find out if a year given by the
 * user input, is δυσεκτο year.
 */
public class Year {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yearInput = 0;

        System.out.println("Please insert the year to check: ");
        yearInput = in.nextInt();

        if (yearInput % 400 == 0) {
            // I can be divided exactly with 400 so is it Δυσεκτο
            System.out.printf("The Year: %d is Δύσεκτο", yearInput);
        } else if (yearInput % 100 != 0 && yearInput % 4 == 0){
            // It can be divided with 4 but not with 100, then it is Δύσεκτο
            System.out.printf("The Year: %d is Δύσεκτο", yearInput);
        } else {
            // in every other possibility the year is not Δύσεκτο
            System.out.printf("The Year: %d is not Δύσεκτο", yearInput);
        }
    }
}
