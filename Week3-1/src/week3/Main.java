package week3;

import java.util.Scanner;

public class Main {
	public static void Num() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int odd = 0,even = 0;
		while(n != -1) {
			if(n%2 == 0)
				even++;
			else
				odd++;
		n = in.nextInt();
		}
		System.out.println(odd+" "+even);
	}
	public static void main(String[] args) {
		Num();
	}

}
