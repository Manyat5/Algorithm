package tree;
/**
 * 给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7

返回它的最大深度 3 。

begin:2019年8月28日11:27:23 	finish：2019年8月29日11:26:50
 *
 */
public class MaxDepth {
	
	public int maxDepth(TreeNode root) {
		int result = 0;
		if(root==null) return result;
		result++;
		int leftResult=maxDepth(root.left);
		int rightResult=maxDepth(root.right);
		//换了方法，执行时间截然不同
//		result+=leftResult>rightResult?leftResult:rightResult;
		result+=Math.max(leftResult, rightResult);
		return result;
    }
//	public static int a(TreeNode rot,int temp) {
//		
//		return 0;
//	}
}
