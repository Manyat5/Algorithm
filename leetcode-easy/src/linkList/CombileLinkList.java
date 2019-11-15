package linkList;
/**
 * ��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 

ʾ����

���룺1->2->4, 1->3->4
�����1->1->2->3->4->4

 *begin:2019��8��16��15:16:24
 *
 *finish:2019��8��16��16:54:52
 */
public class CombileLinkList {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//��ֹ����
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
		//����1
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(4);
		l1.next=l2;l2.next=l3;
		//�����
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
	 ListNode(int x) {//������
		 val = x; 
	 }
}