
public class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
	public static void main(String[] args) {
		ListNode Head = new ListNode(0);
		Head.next = new ListNode(1);
		Head.next.next = null;
//		Head.next.next = new ListNode(4);
//		Head.next.next.next = new ListNode(3);
//		Head.next.next.next.next = new ListNode(2);
//		Head.next.next.next.next.next = new ListNode(5);
//		Head.next.next.next.next.next.next = new ListNode(2);
//		Head.next.next.next.next.next.next.next = null;
		Head = Solution.partition(Head, 3);
		show(Head);
	}
	public static void show(ListNode head) {
		ListNode p = head.next;
		while(p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
	}
}
class Solution {
    public static ListNode partition(ListNode Head, int x) {
    	ListNode head = new ListNode(0);
    	head.next = Head;
        if(head.next == null)
        	return head.next;
        ListNode SH = new ListNode(0);
        ListNode BH = new ListNode(0);
        SH.next = null;
        BH.next = null;
        ListNode pre = head;
        ListNode p = head.next;
        ListNode next = p.next;
        while(p != null) {
        	if(p.val < x) {
        		pre.next = next;
        		p.next = null;
        		insert(SH, p);
        	}else {
        		pre.next = next;
        		p.next = null;
        		insert(BH, p);
        	}
        	p = pre.next;
        		if(p == null)
        			break;
        	next = p.next;
        }
        p = SH;
        while(p.next != null) {
        	p = p.next;
        }
        p.next = BH.next;
        return SH.next;
    }
    static void insert(ListNode head,ListNode node) {
    	ListNode p = head;
    	while(p.next != null) {
    		p = p.next;
    	}
    	p.next = node;
    	node.next = null;
    }
}