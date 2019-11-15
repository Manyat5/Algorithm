package ��Ʊ;
/**
	 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
	
	��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
	
	ע���㲻���������Ʊǰ������Ʊ��
	
	ʾ�� 1:
	
	����: [7,1,5,3,6,4]
	���: 5
	����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
	     ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
	
	ʾ�� 2:
	
	����: [7,6,4,3,1]
	���: 0
	����: �����������, û�н������, �����������Ϊ 0��

 */
public class BestTime {
	public static int maxProfit(int[] prices) {//��Ҫ�Ľ�
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
	 * ����˫ָ����,�������������ҩ�����Ӷ���Ȼ��n^2
	 */
//	public static int maxProfit2(int[] prices) {//��Ҫ�Ľ�
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
	 * ���һ���㷨�����������ܻ�ȡ�������������Ծ����ܵ���ɸ���Ľ��ף��������һ֧��Ʊ��
	 * ��������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ���ƺ����Ե������������򣿣�
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
