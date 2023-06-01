package gr.aueb.cf.ch8;

public class CommonErrorCases {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int minPosition = 0;
        minPosition = getMinPosition(arr);

        if (minPosition != -1 ){
            System.out.println("Invalid array");
        } else {
            System.exit(1);
        }

    }

    /**
     * Returns the min position, but it returns -1 when the array is invalid
     * @param arr
     * @return
     */
    public static int getMinPosition(int[] arr){
        if (arr == null) return -1;     // commmon error case, instead of throwing Illegal Argument Exception

        int minPosition = 0;
        int minValue = 0;
        for (int i = 0; i < arr.length -1 ; i++) {
            if ( arr[i] < arr[minPosition]) {
                minValue = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static String getStringOrNull(String[] strArr, String str) {
        if (str == null || strArr == null) return null;
        String strToReturn = null;

        for (String s : strArr ) {
            if (s.contains(str)) {
                strToReturn = s;
            }
        }
        return strToReturn;
    }
}
