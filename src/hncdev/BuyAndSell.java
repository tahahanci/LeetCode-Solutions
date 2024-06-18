package hncdev;

public class BuyAndSell {

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
