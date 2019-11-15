package string;
/**
 * finish:2019Äê8ÔÂ21ÈÕ11:27:35
 * @author WWY
 *
 */
public class LengthOfLastWord {
	
	public static int lengthOfLastWord(String s) {
		while(s.length()>0&&s.charAt(s.length()-1)==' ') {
			s=s.substring(0, s.length()-1);
		}
		String newS1=s.substring(s.lastIndexOf(" ")+1);
		System.out.println(newS1);
		return newS1.length();
    }
	
	public static void main(String[] args) {
//		String s="Hello World";
		String s="b   a    ";
		System.out.println(lengthOfLastWord(s));
	}
}
