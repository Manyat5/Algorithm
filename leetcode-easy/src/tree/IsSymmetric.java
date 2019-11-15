package tree;
/**
 * 给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3

但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3

begin:2019年8月27日11:33:44	finish：2019年8月28日11:25:36
 *
 */
public class IsSymmetric {
	public boolean isSymmetric(TreeNode root) {
		if(root==null)  return true;
		return a(root.left,root.right);
    }
	public static boolean  a(TreeNode leftNode,TreeNode rightNode) {
		if(leftNode==null&&rightNode==null)  return true;
		if(leftNode==null||rightNode==null) return false;
		if(leftNode.val!=rightNode.val) return false;
		return a(leftNode.left,rightNode.right)&&a(leftNode.right,rightNode.left);
	}
}
