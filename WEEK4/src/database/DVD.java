package database;

public class DVD extends Item{
//	private String title;
	private String director;
//	private int playingTime;
//	private boolean gotIt = false;
//	private String comment;
	public static void main(String[] args) {
		

	}
	public void print() {
		System.out.print("DVD:");
		super.print();
		System.out.println(","+director);
	}
	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment);
//		this.title = title;
		this.director = director;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

}
