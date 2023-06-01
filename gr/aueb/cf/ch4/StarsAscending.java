package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει σε αύξουσα σειρά αστεράκια
 */
public class StarsAscending {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
