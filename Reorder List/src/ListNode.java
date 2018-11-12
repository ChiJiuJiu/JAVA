
public class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	public static void main(String[] args) {
		ListNode Head = new ListNode(0);
		Head.next = new ListNode(1);
		Head.next.next = new ListNode(2);
		Head.next.next.next = new ListNode(3);
		Head.next.next.next.next = new ListNode(4);
		Head.next.next.next.next.next = null;
		Solution.reorderList(Head.next);
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
    public static void reorderList(ListNode head) {
    	if(head == null)
    		return;
        ListNode Head = new ListNode(0);
        ListNode pre,next,target;
        Head.next = head;
        pre = Head.next;
        next = pre.next;
        int k = 0;
        int len = getLen(Head);
        while(k < len/2) {
        	target = search(Head, len);
        	insert(pre, next, target);
        	pre = next;
        	next = pre.next;
        	k++;
        }
        target = search(Head, len);
        target.next = null;
    }
    static int getLen(ListNode head) {
    	int len = 0;
    	if(head.next == null)
    		return 0;
    	ListNode p = head.next;
    	while(p != null) {
    		len++;
    		p = p.next;
    	}
    	return len;
    }
    static void insert(ListNode pre,ListNode next,ListNode target) {
    	target.next = next;
    	pre.next = target;
    }
    static ListNode search(ListNode head,int n) {
    	int cnt = 1;
    	ListNode p = head.next; 
    	while(cnt++ < n) {
    		p = p.next;
    	}
    	return p;
    }
}