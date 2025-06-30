package DSA_Concepts.Arrays;

import javax.lang.model.util.AbstractAnnotationValueVisitor14;

// Leetcode 121 : Best time to buy and sell stock
public class Leetcode121 {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 2 ,1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int b = findBuy(prices);
        if(b == 0) return 0;
        int s = findSell(prices, b);

        return prices[s] - prices[b];
    }

    private static int findSell(int[] prices, int b) {
        int s = b;
        int l = b + 1;
        while (s < prices.length) {
            if(prices[l] > prices[s]) {
                s++;
            } else  {
                l = s;
                s++;
            }
        }

        return l;

    }

    private static int findBuy(int[] prices) {
        int s = 0;
        int l = 1;
        while (l < prices.length) {
            if(prices[l] > prices[s]) {
                l++;
            } else  {
                s = l;
                l++;
            }
        }

        return s == prices.length - 1 ? 0 : s;
    }
}
