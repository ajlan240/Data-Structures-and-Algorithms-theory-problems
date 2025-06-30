public class Leetcode1095 {

// Searching in mountain array

    public static void main(String[] args) {
        int[] arr = {2, 6, 67, 90, 45, 23, 19, 1};
        System.out.println("element found at the index : "+ search(arr, 45));
    }
    public static int search(int[] arr, int target){

        int peak = peakIndex(arr);
        int index = binarySearch(arr, 0, peak, target);
        if (index < 0) {
            index = binarySearch(arr, peak + 1, arr.length - 1, target);
            return index;
        }

        return index;
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (isAsc) {
                if (arr[mid] < target) start = mid + 1;
                else if (arr[mid] > target) end = mid - 1;
                else return mid;
            } else {
                if (arr[mid] < target) end = mid - 1;
                else if (arr[mid] > target) start = mid + 1;
                else return mid;
            }

        }
        return -1;
    }

    private static int peakIndex(int[] arr) {
        int start = 0, end =  arr.length - 1;
        int mid = 0;
        while(end != start) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return end;
    }
}
