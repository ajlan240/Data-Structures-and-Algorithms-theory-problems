package DSA_Concepts.PatternsQns;

public class pattern10to22 {
    public static void main(String[] args) {
// pattern10
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
// Solution :
//        int k = 5;
//        for (int i = 0; i < 2 * k; i++) {
//            int stars = i;
//            if(i > k) stars = 2 * k - i;
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
// ----------------------------------------------------------------------

// pattern - 11
//        1
//        01
//        101
//        0101
//        10101
//      Solution :

//        int k = 5;
//        for (int i = 1; i <= k; i++) {
//            int start = (i % 2 != 0) ? 1 : 0;
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(start);
//                start = 1 - start;
//            }
//            System.out.println();
//        }
// ----------------------------------------------------------------------

        // pattern 12 :
//        1        1
//        12      21
//        123    321
//        1234  4321
//        1234554321

        // solution :

//        int k = 5;
//        for (int i = 0; i < k; i++) {
//            int n = 1;
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(n);
//                n++;
//            }
//            int temp = 2 * (k - (i + 1));
//            for (int j = 0; j < temp; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i + 1; j++) {
//                n--;
//                System.out.print(n);
//
//            }
//            System.out.println();
//        }

// ----------------------------------------------------------------------

//        pattern 13 :

//                1
//                2 3
//                4 5 6
//                7 8 9 10
//                11 12 13 14 15

//        solution

//        int k = 5;
//        int n = 1;
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(n++ + " ");
//            }
//            System.out.println();
//        }
// ----------------------------------------------------------------------
//        pattern 14:

//                A
//                AB
//                ABC
//                ABCD
//                ABCDE

//        solution:
//        int k = 5;
////
//        for (int i = 0; i < k; i++) {
//            char l = 'A';
//            for (int j = 0; j <= i ; j++) {
//                System.out.print(l++);
//            }
//            System.out.println();
//        }


// ----------------------------------------------------------------------
//        pattern  15 :

//                ABCDE
//                ABCD
//                ABC
//                AB
//                A

//        solution:
//        int k = 5;
//        for (int i = 0; i < k; i++) {
//            char l = 'A';
//            for (int j = 0; j < k - i ; j++) {
//                System.out.print(l++);
//            }
//            System.out.println();
//        }
// ----------------------------------------------------------------------

// Pattern 16
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE
// Solution :

//        int k = 5;
//        char l = 'A';
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j <= i ; j++) {
//                System.out.print(l);
//            }
//            l++;
//            System.out.println();
//        }

// ----------------------------------------------------------------------

// pattern 17 :
//                 A
//                ABA
//               ABCBA
//              ABCDCBA
//             ABCDEDCBA

// Solution :
//
//        int k = 5;
//        for (int i = 0; i < k; i++) {
//            char l = 'A';
//            l--;
//            for (int j = 0; j < k - i - 1 ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                if(j > i)
//                {
//                    System.out.print(--l);
//                }
//                else {
//                    System.out.print(++l);
//                }
//            }
//            System.out.println();
//        }
// ----------------------------------------------------------------------
// pattern 18:
//        E
//        DE
//        CDE
//        BCDE
//        ABCDE
// Solution :

//        int k = 5;
//        for (int i = 0; i < k; i++) {
//            char c = 'A';
//            c = (char) (c + (k - i) - 1);
//            for (int j = 0; j <= i; j++) {
//                System.out.print(c);
//                c++;
//            }
//            System.out.println();
//        }
// ----------------------------------------------------------------------
//        pattern 19:
//                **********
//                ****  ****
//                ***    ***
//                **      **
//                *        *
//                *        *
//                **      **
//                ***    ***
//                ****  ****
//                **********
//        Solution:
//        int k = 5;
//        for (int i = 0; i < k; i++) {
//            System.out.println();
//            for (int j = 0; j < k - i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < 2 * i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < k - i; j++) {
//                System.out.print("*");
//            }
//        }

//        for (int i = 0; i <= k; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < 2 *(k - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// ----------------------------------------------------------------------

//    pattern 20:
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//    Solution :
//    int k = 5;
//    for (int i = 0; i < k; i++) {
//        for (int j = 0; j <= i; j++) {
//            System.out.print("*");
//        }
//        for (int j = 0; j < 2 * (k - i - 1); j++) {
//            System.out.print(" ");
//        }
//        for (int j = 0; j <= i; j++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//        for (int i = 1; i < k; i++) {
//
//            for (int j = 0; j < k - i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < 2 * i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < k - i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


// ----------------------------------------------------------------------
//        Pattern 21:
//                    *****
//                    *   *
//                    *   *
//                    *   *
//                    *****

//        Solution:
//        int k = 5;
//        for (int i = 0; i < 5; i++) {
//            if(i == 0 || i == k - 1) {
//                for (int j = 0; j < k; j++) {
//                    System.out.print("*");
//                }
//            } else {
//                System.out.print("*");
//                for (int j = 0; j < k - 2; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }


// ----------------------------------------------------------------------


    }
}
