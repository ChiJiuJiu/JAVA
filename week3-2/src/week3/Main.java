package week3;

import java.util.Scanner;

public class Main {
	public static int lenOfNum(int num) {
		int len = 0;
		while(num != 0) {
			len++;
			num/=10;
		}
		return len;
	}
	public static int getNum(int num) {
		int len = lenOfNum(num);
		return (int) (num/(Math.pow(10.0, (double)(len-1))));
	}
	public static int calculate(int a,int b) {
		return (int)(Math.pow((double)a, (double)b));
	}
	public static int Eigenvalue(int num) {
		int val = 0;
		int len = 0;
		int firstnum = 0;
		int mark = 0;
		len = lenOfNum(num);
		for(int i = len; i>0; i--) {
			firstnum = getNum(num);
			if(i%2==0&&firstnum%2==0||i%2!=0&&firstnum%2!=0)
				mark = 1;
		val += calculate(2, i-1)*mark;
		num -= firstnum*calculate(10, i-1);
		mark = 0;
		}
		return val;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(Eigenvalue(in.nextInt()));
	}

}
