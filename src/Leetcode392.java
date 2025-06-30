public class Leetcode392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s,  String t) {
//        char[] ch = new char[s.length()];
        int i = 0;
        int k = 0;
        while (k < s.length() && i < t.length()) {
            if (t.charAt(i) == s.charAt(k)) {
                k++;
            }
            i++;
        }
        return k == s.length();
    }
}
