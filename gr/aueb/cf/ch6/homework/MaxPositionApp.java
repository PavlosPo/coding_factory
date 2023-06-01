package gr.aueb.cf.ch6.homework;

/**
 * It finds and returns the Max and the position of the Max value  in the given arr
 *
 * @author pavlospoulos
 */
public class MaxPositionApp {

    public static void main(String[] args) {
        int[] arr = new int[] {6, 32, 34, 65, 90, 12, 100};
        int maxPos = 0;

        maxPos = getMaxPosition(arr, 0, arr.length);
        System.out.printf("The max value is: %d at the position %d", arr[maxPos], maxPos + 1);

    }

    /**
     * It finds the max value and return the position of the max value in a given array.
     * If there is an error it returns -1.
     *
     * @param arr       The Given array
     * @param low       The position to start searching the array
     * @param high      The max position to stop searching for the max value in the given array
     * @return          Returns -1 if there is an error, or else, returns the position of the max value in the array.
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxValue = Integer.MIN_VALUE;
        int maxPos = 0;

        // validate the dimensions
        if (arr == null || low < 0 ||  low > high || arr.length < high) return -1;

        for (int i = low; i < arr.length; i++) {
            // Loop and if you find bigger number, make it the maxValue for now.
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPos = i;
            }
        }
        return maxPos;
    }
}
