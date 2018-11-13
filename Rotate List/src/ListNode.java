

public class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	public static void main(String[] args) {
		ListNode Head = new ListNode(0);
		Head.next = new ListNode(1);
		Head.next.next = new ListNode(2);
		Head.next.next.next = null;
		Head.next = Solution.rotateRight(Head.next, 1);
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
    public static ListNode rotateRight(ListNode head, int k) {
    	if(head == null)
        	return head;
    	ListNode Head = new ListNode(0);
        Head.next = head;
        ListNode p;
        int cnt = 0;
        int len = lenOfList(head);
        k %= len;
        while(cnt++ < k) {
        	p = search(Head);
        	insert(Head, p);
        }
        return Head.next;
    }
    static ListNode search(ListNode Head) {
    	ListNode p = Head.next;
    	ListNode pre = Head;
    	if(p == null)
    		return null;
    	while( p.next != null) {
    		pre = p;
    		p = p.next;
    	}
    	pre.next = null;
    	return p;
    }
    static void insert(ListNode Head, ListNode p) {
    	p.next = Head.next;
    	Head.next = p;
    }
    public static int lenOfList(ListNode head) {
    	ListNode p = head;
    	if(head == null)
    		return 0;
    	int len = 0;
    	while(p != null) {
    		len++;
    		p = p.next;
    	}
    	return len;
    }
}