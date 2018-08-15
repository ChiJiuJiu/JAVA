package database;

public class Item {
	private String title;		// or use protected type
	private int playingTime;
	private boolean gotIt = false;
	private String comment;

	
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		//super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}
	public void print() {
//		System.out.println("Item");
		System.out.print(title);
	}
	public  Item() {
		
	}

}
