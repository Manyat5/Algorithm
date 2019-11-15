package bst;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	   int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { val = x; }
		   
	/**
		 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
		 * 以上的输出对应以下 5 种不同结构的二叉搜索树：

	   1         3     3      2      1
	    \       /     /      / \      \
	     3     2     1      1   3      2
	    /     /       \                 \
	   2     1         2                 3
		 */
	   public static List<TreeNode> generateTrees(int n) {
		   List<TreeNode> resultList = new ArrayList<TreeNode>();
		   if(n==0) return resultList;
		   for (int i = 1; i <=n; i++) {
			   TreeNode root=new TreeNode(i);
			   for(int j=i-1;j>0;j--) {
				   root.addToBST( new TreeNode(j));
			   }
			   for(int k=i+1;k<=n;k++) {
				   root.addToBST( new TreeNode(k));
			   }
			   resultList.add(root);
		   }
		   return resultList;
	    }
	 
	   public void addToBST(TreeNode node) {
		   if(node==null) return ;//为空也不怕
		   if(node.val>this.val) {
			   if(this.right==null) this.right=node;
			   else this.right.addToBST(node);
		   }else {
			   if(this.left==null) this.left=node;
			   else this.left.addToBST(node);
		   }
	   }
	   public static void main(String[] args) {
			generateTrees(1);
		}
	   public TreeNode[]  generateTrees(int i,int j) {
		   TreeNode[] result=new TreeNode[j-i+1];
		   if(i==j) {
			   result[0]= new TreeNode(i);
			   return result;
		   }
		   TreeNode root=null;
		   for(int k=i;k<j;k++) {
			   root=new TreeNode(k);
//			   root.left=generateTrees(i, k-1);
//			   root.right=generateTrees(k+1, j);
			   result[k]=root;
		   }
		   return null;
	   }
}
