package linkList;
/**
 * ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�

ʾ�� 1:

����: 1->1->2
���: 1->2

ʾ�� 2:

����: 1->1->2->3->3
���: 1->2->3

begin:2019��8��25��11:22:05	finish:2019��8��25��12:07:27
 *
 */
public class DeleteDuplicates {
	public static ListNode deleteDuplicates(ListNode head) {
		 if(head==null) {
				return null;
			}
	        if(head.next==null){
	            return head;
	        }else if(head.val==head.next.val) {
	            head=head.next;
				head=deleteDuplicates(head);
			}else{
	            head.next=deleteDuplicates(head.next);
	        }
	        return head;
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
			l3.next=l4;
			l4.next=l5;l5.next=l6;
			ListNode newNode = deleteDuplicates(l1);
			System.out.println(newNode.val+" "+newNode.next.val+" "+newNode.next.next.val);
	}
}


 