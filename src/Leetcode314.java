import java.util.Arrays;
import java.util.Stack;

public class Leetcode314 {
    public static void main(String[] args) {
//        int[] num = {5, 4, 3, 2, 1};
        int[] num = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(num));

    }

    private static boolean increasingTriplet(int[] nums) {
        int[] triplet = new int[3];
        int j = 0;
        triplet[0] = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(triplet[j] < nums[i]) {
                j++;
                triplet[j] = nums[i];
            } else if (triplet[j] > nums[i]){
                triplet[j] = nums[i];
            }
            if(triplet[2] > 0) return true;

        }
        return false;
    }
}
