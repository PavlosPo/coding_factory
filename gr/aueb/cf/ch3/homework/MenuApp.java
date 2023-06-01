package gr.aueb.cf.ch3.homework;


import java.util.Scanner;

/**
 * It displays a Menu until the user presses 5
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
//        int user_input = 0;
//
//        do {
//            System.out.println("Please Select from the Menu below (1-5):");
//            System.out.println("1. Εισαγωγή");
//            System.out.println("2. Διαγραφή");
//            System.out.println("3. Ενημέρωση");
//            System.out.println("4. Αναζήτηση");
//            System.out.println("5. Έξοδος");
//            user_input = in.nextInt();
//            if (user_input == 1) {
//                System.out.println("Διαλέξατε Εισαγωγή");
//            } else if (user_input == 2){
//                System.out.println("Διαλέξατε Διαγραφή");
//            } else if (user_input == 3){
//                System.out.println("Διαλέξατε Ενημέρωση");
//            } else if (user_input == 4) {
//                System.out.println("Διαλέξατε Αναζήτηση");
//            } else if (user_input != 5) {
//                System.out.println("Παρακαλώ διαλέξτε νούμερα μεταξύ του 1 και του 5.");
//            }
//        } while (user_input != 5);
//
//        System.out.println("You exited the program.");
        do {
            System.out.println("Please Select from the Menu below (1-5):");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Μη έγκυρη επιλογή");
            }

            if (choice == 5) {
                System.out.println("Επιλέξατε έξοδο");
            }


            if (choice == 1) {
                System.out.println("Διαλέξατε Εισαγωγή");
            } else if (choice == 2){
                System.out.println("Διαλέξατε Διαγραφή");
            } else if (choice == 3){
                System.out.println("Διαλέξατε Ενημέρωση");
            } else {
                System.out.println("Διαλέξατε Αναζήτηση");
            }

        }while (choice != 5);
    }
}
