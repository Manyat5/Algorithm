package array;
/**
	 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
	
	你可以假设数组中无重复元素。
	
	示例 1:
	
	输入: [1,3,5,6], 5
	输出: 2
	
	示例 2:
	
	输入: [1,3,5,6], 2
	输出: 1
	
	示例 3:
	
	输入: [1,3,5,6], 7
	输出: 4
	
	示例 4:
	
	输入: [1,3,5,6], 0
	输出: 0
	
 *begin:2019年8月19日10:44:03
 */
public class SearchInsert {
	
	public static int searchInsert(int[] nums, int target) {
		return binarySerch(nums, 0, nums.length-1, target);
    }
	
	public static int  binarySerch(int[] nums ,int begin,int end,int target) {
		if(end-begin<=1) {
			if(nums[begin]==target) {
				return begin;
			}else if(nums[end]==target) {
				return end;
			}else if(nums[begin]>target) {
				return 0;
			}else if (nums[end]<target) {
				return nums.length;
			}else {
				return begin+1;
			}
		}
		int mid=(end+begin)/2;
		if(target>nums[mid]) {
			return binarySerch(nums, mid, end, target);
		}else if(target<nums[mid]) {
			return binarySerch(nums, begin, mid, target);
		}else {
			return mid;
		}
	}
	public static void main(String[] args) {
		int[] nums= {1,3,5,6};
		int target=7;
//		int test=(int)(Math.ceil((double)target/2));
//		System.out.println(test);
				
		System.out.println(searchInsert(nums, target));
	}
}
