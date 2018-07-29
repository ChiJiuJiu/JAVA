package Circulate2;

import java.util.Scanner;


public class Circulate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		//int i=1;
//		int factor=1;
//		for(int i=1;i<=n;i++) {
//			factor*=i;
//		}
//		System.out.println(factor);
//		int flag=0;
//		for(int i=2;i<=n;i++) {
//			for(int j=2;j<i;j++) {
//				if(i%j==0) {
//					flag=1;
//					break;
//				}
//			}
//			if(flag==0)
//				System.out.println(i+" is a prime");
//			flag=0;
//		}
//		int cnt=0;
//		boolean flag=false;
//		for(int i=2;cnt<10;i++) {
//			for(int j=2;j<i;j++) {
//				if(i%j==0) {
//					flag=true;
//					break;
//				}
//			}
//			if(!flag) {
//				System.out.println(i+" is a prime");
//				cnt++;
//			}	
//			flag=false;
//		}
//		System.out.println("cnt="+cnt);
		int a=in.nextInt();
		int b=in.nextInt();
		int tmpa=a,tmpb=b;
		int r=0;
		for(;b!=0;) {
			r=a%b;
			a=b;
			b=r;
		}
		System.out.println("最大公约数:"+a);
		System.out.println("最小公倍数:"+(tmpa*tmpb/a));
	}
}
