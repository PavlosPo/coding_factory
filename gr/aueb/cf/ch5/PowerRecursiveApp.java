package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το a^n
 * αναδρομικά
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }

    public static float power(float a, float n) {
//        if (b < 0) {
//            return (b == -1) ? 1/a : (1/a) * power (a, b+1);
//        }
//        return (b==1) ? a : a * power(a, b-1);
        if (n < 0) return 1 / power(a, -n);
        if (n == 0) return 1;

        return a * power(a, n-1);
    }
}
