package Compare;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		System.out.print("«ÎÕ∂±“:");
//		int money=in.nextInt();
//		System.out.println(money>=10);
//		int price=10;
//		if(money>=10) {
//		System.out.println("********************");
//		System.out.println("∆±º€:10");
//		System.out.println("********************");
//		System.out.println("’“¡„:"+(money-price));
//		}else {
//			System.out.println("Ω∂Ó≤ªπª");
//		}		
//		double a=1.0;
//		double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
//		System.out.println(a==b);
//		System.out.println("a="+a+",b="+b);
//		System.out.println(Math.abs(a-b)<1e-6);
		int a,b,c;
		System.out.print("a=");
		a=in.nextInt();
		System.out.print("b=");
		b=in.nextInt();
		System.out.print("c=");
		c=in.nextInt();
		if(a>=b) {
			if(a>=c)
				System.out.println("Max="+a);
		else 
			System.out.println("Max="+c);
	}else if(c<=b) 
		System.out.println("Max="+b);
	else 
		System.out.println("Max="+c);
	}
		}
