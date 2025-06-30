import java.util.Arrays;

public class Leetcode643 {
    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println(findMaxAverage(arr, 1));
    }
    public static double findMaxAverage(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = k / 2;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += nums[i];
        }
        for (int i = n - 1; i > (n - (k - m)) - 1; i--) {
            sum += nums[i];
        }
        double avg1 = (double) sum / k;

        if(m == (k - m)) return avg1;

        sum = 0;
        for (int i = 0; i < k - m; i++) {
            sum += nums[i];
        }
        for (int i = n - 1; i > n - m; i--) {
            sum += nums[i];
        }
        double avg2 = (double) sum / k;
        return Math.max(avg1, avg2);

    }
}
