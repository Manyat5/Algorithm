package integer;
/**
 * ���������������ַ������������ǵĺͣ��ö����Ʊ�ʾ����

����Ϊ�ǿ��ַ�����ֻ�������� 1 �� 0��

ʾ�� 1:

����: a = "11", b = "1"
���: "100"

ʾ�� 2:

����: a = "1010", b = "1011"
���: "10101"

 *begin��2019��8��21��11:33:59
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
