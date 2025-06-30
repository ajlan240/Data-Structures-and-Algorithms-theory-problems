import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for(int i : productExceptSelf(arr)) {
            System.out.print(i + ", ");
        }
    }

    public static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] sfArr = new int[n];
        int [] rsArr = new int[n];
        sfArr[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            sfArr[i] = arr[i] * sfArr[i + 1];
        }

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] * arr[i - 1];
        }


        rsArr[0] = sfArr[1];
        rsArr[n - 1] = arr[n - 2];
        for(int i = 1; i < n - 1; i++){
            rsArr[i] = arr[i - 1] * sfArr[i + 1];
        }

        return rsArr;

    }




}
