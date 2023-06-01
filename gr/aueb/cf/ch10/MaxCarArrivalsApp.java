package gr.aueb.cf.ch10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MaxCarArrivalsApp {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1056}, {1022, 1050}, {1317, 1417}, {1025, 1325}, {1027, 1200}};
        int[][] transformed;

        transformed = transform(arr);
        sortByTime(transformed);

        System.out.println("Max Arrivals: " + getMaxConcurrentCars(transformed));
    }

    public static int[][] transform(int[][] arr) {
        // 1η θέση έχει τις ώρες του arr στην main, και στην δεύτερη λέει 0 ή 1 αν ήρθε η έφυγε κάποιος.
        int[][] transformed = new int[arr.length * 2][2];

        for (int i = 0; i < arr.length; i++) {
            transformed[i*2][0] = arr[i][0];
            transformed[i*2][1] = 1;
            transformed[i*2+1][0] = arr[i][1];
            transformed[i*2+1][1] = 0;
        }
        return transformed;
    }

    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing(a -> a[0]));      // lambda expression, ταξινόμησε για κάθε a το πρώτο στοιχείο.
        // άρα την ώρα.
    }

    public static int getMaxConcurrentCars(int[][] arr) {
        int count = 0;
        int maxCount = 0;

        for (int[] row : arr ){
            // arrival = 1 , leaving = 0
            if (row[1] == 1) {
                count++;
                if (count > maxCount) maxCount = count;
            } else { // if row[1] == 0
                count--;
            }
        }
        return  maxCount;
    }

}
