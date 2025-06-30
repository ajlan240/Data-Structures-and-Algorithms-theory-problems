package DSA_Concepts.Arrays;
// Leetcode 26 Remove Duplicates from sorted array
public class Leetcode26 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 2, 2, 3, 3, 4};
//        int[] arr = {1, 1, 2};

        int k = noOfUnqElem(arr);
        System.out.println(k);
    }

    private static int noOfUnqElem(int[] arr) {

        int temp = arr[0];
        int num = 0;
        int k = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if(temp == arr[i + 1]) {
                num++;
            } else {
                k++;
                arr[k] = arr[i + 1];
                temp = arr[i + 1];
            }
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        return arr.length - num;
    }
}

