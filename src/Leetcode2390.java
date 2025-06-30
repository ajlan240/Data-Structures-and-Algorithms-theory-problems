import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Leetcode2390 {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
    public static String removeStars(String s) {
//        Deque<Character> stack = new ArrayDeque<>();
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == '*'){
//                stack.pop();
//            } else {
//                stack.push(s.charAt(i));
//            }
//        }
//        s = "";
//        while(!stack.isEmpty()) {
//            s = s.concat(stack.removeLast() + "");
//        }

        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char x : c){
            if(x == '*') sb.deleteCharAt(sb.length() - 1);
            else sb.append(x);
        }
        return sb.toString();
    }
}
