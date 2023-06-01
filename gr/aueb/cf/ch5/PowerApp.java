package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το a^n
 */
public class PowerApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int result;

        result = pow(a, b);
        System.out.println(result);

    }

    public static int pow(int a, int n) {
        return (int) Math.pow(a, n);
    }
}
