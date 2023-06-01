package gr.aueb.cf.ch8;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while(true) {
            try {
                System.out.println("Please insert a num");

                inputNum = in.nextInt();

                if (inputNum == MAGIC_NUM) {
                    System.out.println("Great!");
                    break;
                }

            } catch (InputMismatchException e) {
                // e.printStackTrace();
                System.out.printf("Please insert an int");
                in.nextLine();  // it cleans the input
            }
        }

        System.out.println("Thanks for using the Magic App");
    }
}
