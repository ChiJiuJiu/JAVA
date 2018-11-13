import java.util.*;
public class Jiecheng2{
	public static void main (String[] arg) {
		Scanner S=new Scanner(System.in);
		System.out.println("please input a:");
		int a=S.nextInt();
		long sum=1;
		for(int i=1;i<=a;i++)
		   { sum=sum*i;}
		System.out.println(a+"!"+"="+sum);
	}
	
}
