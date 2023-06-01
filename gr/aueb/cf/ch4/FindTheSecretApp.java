package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης έχει 10 ευκαιρίες
 * για να βρει ένα μυστικό αριθμό. Αν το
 * βρει νωρίτερα από τη 10η φορά, η for
 * πρέπει να σταματήσει (break).
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please give prediction: ");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No worries, try again!");
            System.exit(1);
        }

        System.out.println("Success!! Play again!!");
    }
}
