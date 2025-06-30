// 852. Peak Index in mountain array in o(logn)
// same answer on leetcode 162

public class MountainArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1};
        System.out.println("The Peak index is " + binarySearch(arr));
    }

    private static int binarySearch(int[] arr) {
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
