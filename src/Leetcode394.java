public class Leetcode394 {

    public static void main(String[] args) {
        System.out.println(decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int i = 0;
        int k = 0;
        int temp = k;

        while(i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                k = (k * 10) + Character.getNumericValue(s.charAt(i));
                temp += k;
            }
            if (s.charAt(i) == '[' && k > 0) {
                i++;
                if(Character.isDigit(s.charAt(i))) {
                    int l;

                    for (l = i; l < s.length(); l++) {
                        if(s.charAt(l) == ']') break;
                    }
                        k = 0;
                        sb2.append(decodeString(s.substring(i, l + 1)));
                        i = l;
                        k = temp - k;
                        temp -= k;
                } else {
                    sb2.append(s.charAt(i));
                }
            }else if (s.charAt(i) == ']' && k > 0) {
                for (int j = 0; j < k; j++) {
                    sb.append(sb2);
                }
                sb2.setLength(0);
                k = 0;
            } else if (Character.isLetter(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
