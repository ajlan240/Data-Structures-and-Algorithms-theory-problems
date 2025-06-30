import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode242 {

    public static void main(String[] args) {
        String s = "elaow";
        String t = "below";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s,  String t){

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);

        char[] t1 = t.toCharArray();
        Arrays.sort(t1);

         String s2 = new String(s1);
         String t2 = new String(t1);

         if(s2.equals(t2))
             return true;

        return false;
    }
}
