import java.util.Arrays;

public class Leetcode215 {
    public static void main(String[] args) {
        int[] num = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(num, 2));

    }

    private static int findKthLargest(int[] nums, int i) {

        Arrays.sort(nums);
        int j = nums.length;
        return nums[j - i];

    }
}
