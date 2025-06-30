package DSA_Concepts.PatternsQns;
// Pattern 8 :
//
//    *********
//     *******
//      *****
//       ***
//        *
public class pattern8 {
    public static void main(String[] args) {
        int k = 5;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (k - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
