package string;


/**
	 *实现 strStr() 函数。
	
	给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
	
	示例 1:
	
	输入: haystack = "hello", needle = "ll"
	输出: 2
	
	示例 2:
	
	输入: haystack = "aaaaa", needle = "bba"
	输出: -1

 *begin：2019年8月18日15:47:24 	finish:2019年8月18日20:38:13，leetcode出毛病了
 */
public class MyIndexOf {
	public static int strStr(String haystack, String needle) {
		//needle为空串
		if(haystack==null||haystack.length()<needle.length()||needle==null) {
			return -1;
		}else if(needle=="") {//haystack空串
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
			if(longchar[k]==shortchar[j]) {//匹配
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
//			if(longchar[i]==shortchar[j]) {//匹配
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
