package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 οριζόντια / κάθετα stars
 */
public class Stars10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("*");
            }
            System.out.println();

        }
    }
}
