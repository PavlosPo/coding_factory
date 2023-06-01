package gr.aueb.cf.ch6;

/**
 *
 */
public class ReplaceWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 10};

        for (int item : arr) {
            System.out.println(item + " ");
        }

        swap(arr);
        System.out.println();

        for (int item : arr) {
            System.out.println(item + " ");
        }

    }

    public static void swap(int[] arr) {
        if (arr == null || arr.length != 2) {
            int tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;

        }
    }
}
