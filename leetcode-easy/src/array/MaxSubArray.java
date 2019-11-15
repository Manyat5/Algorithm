package array;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
	
 *begin:2019年8月20日11:11:48		finish:2019年8月20日12:35:16
 */
public class MaxSubArray {
	public static int maxSubArray(int[] nums) {
		//全是负数
		boolean flag=true;
		for (int i : nums) {
			if(i>=0) {
				flag=false;
			}
		}
		if(flag) {
			int result = nums[0];
			for (int i = 1; i < nums.length; i++) {
				result=nums[i]>result?nums[i]:result;
			}
			return result;
		}
		 int tempResult = 0;int result =0;
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]>=0) {
					tempResult+=nums[i];
				}else if(nums[i]<0) {
					tempResult=tempResult+nums[i]<0?0:tempResult+nums[i];
				}
				result=tempResult>result?tempResult:result;
			}
			return result;
    }
	
//	public static int a(int[] nums) {
//		
//	}
	
	public static void main(String[] args) {
		int[] nums= {3,-2,-3,-3,1,3,0};
//		int[] nums= {-2,-1};
		System.out.println(Arrays.toString(nums));
		int result = maxSubArray(nums);
		System.out.println(result);
	}
}
