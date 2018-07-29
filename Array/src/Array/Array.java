package Array;

import java.util.Scanner;

import javax.print.attribute.standard.Sides;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int [] numbers = new int [100];
//		int sum=0;
//		for(int i=0;i<10;i++) {
//			numbers[i]=in.nextInt();
//			sum+=numbers[i];
//		}
//		int average=0;
//		average=sum/10;
//		System.out.println("Average:"+average);
//		for(int i=0;i<10;i++) {
//			if(numbers[i]>average)
//				System.out.printf("numbers[%d]:%d ", i,numbers[i]);
//		}
//		int temp=0;
//		int numbers=in.nextInt();
//		int [] a=new int [numbers];
//		System.out.println("Previous:");
//		for(int i=0;i<a.length;i++) {
//			a[i]=(int)(Math.random()*100+1);
//			System.out.print(a[i]+" ");
//		}
//		for(int i=0;i<numbers;i++) {
//			for(int j=0;j<numbers-i-1;j++) {
//				if(a[j]>a[j+1]) {
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		int i=0,j=0;
//		for(int D=numbers;D>0;D/=2) {
//			for(i=D;i<numbers;i++) {
//				temp=a[i];
//			for(j=i;j>=D&&a[j-D]>temp;j-=D) {
//				a[j]=a[j-D];
//			}
//			a[j]=temp;
//			}
//		}
//		System.out.printf("\nCurrent:\n");
//		for(int k:a) {
//			System.out.print(k+" ");
//		}
//		
//		int []b=a;
//		System.out.println(b.length);
//		int n=in.nextInt();
//		int []primes=new int[n];
//		primes[0]=2;
//		int cnt=1;			//current prime's num and next prime's loc
//MAIN:		for(int x=3;cnt<n;x++) {
//			for(int i=0;i<cnt;i++) {
//				if(x%primes[i]==0) {
//					continue MAIN;
//				}
//			}
//			primes[cnt++]=x;
//		}
//		for(int k:primes)
//			System.out.print(k+" ");
//		System.out.println();
//		boolean [] isprime = new boolean [n];
//		for(int i=0;i<isprime.length;i++) {
//			isprime[i]=true;
//		}
//		for(int i=2;i<isprime.length;i++) {
//			if(isprime[i]) {
//				for(int k=2;i*k<isprime.length;k++) {
//					isprime[i*k]=false;
//				}
//			}
//		}
//		System.out.println(isprime.length);
//		for(int i=2;i<isprime.length;i++) {
//			if(isprime[i])
//				System.out.print(i+" ");
//		}
		final int SIZE = 3;
		int [][] board= new int[SIZE][SIZE];
		boolean result=false;
		int Xnum=0,Onum=0;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j]==1)
					Xnum++;
				else
					Onum++;
			}
			if(Onum==SIZE||Xnum==SIZE) {
				result=true;
				break;
			}
			Onum=Xnum=0;
		}
		if (!result) {
			Onum=Xnum=0;
			for(int j=0;j<SIZE;j++) {
				for(int i=0;i<SIZE;i++) {
					if(board[i][j]==1)
						Xnum++;
					else
						Onum++;
				}
				if(Onum==SIZE||Xnum==SIZE) {
					result=true;
					break;
				}
				Onum=Xnum=0;
			}
		}
		if(!result) {
			Onum=Xnum=0;
			for(int i=0;i<SIZE;i++) {
				if(board[i][i]==1)
					Xnum++;
				else
					Onum++;
			}
			if(Onum==SIZE||Xnum==SIZE) 
				result=true;	
		}
		if(!result) {
			Onum=Xnum=0;
			for(int i=0;i<SIZE;i++) {
				if(board[i][SIZE-i-1]==1)
					Xnum++;
				else
					Onum++;
			}
			if(Onum==SIZE||Xnum==SIZE) 
				result=true;
		}
		if(result) {
			if(Onum==SIZE)
				System.out.println("WINNER:O");
			else
				System.out.println("WINNER:X");
		}else
			System.out.println("NO WINNER");
	}

}
