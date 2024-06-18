package hncdev;

public class BuyAndSell {

    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
    to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit,
    return 0.
     */

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BuyAndSell buyAndSell = new BuyAndSell();
        int[] prices = {2,4,1};
        int profit = buyAndSell.maxProfit(prices);
        System.out.println(profit);
    }
}
