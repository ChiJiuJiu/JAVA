package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
//		System.out.println("2+3="+5);
//		System.out.println("2+3="+"5");
//		System.out.println("2+3="+2+3);
//		System.out.println("2+3="+"2+3");
//		System.out.println("2+3="+(2+3));
//		System.out.println("2+3="+"(2+3)");
		//int price;
		//final int amount=100;
		int money=0;
		System.out.print("Input money:");
		money = in.nextInt();
		System.out.print("Input price:");
		int price = in.nextInt();
		System.out.println(money+"-"+price+"="+(money-price));
	}

}
