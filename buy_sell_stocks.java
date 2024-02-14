import java.util.*;

public class buy_sell_stocks {

    public static int max_profit(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {

            if (buy_price < prices[i]) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = prices[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 5, 2, 0 };
        System.out.println("maximun profit: " + max_profit(prices));

        int price[] = { 7, 1, 5, 3, 2, 6, 4 };
        System.out.println("maximun profit: " + max_profit(price));
    }
}
