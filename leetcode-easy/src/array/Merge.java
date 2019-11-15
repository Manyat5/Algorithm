package array;
/**
 * �������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣

˵��:

    ��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
    ����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�

ʾ��:

����:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

���: [1,2,2,3,5,6]

begin:2019��8��26��11:17:48	finish:2019��8��26��11:37:40
 *
 */
public class Merge {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n-1;
        while(m>0&&n>0) {
        	if(nums1[m-1]>nums2[n-1]) {
        		nums1[k--]=nums1[m-1];
        		m--;
        	}else {
        		nums1[k--]=nums2[n-1];
        		n--;
        	}
        }
    }
	public static void main(String[] args) {
		int m=3,n=3;
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		merge(nums1, m, nums2, n);
		for (int i : nums1) {
			System.out.print(i+",");
		}
	}
}
