import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode283 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
    public static int[] moveZeros(int[] nums) {
//        int n = nums.length;
//        int j = 0;
//        int k = 1;
//        while(j < n && k < n) {
//            if(nums[j] == 0) {
//                if(nums[k] == 0)
//                    k++;
//                else {
//                    nums[j] = nums[k];
//                    nums[k] = 0;
//                    k++;
//                    j++;
//                }
//            }
//            else {
//                j++;
//                k++;
//            }
//        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        while(k < nums.length) {
            nums[k++] = 0;
        }

        return nums;
    }

}
