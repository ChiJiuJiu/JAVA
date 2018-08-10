package Clock;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}

class Display {
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
	public void Initialize(int value) {
		this.value = value;
	}
}

class Clock {
	
	Display hour = new Display(24);
	Display minute = new Display(60);
	Display second = new Display(60);
	
	public Clock(int hour,int minute,int second) {
		this.hour.Initialize(hour);
		this.minute.Initialize(minute);
		this.second.Initialize(second);
	}
	
	public void tick() {
		this.second.increase();
		if(this.second.Getvalue() == 0) {
			this.minute.increase();
			if(this.minute.Getvalue() == 0) {
				this.hour.increase();
			}
		}
			
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d",this.hour.Getvalue(),this.minute.Getvalue(),this.second.Getvalue());
	}
}