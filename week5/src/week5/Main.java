package week5;

import java.util.Scanner;

public class Main {
	public static void Polynomial(int []arrary,int index,int mod) {
		arrary[index] += mod;
	}
	public static void insert(int []arrary) {
		Scanner in = new Scanner(System.in);
		int index = 0,mod = 0;
		do {
			index = in.nextInt();
			mod = in.nextInt();
			Polynomial(arrary, index, mod);
		}while(index != 0);
	}
	public static void Show(int []arrary) {
		int index = 0,mod = 0;
		int cnt = 0;
		for(int i = 100; i>=0; i--) {
			index = i;
			mod = arrary[i];
			if(mod != 0) {
				if(cnt>0)
					System.out.print("+");
				if(index == 0||index == 1) {
					if(index == 1)
						System.out.print(mod+"x");
					else if(index == 0)
						System.out.print(mod);
				}	
				else
					System.out.print(mod+"x"+index);
				cnt++;
			}
		}
	}
	public static void main(String[] args) {
		int []arrary = new int [101];
		insert(arrary);
		insert(arrary);
		Show(arrary);
	}

}
