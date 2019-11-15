package number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ����һ���Ǹ����� numRows������������ǵ�ǰ numRows ��
 * ����������У�ÿ�����������Ϸ������Ϸ������ĺ�
 */
public class Pascal_triangle {
	public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> resultlist = new ArrayList<List<Integer>>();
        if(numRows==0) return resultlist;
        resultlist.add(Arrays.asList(1));//��ӵ�һ��
        if(numRows==1) return resultlist;
        resultlist.add(Arrays.asList(1,1));//��ӵڶ���
        System.out.println(resultlist.get(1));
        for (int i = 2; i < numRows; i++) {
			Integer[] array=new Integer[i+1];
			array[0]=1;array[numRows-1]=1;
			for(int j=1;j<array.length-1;j++) {
				List<Integer> lastRow=resultlist.get(i-2);
				array[j]=lastRow.get(j-1)+lastRow.get(j);
			}
			resultlist.add(Arrays.asList(array));
		}
        return resultlist;
    }
}
