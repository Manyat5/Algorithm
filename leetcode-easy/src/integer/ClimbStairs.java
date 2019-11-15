package integer;
/**
 * ������������¥�ݡ���Ҫ n ������ܵ���¥����

ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
//
//ע�⣺���� n ��һ����������
//
//ʾ�� 1��
//
//���룺 2
//����� 2
//���ͣ� �����ַ�����������¥����
//1.  1 �� + 1 ��
//2.  2 ��
//
//ʾ�� 2��
//
//���룺 3
//����� 3
//���ͣ� �����ַ�����������¥����
//1.  1 �� + 1 �� + 1 ��
//2.  1 �� + 2 ��
//3.  2 �� + 1 ��

���װ棺�ж�����
 *begin��2019��8��23��11:07:48
 */
public class ClimbStairs {
	public static int climbStairs(int n) {
		int result=0;int begin=0;
		if(n%2!=0) {
			begin=1;
		}else {
			begin=2;
			result+=combination(0, n);
		}
		for (int i = begin; i < n; i+=2) {
			result+=combination(i, n-1)/i;
		}
		result++;
        return result;
    }
	
	  public static int permutation(int m,int n){
	        if(n==0){
	            return 1;
	        }
	        int result=1;
	        for(int k=n;k>=n-m+1;k--){
	            result*=k;
	        }
	        return result;
	    }
	  public static int combination(int m,int n){
	        return permutation(m,n)/permutation(m,m);
	    }
	public static void main(String[] args) {
		int n=38;
//		System.out.println(combination(2, 8));
		System.out.println(climbStairs(n));
	}
}
