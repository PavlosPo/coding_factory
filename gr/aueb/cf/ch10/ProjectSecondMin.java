package gr.aueb.cf.ch10;

/**
 * Finds the second min of an array of integers
 */
public class ProjectSecondMin {
    public static void main(String[] args) {

    }

    public static int getSecondMinPosition(int[] arr) {
        int min = 0;
        int secondMin = 0;
        int minValue = 0;
        int secondMinValue = 0;
        if (arr == null) return -1;
        if (arr.length < 2) return -1;

        minValue = arr[0];
        secondMinValue = arr[1];

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] < minValue && arr[i] < secondMinValue) {
                secondMin = min;
                secondMinValue = minValue;
                min = i;
                minValue = arr[i];
            } else if (arr[i] > minValue && arr[i] < secondMinValue) {
                secondMin = i;
                secondMinValue = arr[i];
            }
        }
        return  secondMin;  // To Position.
    }
}
