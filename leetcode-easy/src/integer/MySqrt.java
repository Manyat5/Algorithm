package integer;
/**
 * 实现 int sqrt(int x) 函数。

计算并返回 x 的平方根，其中 x 是非负整数。

由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

示例 1:

输入: 4
输出: 2

示例 2:

输入: 8
输出: 2
说明: 8 的平方根是 2.82842..., 
     由于返回类型是整数，小数部分将被舍去。


 *begin:2019年8月24日11:18:40
 */
public class MySqrt {
	public static int mysqrt(int x) {
		return (int) a(x, x);
	}
	//递归
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
