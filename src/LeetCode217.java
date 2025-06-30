import java.util.Arrays;
public class LeetCode217  {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 1, 20, 12, 12, 23, 13, 2, 2, 2, 4, 5, 5, 5, 2, 9, 1, 1, 1};
        Arrays.sort(arr);
        System.out.println(ifDistinct(arr, arr.length - 1, 0));
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    private static boolean ifDistinct(int[] arr, int high, int low) {

        for (int i = low; i <= high; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }

        }
        return false;
    }
}
