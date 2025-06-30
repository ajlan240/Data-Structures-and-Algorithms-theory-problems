public class Leetcode9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
    private static boolean isPalindrome(int num) {
        int temp = num;
        int result = 0;
        while(temp > 0){
            result = (result *10) + temp % 10;
            temp = temp / 10;
        }
        return result == num;




        // OR

//        int result = 0;
//        while(num > result){
//            result = (result *10) + num % 10;
//            num /= 10;
//        }
//        return result == num || result / 10 == num;
    }
}
