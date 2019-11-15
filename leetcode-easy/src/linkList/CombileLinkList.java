package linkList;
/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

 *begin:2019年8月16日15:16:24
 *
 *finish:2019年8月16日16:54:52
 */
public class CombileLinkList {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//终止条件
		if(l2==null) {
			return l1; 
		}else if(l1==null) {
			return l2;
		}else if(l1.val>l2.val) {
			l2.next=mergeTwoLists(l2.next,l1 );
			return l2;
		}else {
			l1.next=mergeTwoLists(l1.next, l2);
			return l1;
		}
    }
	
	
	
	public static void main(String[] args) {
		//链表1
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(4);
		l1.next=l2;l2.next=l3;
		//链表二
		ListNode l4=new ListNode(1);
		ListNode l5=new ListNode(3);
		ListNode l6=new ListNode(4);
		l4.next=l5;l5.next=l6;
		
		ListNode newNode = mergeTwoLists(l1, l4);
		System.out.println(newNode.val+" "+newNode.next.val+" "+newNode.next.next.val);
	}
}

class ListNode{
	 int val;
	 ListNode next;
	 ListNode(int x) {//构造器
		 val = x; 
	 }
}