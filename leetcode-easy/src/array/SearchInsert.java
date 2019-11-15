package array;
/**
	 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
	
	����Լ������������ظ�Ԫ�ء�
	
	ʾ�� 1:
	
	����: [1,3,5,6], 5
	���: 2
	
	ʾ�� 2:
	
	����: [1,3,5,6], 2
	���: 1
	
	ʾ�� 3:
	
	����: [1,3,5,6], 7
	���: 4
	
	ʾ�� 4:
	
	����: [1,3,5,6], 0
	���: 0
	
 *begin:2019��8��19��10:44:03
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
