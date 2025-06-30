import java.lang.reflect.Array;
import java.util.Arrays;
// logic : find difference of the number and linear search the existance of result
public class LeetCode1 {
    public static void main(String[] args) {

        int arr[] = {2, 7, 11, 15};
        for(int i : twoSum(arr, 9)){
            System.out.print(i+",");
        }

    }
    public static int[] twoSum(int[] arr, int target){
        int[] nums = new int[2];
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == diff) {
                    nums[k] = i;
                    k++;
                    nums[k] = j;
                    return nums;
                }
            }
        }
        return nums;
    }
}
