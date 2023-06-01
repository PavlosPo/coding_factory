package gr.aueb.cf.ch6;

/**
 * Replaces all array elements with the next digit
 */
public class ReplaceNextDigitApp {

    public static void main(String[] args) {
        int[] arr = new int[]  {5, 2, 9, 8};
        shiftLeftByOne(arr, 0);     // 2, 9, 9, 0
    }

    public static void shiftLeftByOne(int[] arr, int low) {
        if (arr == null || low < 0 || low > arr.length) return;

        for (int i = low; i < arr.length - 1; i++ ){        // We add -1 in legnth, so we can not have problems later.
            arr[i] = arr[i+1];
        }

        arr[arr.length - 1] = 0;
    }

}
