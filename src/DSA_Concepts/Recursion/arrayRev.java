package DSA_Concepts.Recursion;

public class arrayRev {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 6};
//        revArr(arr, 0, arr.length - 1);

        revArrSinglePoint(arr, 0);

        for (int i : arr)
        {
            System.out.print(i + ", ");
        }

    }

    // using 2 pointer
//    static void revArr(int[] arr, int f, int l) {
//        if(f >= l) return;
//        swap(arr, f, l);
//        revArr(arr, ++f, --l);
//    }


    // using singe pointer
    private static void revArrSinglePoint(int[] arr, int i)
    {   int n = arr.length;
        if(i >= arr.length / 2) return;
        swap(arr, i, n - i - 1);
        revArrSinglePoint(arr, ++i);
    }

    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
