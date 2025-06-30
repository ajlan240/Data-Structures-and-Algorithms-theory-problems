public class Leetcode1768 {

    public static void main(String[] args) {

        System.out.println(mergeAlternatly("abc", "pqqr"));
    }

    public static String mergeAlternatly(String w1, String w2) {
//        int d = Math.abs(w1.length() - w2.length());
//        int n = w1.length() + w2.length() - d;
//        char[] word3 = new char[n];
//        for(int i = 0, j = 0; i < n ;j++, i+=2){
//            word3[i] = w1.charAt(j);
//            word3[i + 1] = w2.charAt(j);
//        }
//         w1 = w1.length() - w2.length() > 0 ? w1.substring(w1.length() - d) : w2.substring(w2.length() - d);
//
//        return new String(word3).concat(w1);


        // official answer
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(w1.length() > i || w2.length() > i){
            if(w1.length() > i) sb.append(w1.charAt(i));
            if(w2.length() > i) sb.append(w2.charAt(i));
            i++;

        }
        return sb.toString();
    }
}
