package integer;
/**
 * ʵ�� int sqrt(int x) ������

���㲢���� x ��ƽ���������� x �ǷǸ�������

���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��

ʾ�� 1:

����: 4
���: 2

ʾ�� 2:

����: 8
���: 2
˵��: 8 ��ƽ������ 2.82842..., 
     ���ڷ���������������С�����ֽ�����ȥ��


 *begin:2019��8��24��11:18:40
 */
public class MySqrt {
	public static int mysqrt(int x) {
		return (int) a(x, x);
	}
	//�ݹ�
	public static double a(int x,double temp) {
		if(x<temp*temp) {
			return a(x,temp/2);
		}else {
			if(temp<2&&x>4) {
				return Math.ceil(temp);
			}
			return temp;
		}
	}
	public static void main(String[] args) {
		int x=9;
		System.out.println(mysqrt(x));
	}
}
