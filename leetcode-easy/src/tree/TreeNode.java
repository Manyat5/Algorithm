package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
     public TreeNode() {
	}
     /**
      * 中序遍历
      */
     public List<Integer> inorderTraversal(TreeNode root) {
    	 List<Integer> resultList = new ArrayList<Integer>();
    	 if(root==null) return resultList;
    	 zhongXu(root, resultList);
    	 return resultList;
     }
     public void zhongXu(TreeNode root,List<Integer> list) {
    	 if(root==null) return;
    	 zhongXu(root.left,list);
    	 list.add(root.val);
    	 zhongXu(root.right, list);
     }
     
  
     /**
      * 别人的解法，击败98%
      * @param root
      * @param level
      * @param result
      */
     private void addNode(TreeNode root, int level, List<List<Integer>> result) {
         if (root == null) {
             return;
         }
         
         if (result.size() < level + 1) {
             result.add(new ArrayList<Integer>());
         }
         
         result.get(level).add(root.val);
         
         addNode(root.left, level + 1, result);
         addNode(root.right, level + 1, result);

     }
     
     public List<List<Integer>> levelOrderBottom1(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();
         
         addNode(root, 0, result);
         
         List<List<Integer>> resultReversed = new ArrayList<>();
         for (int i = result.size() - 1; i >= 0; i--) {
             resultReversed.add(result.get(i));
         }
         
         return resultReversed;
     }
     /**
      * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树
      * @param nums
      * @return
      */
     public TreeNode sortedArrayToBST(int[] nums) {
    	 if(nums.length==0) return null;
         return ToBST(nums,0,nums.length-1);
     }
     
     	public TreeNode ToBST(int[] nums,int left,int right) {
     		 if(left>right) return null;
     		 int mid=(right+left)/2;
     		 TreeNode root = new TreeNode(nums[mid]);
     		 root.left=ToBST(nums, left, mid-1);
     		 root.right=ToBST(nums, mid+1, right);
     		 return root;
     	}

     /**
      * 判断是否为平衡二叉树
      * @param root
      * @return
      */
     public boolean isBalanced(TreeNode root) {
    	 if(root==null) return false;//先不考虑空的情况
    	 if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>1) return false;//需要用到最大深度
    	 else {
    		 if(root.left==null&&root.right==null || root.left!=null&&root.right!=null) {
        		 return true;
        	 }
    		 return isBalanced(root.left) && isBalanced(root.right);
    	 }
     }
     /**
      * 二叉树的最大深度
      */
     public int maxDepth(TreeNode root) {
 		int result = 0;
 		if(root==null) return result;
 		result++;
 		int leftResult=maxDepth(root.left);
 		int rightResult=maxDepth(root.right);
 		result+=Math.max(leftResult, rightResult);
 		return result;
     }
     /**
      * 二叉树的最小深度
      */
     public int minDepth(TreeNode root) {
    	 if(root==null) return 0;
         if(root.left==null&&root.right==null) return 1;
         if(root.left==null) return minDepth(root.right)+1; 
         if(root.right==null) return minDepth(root.left)+1; 
         return Math.min(minDepth(root.left), minDepth(root.right))+1;
     }
     /**
      * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
      */
     public boolean hasPathSum(TreeNode root, int sum) {
    	 if(root==null) return false;
    	 int result=sum-root.val;
    	 if(root.left==null&&root.right==null) return result==0;//此处一定要叶子节点，这样可以少判断
    	 else  return hasPathSum(root.left, result) || hasPathSum(root.right, result);
     }
    /**
     * 翻转一棵二叉树。
     */
     public TreeNode invertTree(TreeNode root) {
    	if(root==null) return null;
    	TreeNode temp=invertTree(root.left);
    	root.left=invertTree(root.right);
    	root.right=temp;
		return root;
     }
}
