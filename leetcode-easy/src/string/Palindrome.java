package string;
/**
 * ���Ĵ�
 * @author WWY
 *
 */
public class Palindrome {
	/**
	 * ����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
		˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���
		
		ʾ�� 1:
		����: "A man, a plan, a canal: Panama"
		���: true
		
		ʾ�� 2:
		����: "race a car"
		���: false
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
