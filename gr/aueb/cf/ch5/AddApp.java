package gr.aueb.cf.ch5;

/**
 * Προσθέτει δύο ακεραίους με τξ
 * χρ΄΄ηση της μεθόδους add.
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a, b);

        System.out.println(sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
