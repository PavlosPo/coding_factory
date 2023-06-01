package gr.aueb.cf.ch6;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        int[] rotated = doCircularLeftShiftBy(arr, 2);

        print(rotated);
    }

    /**
     * Rotates the elemens of an array by an offset.
     *
     * @param arr       The given array of integers
     * @param offset    The distance to rotate
     * @return          The rotated array, or null if the
     *                  given array is null
     */
    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    public static void print(int[] arr) {
        for (int item : arr) {
            System.out.print(item  + " ");
        }
    }


}
