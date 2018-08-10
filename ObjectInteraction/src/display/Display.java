package display;

public class Display {
	private int limit = 0 ;
	private int value = 0 ;
	public Display(int limit) {
		this.limit = limit;
	}
	public void increase() {
		value++;
		if(value == limit)
			value = 0;
	}
	public int Getvalue() {
		return value;
	}
	public static void main(String[] args) {
		Display d = new Display(24);
		while(true) {
			d.increase();
			System.out.println(d.Getvalue());
		}
	}
}
