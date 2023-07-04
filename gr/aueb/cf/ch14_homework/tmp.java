package gr.aueb.cf.ch14_homework;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class tmp {

    public static void main(String[] args) {
        int[] nums =  runningSum(new int[] {1, 2, 3, 4, 5});
        Arrays.stream(nums).forEachOrdered(c -> System.out.println(c));
    }


        public TreeNode invertTree(TreeNode root) {
            System.out.println(root.val);
            System.out.println(root.right);
            System.out.println(root.right.val);
            return root.right;
        }

    public static int[] runningSum(int[] nums) {
        return Arrays.stream(nums).map(n -> (n * (n + 1)) / 2).toArray();
    }
}
