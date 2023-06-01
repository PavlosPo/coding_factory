package gr.aueb.cf.ch5;

/**
 * Προσπαθεί να
 * Ανταλλάσσει αμοιβαία δύο τιμές που
 * δίνει ο χρήστης.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println("a = " + a + " b = " + b);
    }

    /**
     * Swaps a,b, s = a -> b, b -> a
     * @param a     The first value
     * @param b     The second value
     */
    public static void swap (int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
