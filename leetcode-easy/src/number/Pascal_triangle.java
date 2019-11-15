package number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行
 * 在杨辉三角中，每个数是它左上方和右上方的数的和
 */
public class Pascal_triangle {
	public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> resultlist = new ArrayList<List<Integer>>();
        if(numRows==0) return resultlist;
        resultlist.add(Arrays.asList(1));//添加第一行
        if(numRows==1) return resultlist;
        resultlist.add(Arrays.asList(1,1));//添加第二行
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
