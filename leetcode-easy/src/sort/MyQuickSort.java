package sort;


/**
 * 自己尝试实现快排
 * @author WWY
 *
 */
public class MyQuickSort {
	public static void main(String[] args) {
		int[] array=new int[] {72,6,57,88,60,42,83,73,48,85};
		sort(array);
//		for (int i : array) System.out.print(i+",");
	}
	
	public static void sort(int[] a) {
		sort(a,0,a.length-1);
	}
	public static void sort(int[] a,int low,int height) {
		if(low>=height) return;
		int i=low,j=height;
		while(i<j) {
			while(a[j]>=a[i]&&i<j)j--;
			if(i<j) {
				a[i]=a[i]^a[j];a[j]=a[i]^a[j];a[i]=a[i]^a[j];
				i++;
			}
			while(a[i]<=a[j]&&i<j) i++;
			if(i<j) {
				a[i]=a[i]^a[j];a[j]=a[i]^a[j];a[i]=a[i]^a[j];
				j--;
			}
		}
		sort(a,low,i-1);
		sort(a,i+1,height);
	}
	
}
