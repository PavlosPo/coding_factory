package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {

        // 1ος τρόπος
//        int num = 0;
//
//        try (Scanner in = new Scanner(System.in)) {     // Πρέπει η κλάση που φτιάχνουμε
//                                                        // να έχει auto close ιδιότητα, κάθε κλάση τις φτιάχνει
//                                                        // κάποιος ίσως και όχι, το τσεκάρουμε.
//            num = in.nextInt();
//            System.out.println(num);
//        } catch (InputMismatchException e) {
//            e.printStackTrace();
//        }

        // 2ος τρόπος
            int num = 0;
            Scanner in = new Scanner(System.in);

            try (in) {                                      // Πρέπει η κλάση που φτιάχνουμε
                                                            // να έχει effective close ιδιότητα, κάθε κλάση τις φτιάχνει
                                                            // κάποιος ίσως και όχι, το τσεκάρουμε.
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
