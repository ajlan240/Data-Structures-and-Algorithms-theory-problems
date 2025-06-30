import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode151 {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello      world  "));
    }
    public static String reverseWords(String s) {
//        StringBuilder st  = new StringBuilder(s);
//        st.reverse();
//        s = st.toString();
//        st = new StringBuilder("");
//        StringBuilder st2;
//        for(String x : s.split(" ")) {
//            if(x == "") continue ;
//            st2  = new StringBuilder(x);
//            st2.reverse();
//            st.append(st2 + " ");
//
//        }
//
//        return st.toString().substring(0, st.length() - 1);

        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
