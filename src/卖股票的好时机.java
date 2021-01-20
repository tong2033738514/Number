import java.util.Arrays;

public class 卖股票的好时机 {
/*    *//**
     *
     * @param prices int整型一维数组
     * @return int整型
     *//*
    public static int maxProfit(int[] prices) {
        // write code here
        if(null == prices || prices.length == 0) {
            return 0;
        }
        Arrays.sort(prices);
        return prices[prices.length-1]-prices[0];

    }

    public static void main(String[] args) {
        int[] a ={1,2};
        System.out.println(maxProfit(a));
    }*/
    public static int maxProfit(int[] prices) {
        // write code here
        if(prices==null||prices.length<2) return 0;

        int profit =0,buy = prices[0];
        for(int i=1;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            profit = Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] a ={1,4,2};
        System.out.println(maxProfit(a));
    }
}
