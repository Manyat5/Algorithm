package tree;
//finish��2019��8��27��11:33:53
public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null) return true;
		if(p==null ||q==null) return false;
		
		boolean result=false;
		if(p.val==q.val) {
			//��ڵ����
			result=isSameTree(p.left, q.left);
			if(result) {
				//�ҽڵ����
				result=isSameTree(p.right, q.right);
			}else {
				return false;
			}
		}else {
			return false;
		}
		return result;
		
    }
}
