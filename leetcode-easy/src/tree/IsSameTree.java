package tree;
//finish：2019年8月27日11:33:53
public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null) return true;
		if(p==null ||q==null) return false;
		
		boolean result=false;
		if(p.val==q.val) {
			//左节点遍历
			result=isSameTree(p.left, q.left);
			if(result) {
				//右节点遍历
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
