package DSA_Concepts.PatternsQns;

public class pattern5 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
