package string;


/**
	 *ʵ�� strStr() ������
	
	����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��
	
	ʾ�� 1:
	
	����: haystack = "hello", needle = "ll"
	���: 2
	
	ʾ�� 2:
	
	����: haystack = "aaaaa", needle = "bba"
	���: -1

 *begin��2019��8��18��15:47:24 	finish:2019��8��18��20:38:13��leetcode��ë����
 */
public class MyIndexOf {
	public static int strStr(String haystack, String needle) {
		//needleΪ�մ�
		if(haystack==null||haystack.length()<needle.length()||needle==null) {
			return -1;
		}else if(needle=="") {//haystack�մ�
			return 0;
		}
		char[] longchar=haystack.toCharArray();
		char[] shortchar = needle.toCharArray();
		//next[]
		int[] next=new int[shortchar.length];
		next[0]=0;
		int i=0;
		for (int j = 1; j < next.length; j++) {
			if(shortchar[i]==shortchar[j]) {
				i++;
			}else {
				
			}
			next[j]=i;
		}
//		int next[]=getNext(needle);
	
		
		int j=0;
		for(int k=0;k<longchar.length;k++) {
			if(longchar[k]==shortchar[j]) {//ƥ��
				j++;
			}else if(longchar[k]!=shortchar[j]&&j>0) {
				k--;j=next[j];
			}
			if(j==next.length) {
				return k-next.length+1;
			}
		}
        return -1;
    }
	//KMP-getNext
	public static int[] getNext(String needle) {
		char[] array=needle.toCharArray();
		int[] next=new int[array.length];
		next[0]=0;
		int i=0;
		for (int j = 1; j < next.length; j++) {
			if(array[i]==array[j]) {
				i++;
			}else {
				
			}
			next[j]=i;
		}
		return next;
	}
	public static void main(String[] args) {
		String haystack="";
		String needle="";
	
		System.out.println(strStr(haystack, needle));
	}
	
//	public int KMP(String haystack,String needle, int[] next) {
//		char[] longchar=haystack.toCharArray();
//		char[] shortchar = needle.toCharArray();
//		int j=0;
//		for(int i=0;i<longchar.length;i++) {
//			if(longchar[i]==shortchar[j]) {//ƥ��
//				j++;
//			}else if(longchar[i]!=shortchar[j]) {
//				i=i+j;j=next[j];
//			}
//			
//			if(j==next.length-1) {
//				return i;
//			}
//		}
//		
//		return -1;
//	}
}
