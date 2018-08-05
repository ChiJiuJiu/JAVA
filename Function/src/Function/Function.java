package Function;

import java.util.Scanner;

public class Function {
	public static void  InsertSort(int []A) {
		int temp=0;
		int j=0,i=0;
		for(i=1;i<A.length;i++) {
			temp=A[i];
			for(j=i;temp<A[j-1]&&j>0;j--)
				A[j]=A[j-1];
			A[j]=temp;
		}
	}
//	public static void function(int a,int b) {
//		a=1;
//		b=2;
//	}
	public static void Test(int []B) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int []A = new int [5];
//		for(int i=0;i<5;i++) {
//			A[i]=(int)(Math.random()*100+1);
//			System.out.print(A[i]+" ");
//		}
//		InsertSort(A);
//		System.out.println();
//		for(int k:A)
//			System.out.print(k+" ");
//		int a=100,b=200;
//		System.out.println("a = "+a+" b = "+b);
//		function(a, b);
//		System.out.println("a = "+a+" b = "+b);
//		{
//			int h=0;
//			System.out.println(h);
//		}
//		int h=100;
//		System.out.println(h);
	}

}
