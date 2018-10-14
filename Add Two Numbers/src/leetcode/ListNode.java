package leetcode;


import java.util.Scanner;

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
	public ListNode() {
		
	}
	public static void display(ListNode Head) {
		ListNode p = Head.next;
		while(p.next != null) {
			System.out.print(p.val+" -> ");
			p = p.next;
		}
		System.out.print(p.val);
	}
	public static ListNode Create() {
		ListNode Head = new ListNode();
		ListNode pre = Head;
		Scanner in = new Scanner(System.in);
		char x = in.next().charAt(0);
		while(x != ')') {
			if(x>'0'&&x<'9') {
				ListNode newNode = new ListNode((x-'0'));
				newNode.next = null;
				pre.next = newNode;
				pre = pre.next;
			}
			x = in.next().charAt(0);
		}
		return Head;
	}
	public static void main(String[] args) {
		ListNode l1,l2,l3;
		Solution ret = new Solution();
		//l1 = Create();
		//l2 = Create();
		l1 = new ListNode();
		l2 = new ListNode();
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(8);
		l1.next.next.next = null;
		l2.next = new ListNode(1);
		l2.next.next = null;
		l3 = ret.addTwoNumbers(l1.next, l2.next);
		display(l3);
	}

}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pl1,pl2;
        pl1 = l1;
        pl2 = l2;
        int carry = 0;
        ListNode Head = new ListNode(0);
        Head.next = null;
        ListNode pre = Head;
        while(pl1!=null&&pl2!=null) {
        	if(pl1.val+pl2.val+carry < 10) {
        	ListNode newNode = new ListNode(pl1.val+pl2.val+carry);
        	carry = 0;
        	newNode.next = null;
        	pre.next = newNode;
        	pre = pre.next;
        	pl1 = pl1.next;
        	pl2 = pl2.next;
        	}else if(pl1.val+pl2.val+carry >= 10){
        		ListNode newNode = new ListNode(pl1.val+pl2.val+carry-10);
        		carry = 1;
        		newNode.next = null;
            	pre.next = newNode;
            	pre = pre.next;
            	pl1 = pl1.next;
            	pl2 = pl2.next;
        	}
        }
        if( pl1 == null && pl2 != null) {
        	while(pl2 != null) {
        		if(pl2.val+carry < 10) {
        			ListNode newNode = new ListNode(pl2.val+carry);
        			carry = 0;
                	newNode.next = null;
                	pre.next = newNode;
                	pre = pre.next;
                	pl2 = pl2.next;
        		}else {
        			ListNode newNode = new ListNode(pl2.val+carry-10);
        			carry = 1;
                	newNode.next = null;
                	pre.next = newNode;
                	pre = pre.next;
                	pl2 = pl2.next;
        		}
        		if(pl2 == null && carry ==1 ) {
        			pre.next = new ListNode(1); 
        		}
        	}
        		
        }else if(pl2 == null && pl1 != null) {
        	while(pl1 != null) {
        		if(pl1.val+carry < 10) {
        			ListNode newNode = new ListNode(pl1.val+carry);
        			carry = 0;
                	newNode.next = null;
                	pre.next = newNode;
                	pre = pre.next;
                	pl1 = pl1.next;
        		} else {
        			ListNode newNode = new ListNode(pl1.val+carry-10);
        			carry = 1;
                	newNode.next = null;
                	pre.next = newNode;
                	pre = pre.next;
                	pl1 = pl1.next;
        		}
        		if(pl1 == null && carry ==1 ) {
        			pre.next = new ListNode(1); 
        		}
        	}
        }else if(pl1 == null && pl2 == null) {
        	if(carry == 1)
        		pre.next = new ListNode(1);
        }
        return Head.next;	//为了符合题意，这里不返回头指针
    }
}
