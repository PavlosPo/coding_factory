package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Please insert string value: ");
        // s = in.next(); // ends with whitespace (space, \t, \n
        s = in.nextLine();  // it can not recognise \t, \n. spaces are allowed

        System.out.println(s);
    }
}
