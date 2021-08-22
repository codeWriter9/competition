package org.competition.leetcode.dp;

public class StockBuySell {

    public int stockBuySell(int[] stockPrices) {
        int minPrice = Integer.MAX_VALUE; // set the min price to senitel
        int maxProfit = 0;// set max profit to zero just in case we are not able to sell
        for(int day=0;day<stockPrices.length;day++) { // check for all stocks
            if(stockPrices[day] < minPrice) { // if current price is less than global minima
                minPrice = stockPrices[day]; // set this as min price
            }
            maxProfit = Math.max(maxProfit, stockPrices[day] - minPrice);// if selling beats max profit
        }
        return maxProfit;
    }
}
