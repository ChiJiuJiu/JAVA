package link;
import java.util.Scanner;

public class Link {
	public int data;
	public Link next;
	public Link(int data) {
		this.data = data;
	}
	public Link() {
		
	}
	public Link Create(Link Head) {
		Link node;
		Scanner in = new Scanner(System.in);
		int data = in.nextInt();
		while(data != -1) {
			node = new Link(data);
			node.next = Head.next;
			Head.next = node;
			data = in.nextInt();
		}
		return Head;
	}
	public static void Show(Link Head) {
		Link point = Head.next;
		while(point != null) {
			System.out.print(point.data+" ");
			point = point.next;
		}
	}
	public static void main(String[] args) {
		Link head = new Link();
		head = head.Create(head);
		Show(head);
	}

}
