
public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
	public static void show(ListNode head) {
		ListNode p = head.next;
		while(p != null) {
			System.out.print(p.val+" ");
			p = p.next;
		}
 	}
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = null;
		head = Solution.swapPairs(head.next);
		ListNode Head = new ListNode(0);
		Head.next = head;
		show(Head);
	}

}
class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode Head = new ListNode(0);
        Head.next = head;
    	if(Head.next == null)
        	return head;
    	ListNode pre,p,q;
        pre = Head;
        p = pre.next;
        q = p.next;
        while(q != null) {
        	p.next = q.next;
        	q.next = p;
        	pre.next = q;
        	pre = p;
        	p = pre.next;
        	if(p != null)
        		q = p.next;
        	else 
        		q = null;
        }
        return Head.next;
    }
}