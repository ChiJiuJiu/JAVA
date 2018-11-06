
public class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
	public static void main(String[] args) {
		

	}

}
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = new ListNode(-1);
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(-1);
        head.next = null;
        head1.next = l1;
        head2.next = l2;
        ListNode tp1,tp2,pre;
        pre = head;
        while(p1 != null && p2 != null) {
        	tp1 = p1.next;
        	tp2 = p2.next;
        	if(p1.val <= p2.val) {
        		pre.next = p1;
        		p1.next = null;
        		head1.next = tp1;
        		p1 = tp1;
        		pre = pre.next;
        	}else {
        		pre.next = p2;
        		p2.next = null;
        		head2.next = tp2;
        		p2 = tp2;
        		pre = pre.next;
        	}
        }
        if(p1 == null) {
        	pre.next = p2;
        }else if(p2 == null) {
        	pre.next = p1;
        }
        return head.next;
    }
}