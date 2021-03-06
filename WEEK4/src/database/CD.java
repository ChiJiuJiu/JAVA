package database;

public class CD extends Item{
//	private String title;
	private String artist;
	private int numofTracks;
//	private int playingTime;
//	private boolean gotIt = false;
//	private String comment;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title,playingTime,false,comment);
//		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD) obj;
		return artist.equals(cc.artist);
	}

	public static void main(String[] args) {		//子类无print，则继承父类
		CD cd= new CD("123", "321", 1, 2, "...");
		CD cd1= new CD("123", "321", 1, 2, "...");
		System.out.println(cd.equals(cd1));
//		cd.print();

	}

	public void print() {
		System.out.print("CD:");
		super.print();
		System.out.println(","+artist);
	}

}
