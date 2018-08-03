package Character;

import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		char c='\u0041';
//		char d=(char)(c+32);
//		System.out.println(c+" "+d);
//		System.out.println("\t123\n123''\n\'");
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Math.abs(1-2));
//		System.out.println(Math.round(10.5));
//		System.out.println((int)(Math.pow(2, 3)));
//		String s = new String("java!");
//		s=in.nextLine();
//		String ss;
//		ss=in.nextLine();
//		int a=10;
//		char b='3';
//		String sss = s+b+a;
//		System.out.println(s);
//		System.out.println(ss);
//		System.out.println(s.equals("123"));
//		int []a= {1,2,3,4,5,6};
//		for(int k:a)
//			System.out.println(a[k-1]+" k="+k);
		String s1=" 0123456783 ";
		String s2="abe";
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.length());
//		System.out.println(s1.charAt(0));
//		for(int i = 0;i < s1.length(); i++) {
//			System.out.println(s1.charAt(i));
//		}
//		System.out.println(s1.substring(0, 3)+s1.substring(3));
//		int loc = s1.indexOf('3');
//		System.out.println(s1.indexOf('3',loc+1));
		System.out.println(s1.startsWith("0"));
		System.out.println(s1.endsWith("3"));
		s1=s1.trim();
		System.out.println(s1.startsWith("0"));
		System.out.println(s1.endsWith("3"));
		System.out.println(s1);
		s1=s1.replace('3', 'A');
		System.out.println(s1);
		s1=s1.toLowerCase();
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);
	}

}
