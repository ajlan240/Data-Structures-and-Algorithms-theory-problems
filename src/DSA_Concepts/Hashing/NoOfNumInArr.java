package DSA_Concepts.Hashing;

public class NoOfNumInArr {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2};
        int[] hash = findNoOfNumInArr(arr);
        int[] arr2 = {1, 2, 3, 4, 5};
        for(int i : arr2) {
            System.out.println(hash[i]);
        }

    }

    private static int[] findNoOfNumInArr(int[] arr) {
        int[] hash = new int[13];
        for (int j = 0; j < arr.length; j++) {
            hash[arr[j]]++;
        }
        return hash;

    }
}
