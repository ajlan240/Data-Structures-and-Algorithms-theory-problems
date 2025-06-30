// find position of element in sorted array of infinite numbers

public class infinitNumberArray {
    public static void main(String[] args) {

        int index[] = new int[2];
        int arr[] = {2, 3, 5, 7, 9, 12, 15, 34, 45, 54, 56, 57, 88, 99, 123, 145, 678};
        int target = 88;
        index = findStart(arr, target);

        System.out.println(index[0]+ " : " +index[1]);
        int mid = binarySearch(arr, target, index[0], index[1]);
        if (mid == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at the index " + mid);
        }


    }
    static int[] findStart(int arr[], int target) {
        int index[] = new int[2];
        int start = 0;
        int end = 1;
        int i = 0;
        while(true) {

            if (arr[end] == target) {
                index[0] = end;
                index[1] = end;
                return index;
            } else if (arr[end] < target) {
                start = end;
                end = (int) (end + (Math.pow(2 , i)));
            }
            else {
                index[0] = start;
                index[1] = end;
                return index;
            }
            i++;
        }


    }
    static int binarySearch(int arr[], int target, int start, int end) {
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

}
