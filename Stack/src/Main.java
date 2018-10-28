
public class Main {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.Create(10);
		s.push(1);
		s.push(2);
		System.out.println(s.getSize());
	}

}
class Stack{
	int top = -1;
	static int[] Date;
	void Create(int size) {
		Date = new int[size];
	}
	public void push(int x) {
		Date[++top] = x;
	}
	public int pop(int x) {
		return Date[top--];
	}
	int getSize() {
		return top + 1;
	}
}