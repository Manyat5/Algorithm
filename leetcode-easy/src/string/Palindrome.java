package string;
/**
 * 回文串
 * @author WWY
 *
 */
public class Palindrome {
	/**
	 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
		说明：本题中，我们将空字符串定义为有效的回文串。
		
		示例 1:
		输入: "A man, a plan, a canal: Panama"
		输出: true
		
		示例 2:
		输入: "race a car"
		输出: false
	 */
	public boolean isPalindrome(String s) {
		String result = s.replaceAll(",","").replaceAll(":","").replaceAll(" ","").toLowerCase();
		if(result.length()==0) return true;
		return false;
	}
	
	public static void main(String[] args) {
		String s="A man,a plan,a canal:Panama";
		String result = s.replaceAll(",","").replaceAll(":","").replaceAll(" ","").toLowerCase();
		System.out.println(result);
	}
}
