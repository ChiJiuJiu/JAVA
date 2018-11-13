import java.util.Scanner;

public class Sushu {
	public static boolean isPrime(int x) {
		if(x == 0 || x == 1)
			return false;
		if(x == 2)
			return true;
		boolean isprime = true;
		for(int i = 2; i < x; i++) {
			if(x % i == 0) {
				isprime = false;
				break;
			}
		}
			return isprime;
	}
	public static void Prime(int m,int n) {
		System.out.println(m + "-" + n +"的素数有:");
		for(int i = m; i <= n; i++) {
			if(isPrime(i))
				System.out.print(i + " ");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("请输入查找区间:");
		Scanner in = new Scanner(System.in);
		Prime(in.nextInt(), in.nextInt());
	}
}
