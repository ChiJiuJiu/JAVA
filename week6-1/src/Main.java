import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mark = 0;
		ArrayList<String> Words= new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String s = "";
		do {
			s = in.next();
			if((s.substring(s.length()-1)).equals(".")) {
				Words.add(s.substring(0, s.length()-1));
			}
			else
				Words.add(s);
		}while(!((s.substring(s.length()-1)).equals(".")));
		for(String k : Words) {
			if(mark != 0)
				System.out.print(" ");
			System.out.print(k.length());
			mark = 1;
		}
	}

}
