package 股票;
/**
	 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
	
	如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
	
	注意你不能在买入股票前卖出股票。
	
	示例 1:
	
	输入: [7,1,5,3,6,4]
	输出: 5
	解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
	     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
	
	示例 2:
	
	输入: [7,6,4,3,1]
	输出: 0
	解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。

 */
public class BestTime {
	public static int maxProfit(int[] prices) {//需要改进
		if(prices.length<2) return 0;
		int result=0;
		for (int i = 0; i < prices.length; i++) {
			int buy=prices[0];
			for (int j = i+1; j < prices.length; j++) {
				int sell=prices[j];
				result=Math.max(sell-buy, result);
			}
		}
		return result;
    }
	public static void main(String[] args) {
		int[] prices=new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit3(prices));
	}
	/**
	 * 尝试双指针解决,结果：换汤不换药，复杂度依然是n^2
	 */
//	public static int maxProfit2(int[] prices) {//需要改进
//		int minprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minprice)
//                minprice = prices[i];
//            else if (prices[i] - minprice > maxprofit)
//                maxprofit = prices[i] - minprice;
//        }
//        return maxprofit;
//    }
	/**
	 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）
	 * 你必须在再次购买前出售掉之前的股票（似乎可以当天卖，当天买？）
	 * @param prices
	 * @return
	 */
	public static int maxProfit3(int[] prices) {
		if(prices.length<2) return 0; 
        int profitTotal=0;
        int profit=0;
        int buy=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
			if(buy>prices[i]) {
				buy=prices[i];
			}else {
				profit=prices[i]-buy;
				buy=prices[i];
				profitTotal+=profit;
			}
		}
        return profitTotal;
    }
}
