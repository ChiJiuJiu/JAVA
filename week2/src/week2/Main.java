package week2;

import java.util.Scanner;

public class Main {
	public static int fun(int BJT) {
		int UTC = 0;
		if(BJT - 800 < 0 ) {
			UTC = 2400 + (BJT - 800);
		}else {
			UTC = BJT - 800;
		}
		return UTC;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(fun(in.nextInt()));
	}

}
