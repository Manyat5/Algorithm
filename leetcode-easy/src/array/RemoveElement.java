package array;
/**
	 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
	
	不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	
	元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
	
	示例 1:
	
	给定 nums = [3,2,2,3], val = 3,
	
	函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
	
	你不需要考虑数组中超出新长度后面的元素。
	
	示例 2:
	
	给定 nums = [0,1,2,2,3,0,4,2], val = 2,
	
	函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
	
	注意这五个元素可为任意顺序。
	
	你不需要考虑数组中超出新长度后面的元素。
	start:2019年8月17日10:21:02 
	finshi:2019年8月17日12:05:08

 *
 */
public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		if(nums.length==0) {
			return 0;
		}
		int result=nums.length;
		for (int i = 0; i <nums.length; i++) {
			if(nums[i]==val) {
				if(nums[result-1]==val) {
					nums[result-1]=val+1;
					i--;result--;
				}else {
					nums[i]=nums[result-1];result--;
				}
				
			}
		}
		return result;
    }
	public static void main(String[] args) {
		int[] nums= {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums, 2));
	}
}
