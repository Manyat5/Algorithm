package tree;
/**
 * ����һ����������������Ƿ��Ǿ���ԳƵġ�

���磬������ [1,2,2,3,4,4,3] �ǶԳƵġ�

    1
   / \
  2   2
 / \ / \
3  4 4  3

����������� [1,2,2,null,3,null,3] ���Ǿ���ԳƵ�:

    1
   / \
  2   2
   \   \
   3    3

begin:2019��8��27��11:33:44	finish��2019��8��28��11:25:36
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
