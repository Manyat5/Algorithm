package tree;
/**
 * ����һ�����������ҳ��������ȡ�

�����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����

˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣

ʾ����
���������� [3,9,20,null,null,15,7]��

    3
   / \
  9  20
    /  \
   15   7

�������������� 3 ��

begin:2019��8��28��11:27:23 	finish��2019��8��29��11:26:50
 *
 */
public class MaxDepth {
	
	public int maxDepth(TreeNode root) {
		int result = 0;
		if(root==null) return result;
		result++;
		int leftResult=maxDepth(root.left);
		int rightResult=maxDepth(root.right);
		//���˷�����ִ��ʱ���Ȼ��ͬ
//		result+=leftResult>rightResult?leftResult:rightResult;
		result+=Math.max(leftResult, rightResult);
		return result;
    }
//	public static int a(TreeNode rot,int temp) {
//		
//		return 0;
//	}
}
