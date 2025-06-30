public class LeetCode443 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
//        char[] arr = {'a', 'a', 'b', 'b', 'c', 'c'};
        System.out.println(compress(arr));
    }
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            chars[index] = chars[i];
            while(k < chars.length && chars[k] == chars[i]) {
                k++;
            }
            if((k - i) > 1){
                int n = k - i;
                while((n / 10) >= 0){
                    index++;

                }
            }
            i = k - 1;
            index++;
        }
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
