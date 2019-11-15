package integer;
/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"

示例 2:

输入: a = "1010", b = "1011"
输出: "10101"

 *begin：2019年8月21日11:33:59
 */
public class AddBinary {
	public static String addBinary(String a, String b) {
		byte[] byteA = a.getBytes();
		for (byte c : byteA) {
			c=(byte) (c-'0');
		}
		byte[] byteB = b.getBytes();
		for (byte c : byteB) {
			c=(byte) (c-'0');
		}
		
		int minLen=Math.min(a.length(), b.length());
		int maxLen=Math.max(a.length(), b.length());
		byte[] result=new byte[maxLen+1];
		for (int i = 0; i < minLen; i++) {
			if(byteA[i]+byteB[i]+result[i]>1) {
				result[i+1]++;
				result[i]=(byte) (byteA[i]+byteB[i]+result[i]-2);
			}
		}
		for(int i=minLen;i<maxLen;i++) {
			if(byteA[i]+result[i]>1) {
				result[i+1]++;
				result[i]=(byte) (byteA[i]+result[i]-2);
			}
		}
		for (byte c : result) {
			System.out.print(c+",");
		}
        return "";
    }
	public static void main(String[] args) {
		String a="11";
		String b="1";
		System.out.println(addBinary(a, b));
	}
}
