package dynamic;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Solution198 {
	/**
	 * ����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�ÿ�䷿�ڶ�����һ�����ֽ�
	 * Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ��
	 * ����������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
	       ����һ������ÿ�����ݴ�Ž��ķǸ��������飬
	       �������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽�
		
		ʾ�� 1:
		����: [1,2,3,1]
		���: 4
		����: ͵�� 1 �ŷ��� (��� = 1) ��Ȼ��͵�� 3 �ŷ��� (��� = 3)��
		     ͵�Ե�����߽�� = 1 + 3 = 4 ��
		
		ʾ�� 2:
		����: [2,7,9,3,1]
		���: 12
		����: ͵�� 1 �ŷ��� (��� = 2), ͵�� 3 �ŷ��� (��� = 9)������͵�� 5 �ŷ��� (��� = 1)��
		     ͵�Ե�����߽�� = 2 + 9 + 1 = 12 ��

	 * @param nums
	 * @return
	 */
	public static int rob(int[] nums) {
		if(nums==null||nums.length==0) return 0;
		int i=0,j=0,result=nums[0];
		for (int k = 1; k < nums.length; k++) {
			if(nums[k]>nums[i]) {
				
			}
		}
        return 0;
    }
	public static void main(String[] args) {
		int[] nums=new int[] {2,1,1,2};
		int result = rob(nums);
		System.out.println(result);
	}
}
