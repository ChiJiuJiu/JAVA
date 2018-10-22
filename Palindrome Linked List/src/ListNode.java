import org.omg.CORBA.PUBLIC_MEMBER;

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
	public static void main(String[] args) {
		

	}

}
class Solution {
    public static boolean isPalindrome(ListNode head) {
        ListNode p = head;
        if(head == null)
        	return true;
        int len = lenOfList(head);
        int[] check = new int[len];
        int i = 0;
        while(p != null) {
        	check[i++] = p.val;
        	p = p.next;
        }
        for(i = 0; i < len; i++) {
        	if(check[i] != check[len - i - 1])
        		return false;
        }
        return true;
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