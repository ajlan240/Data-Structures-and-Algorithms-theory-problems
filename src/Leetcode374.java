public class Leetcode374 {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
    public static int guessNumber(int n) {

        int start = 1;
        int end = n;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            int result = guess(mid);
            if(result > 0) {
                start = mid + 1;
            } else if (result < 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return 0;
    }
    public static int guess(int num) {
        int pick = 10;
        if(num > pick) return -1;
        else if (num < pick) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
