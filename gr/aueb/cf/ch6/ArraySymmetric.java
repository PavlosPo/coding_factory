package gr.aueb.cf.ch6;

public class ArraySymmetric {

    public static void main(String[] args) {
        int[] arrNotSymmetric = new int[] {1, 2, 3, 4, 4,6, 3, 2, 1};
        int[] arrSymmetric = new int[] {1, 2, 3, 4, 4, 3, 2, 1};


    }

    public static boolean isArraySymmetric(int[] arr){
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length -1; i < j; i++, j--){
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

//    public static boolean isArrSymmetric(int[] arr) {
//        boolean isSymmetric = true;
//        int n = arr.length - 1;
//
//        for (int i = 0; i < n /2; i++) {
//            if (arr[i] != arr[n-i]) {
//                isSymmetric = false;
//                break;
//            }
//        }
//    }
}
