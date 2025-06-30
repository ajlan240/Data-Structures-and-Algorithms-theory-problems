package DSA_Concepts.PatternsQns;

// Pattern 9
//              *
//             ***
//            *****
//           *******
//          *********
//          *********
//           *******
//            *****
//             ***
//              *
public class pattern9 {
    public static void main(String[] args) {
        int k = 6;
        for (int i = 0; i < k; i++) {
            int j = 0;
            while (j < k - i - 1) {
                System.out.print(" ");
                j++;
            }
            while (j < k + i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }

        for (int i = 0; i < k; i++){
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
