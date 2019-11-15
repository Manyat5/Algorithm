package array;
/**
	 * ����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
	
	��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
	
	Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
	
	ʾ�� 1:
	
	���� nums = [3,2,2,3], val = 3,
	
	����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��
	
	�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
	
	ʾ�� 2:
	
	���� nums = [0,1,2,2,3,0,4,2], val = 2,
	
	����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��
	
	ע�������Ԫ�ؿ�Ϊ����˳��
	
	�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
	start:2019��8��17��10:21:02 
	finshi:2019��8��17��12:05:08

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
