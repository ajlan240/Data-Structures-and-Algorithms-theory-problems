package DSA_Concepts.PatternsQns;

public class pattern6 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(k++);

            }
            k = 1;
            System.out.println();
        }
    }
}
