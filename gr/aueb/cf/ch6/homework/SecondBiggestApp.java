package gr.aueb.cf.ch6.homework;

/**
 * It finds and returns the second-biggest value in a given array
 */
public class SecondBiggestApp {

    public static void main(String[] args) {


        int[] arr = new int[] {32, 12, 43, 54, 133, 122, 144, 18};

        System.out.printf("the Second smallest value is %d",getSecondBiggestValue(arr));
    }

    public static int getSecondBiggestValue(int[] arr) {

        int minValue = Integer.MAX_VALUE;
        int secondMinValue = Integer.MAX_VALUE;

        // validation
        if (arr == null) return -1;

        // Loop that checks
        for (int item : arr) {
            // First check if there is smaller item than the current smallestValue (minValue)
            if (item < minValue) {
                secondMinValue = minValue;      // Get the smallest we have found until now
                                                // and set it as the second-smallest value
                minValue = item;                // Update value
            } else if (item < secondMinValue) {
                // Second check if there is an item not smaller
                // than minValue but smaller than secondMinValue
                //  then just set it to second-smallest value.
                secondMinValue = item;
            }
        }
        return secondMinValue;

    }

}
