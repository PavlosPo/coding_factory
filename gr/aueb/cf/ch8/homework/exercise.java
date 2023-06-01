package gr.aueb.cf.ch8.homework;

import java.util.Scanner;

/**
 *
 * @author pavlospoulos
 */
public class exercise {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = getChoice();

            // The choice will be -1 if not an integer inserted.
            if (choice == -1) {
                System.out.println("Please insert a integer.");
                break;
            }

            // It can raise an IllegalArgumentException, if not an option 1 to 5 is selected.
            try {
                printChoice(choice);
            } catch (IllegalArgumentException e ){
                System.out.println("Not right option, please choose between 1-5.");
            }

        } while (choice != 5);

    }

    /**
     * Prints a menu.
     */
    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. First");
        System.out.println("2. Second");
        System.out.println("3. Third");
        System.out.println("4. Fourth");
        System.out.println("5. Exit");
    }

    /**
     * It reads and returns the choice given (int).
     * if not inserted int, then it returns null.
     * @return      int, -1
     */
    public static int getChoice(){
        boolean finished = false;
        int choice;

        if (in.hasNextInt()) {
            choice = in.nextInt();
        } else {
            choice = -1;
        }
        return  choice;
    }

    /**
     * It does things with the choice given.
     * @param choice
     */
    public static void printChoice(int choice) throws IllegalArgumentException{
        switch (choice){
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            case 4:
                System.out.println("Selected 4");
                break;
            case 5:
                System.out.println("Selected 5");
                System.exit(1);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
