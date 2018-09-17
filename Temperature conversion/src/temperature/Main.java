package temperature;

import java.util.Scanner;

public class Main {
	public static int fun(int f) {
		return (int)((f-32)/1.8);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(fun(in.nextInt()));
	}

}
