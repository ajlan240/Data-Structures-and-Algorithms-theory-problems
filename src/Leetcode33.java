public class Leetcode33 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};

        int index = search(arr, 7);
        if (index > 0)
            System.out.println("Element is found at index " + index);
        else
            System.out.println("element is absent");
    }
    public static int search(int[] arr, int target) {
        if(arr[pivot(arr)] == target) return pivot(arr);
        int index = binarySearch(arr, 0, pivot(arr) - 1, target);
        if (index < 0)
            index = binarySearch(arr, pivot(arr) + 1, arr.length - 1, target);

        return index;
    }

    public static int pivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        int mid = 0;

        while(start < end)
        {
            mid = start + (end - start) / 2;
            if (end > mid && arr[mid] > arr[mid + 1]) return mid;
            if (start < mid && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[mid] <= arr[start]) end = mid - 1;
            else  start = mid + 1;

        }

        return -1;
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {

        while (start <= end) {

            int mid = start + ((end - start) / 2);

            if (arr[mid] < target) start = mid + 1;
            else if (arr[mid] > target) end = mid - 1;
            else return mid;

        }
        return -1;
    }
}
