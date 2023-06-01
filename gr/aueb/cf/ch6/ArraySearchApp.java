package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1, 5, 9, 3, 12};
        boolean secretIsFound = false;

        for (int item : arr) {
            if (item == SECRET) {
                secretIsFound = true;
                break;
            }
        }

        if (secretIsFound) {
            System.out.println("Secret Key was Found");
        } else{
            System.out.println("Secret Key was not Found");
        }
    }
}
