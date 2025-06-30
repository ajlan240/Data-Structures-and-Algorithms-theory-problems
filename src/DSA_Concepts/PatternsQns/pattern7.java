package DSA_Concepts.PatternsQns;
// Qn 7
//              *
//             ***
//            *****
//           *******
//          ********
public class pattern7 {
    public static void main(String[] args) {
        int k = 5;
//  Alghorithm : 1

//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < (2 * k) - 1; j++) {
//                if(j >= (k - i) && j <= (k + i)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//  Alghorithm 2:

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
