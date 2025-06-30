import java.util.Arrays;

public class Leetcode36 {


    public static void main(String[] args) {
        char[][] arr1 = {
                {'.', '.', '.','.', '5', '.','.', '1', '.'},
                {'.', '4', '.','3', '.', '.','.', '.', '.'},
                {'.', '.', '.','.', '.', '3','.', '.', '1'},
                {'8', '.', '.','.', '.', '.','.', '2', '.'},
                {'.', '.', '2','.', '7', '.','.', '.', '.'},
                {'.', '1', '5','.', '.', '.','.', '.', '.'},
                {'.', '.', '.','.', '.', '2','.', '.', '.'},
                {'.', '2', '.','9', '.', '.','.', '.', '.'},
                {'.', '.', '4','.', '.', '.','.', '.', '.'}

        };

        System.out.println(isValidSudoku(arr1));

    }


    private static boolean isValidSudoku(char[][] board) {
        char[] tempArr = {'0', '0', '0', '0', '0', '0', '0', '0', '0'};
        for (int i = 0; i < 9; i++) {
            tempArr = Arrays.copyOf(board[i], 9);
                Arrays.sort(tempArr);
                if(ifDistinct(tempArr)) return false;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tempArr[j] = board[j][i];
            }
            Arrays.sort(tempArr);
            if(ifDistinct(tempArr)) return false;
        }

        for (int j = 0; j < 3 ; j++) {
            for (int i = 0; i < 3; i++) {
                char[] newArr = cubeArr(board, 3 * i, 3 * j);
                Arrays.sort(newArr);
                if(ifDistinct(newArr)) return false;
            }
        }

        return true;
    }

    private static char[] cubeArr(char[][] board, int s, int t){
        char[] tempArr2 = {'0', '0', '0','0', '0', '0','0', '0', '0'};
        int k = 0;
        for (int i = t; i < 3 + t; i++) {
            for (int j = s; j < 3 + s; j++) {
                tempArr2[k] = board[i][j];
                k++;
            }
        }
        return tempArr2;
    }

    private static boolean ifDistinct(char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            String arr1 = new String(arr);
            if (i < arr.length - 1 && arr1.charAt(i) == arr1.charAt(i + 1) && arr1.charAt(i) != '.') {
                return true;
            }

        }
        return false;
    }


}
