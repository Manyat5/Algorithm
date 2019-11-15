package integer;
/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
//注意：给定 n 是一个正整数。
//
//示例 1：
//
//输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
//示例 2：
//
//输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶

进阶版：有多少种
 *begin：2019年8月23日11:07:48
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
