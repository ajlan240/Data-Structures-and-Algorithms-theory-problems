public class LeetCode1071 {

    public static void main(String[] args) {
//        System.out.println(gcdOfStrings("ABCDEF", "ABC"));
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        if(!(str1 + str2).equals(str2 + str1)) return "";
        String result = str1.substring(0, gcdNum(len1, len2));
        return result;
    }
    private static int gcdNum(int n1, int n2) {
        if(n2 == 0) return n1;
        return gcdNum(n2, n1 % n2);
    }

}
