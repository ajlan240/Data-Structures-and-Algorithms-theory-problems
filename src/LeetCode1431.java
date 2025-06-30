import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1431 {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 3};
        for(boolean b : kidsWithCandies(a, 3)){
            System.out.print(b + ",");
        }

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int ec) {
        List<Boolean> list = new ArrayList<>();
        int mx = candies[0];
        for (int i = 1; i < candies.length; i++) {
            mx = Math.max(candies[i], mx);
        }

        int i = 0;
        while(i < candies.length) {
            list.add((candies[i] + ec) >= mx);
            i++;
        }
        return list;
    }

}
