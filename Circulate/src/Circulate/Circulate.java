package Circulate;
import java.util.Scanner;
public class Circulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int price=10;
//		int balance=0;
//		while(true) {
//			System.out.print("��Ͷ��:");
//			int money=in.nextInt();
//			balance+=money;
//			if(balance>=10) {
//			System.out.println("********************");
//			System.out.println("Ʊ��:10");
//			System.out.println("********************");
//			System.out.println("����:"+(balance-price));
//			balance=0;
//			}else {
//				System.out.println("����,����Ҫ"+(price-balance)+"Ԫ");
//			}		
//		}
		int x=0,cnt=0,sum=0;
//		x=in.nextInt();
//		do {
//			cnt++;
//			x/=10;
//		}while(x!=0);
//		System.out.println(cnt+"λ��");
//		x=in.nextInt();
//		while(x!=-1) {
//			sum+=x;
//			cnt++;
//			x=in.nextInt();
//		}
//		if(cnt>0)
//			System.out.println((sum/cnt));
//		else
//			System.out.println("None");
//		do {
//			x=in.nextInt();
//			if(x==-1)
//				break;
//			sum+=x;
//			cnt++;
//		}while(true);
//		if(cnt>0)
//			System.out.println((sum/cnt));
//		else
//			System.out.println("None");
//	int num=(int)(Math.random()*100+1);
//	System.out.println("�����Ϊ��"+num);
//	int a=0;
//	int count=0;
//	a=in.nextInt();
//	while(a!=num){
//		count++;
//		if(a>num)
//			System.out.println("�´���");
//		else
//			System.out.println("��С��");
//		a=in.nextInt();
//		}
//	System.out.println("�¶���,һ������"+(count+1)+"��");
		int number=in.nextInt();
		int result=0,digit=0;
		do {
			digit=number%10;
			result=result*10+digit;
			number/=10;
		}while(number>0);
		System.out.println(result);
		int number2=in.nextInt();
		int judge=number2;
		int cnt2=0;
		int digit2=1;
		while(judge>0) {
			cnt2++;
			judge/=10;
		}
		while(cnt2>1) {
			digit2*=10;
			cnt2--;
		}
		while(digit2>0) {
			System.out.print((number2/digit2));
			number2%=digit2;
			digit2/=10;
			if(digit2>0)
				System.out.print(" ");
		}
	}
}
