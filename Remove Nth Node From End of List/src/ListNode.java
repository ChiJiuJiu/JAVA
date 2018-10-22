<<<<<<< HEAD

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
	public static void show(ListNode Head) {
		if(Head.next == null)
			return;
		ListNode p = Head.next;
		while(p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
	}
	public static void main(String[] args) {
		ListNode Head = new ListNode(0);
		Head.next = new ListNode(1);
		Head.next.next = new ListNode(2);
		Head.next.next.next = new ListNode(3);
		Head.next.next.next.next = new ListNode(4);
		Head.next.next.next.next.next = new ListNode(5);
		Head.next.next.next.next.next.next = null;
		Head = Solution.removeNthFromEnd(Head, 2);
		show(Head);
	}

}
class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Head = new ListNode(0);
        Head.next = head;
    	ListNode pointer = Head.next;
        int len = 0;
        int cnt = 1;
        int condition = 0;
        while(pointer != null) {
        	pointer = pointer.next;
        	len++;
        }
        condition = len - n + 1;
        ListNode p = Head.next;
        ListNode pre = Head;
        while(cnt < condition) {
        	cnt++;
        	pre = p;
        	p = p.next;
        }
        pre.next = p.next;
        p.next = null;
        return Head.next;
    }
=======

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
	public static void show(ListNode Head) {
		if(Head.next == null)
			return;
		ListNode p = Head.next;
		while(p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
	}
	public static void main(String[] args) {
		ListNode Head = new ListNode(0);
		Head.next = new ListNode(1);
		Head.next.next = new ListNode(2);
		Head.next.next.next = new ListNode(3);
		Head.next.next.next.next = new ListNode(4);
		Head.next.next.next.next.next = new ListNode(5);
		Head.next.next.next.next.next.next = null;
		Head = Solution.removeNthFromEnd(Head, 2);
		show(Head);
	}

}
class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Head = new ListNode(0);
        Head.next = head;
    	ListNode pointer = Head.next;
        int len = 0;
        int cnt = 1;
        int condition = 0;
        while(pointer != null) {
        	pointer = pointer.next;
        	len++;
        }
        condition = len - n + 1;
        ListNode p = Head.next;
        ListNode pre = Head;
        while(cnt < condition) {
        	cnt++;
        	pre = p;
        	p = p.next;
        }
        pre.next = p.next;
        p.next = null;
        return Head.next;
    }
>>>>>>> a8a83698f7e43fa083c63e8090a315f562686894
}