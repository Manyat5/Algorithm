package array;
/**
	 *����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
	
	��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
	
	ʾ�� 1:
	
	�������� nums = [1,1,2], 
	
	����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2�� 
	
	�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
	
	ʾ�� 2:
	
	���� nums = [0,0,1,1,1,2,2,3,3,4],
	
	����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
	
	�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

 *finish:2019��8��16��18:26:46
 */
public class DemoveDuplicates {
	 public static int removeDuplicates(int[] nums) {
		 
		 int result=nums.length;
		 for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < result; j++) {
				if(nums[i]==nums[j]) {//��Ҫȥ��nums[j]
					result--;
					for(int k=j;k<nums.length-1;k++) {//������ǰ��
						nums[k]=nums[k+1];
					}
					j--;
				}
			}
		 }

		return result;
    }
	 
	 public int removeDuplicates2(int[] nums) {
		    if (nums.length == 0) return 0;
		    int i = 0;
		    for (int j = 1; j < nums.length; j++) {
		        if (nums[j] != nums[i]) {
		            i++;
		            nums[i] = nums[j];
		        }
		    }
		    return i + 1;
		}

	 
	 public static void main(String[] args) {
		int[] nums= {1,1,2};
		int result = removeDuplicates(nums);
		System.out.println(result);
	}
}
