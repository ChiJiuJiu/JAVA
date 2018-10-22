import java.util.Scanner;

public class Main {
	public static boolean isPrime(int x) {
		if(x == 2 || x == 1 || x == 0)
			return true;
		int i;
		for(i = 2; i < x; i++) {
			if(x % i == 0)
				return false;
		}
		return true;
	}
	public static int firstNum(int x) {
		int i;
		for(i = 2; i <= x; i++) {
			if(x % i == 0 && isPrime(i) )
				return i;
		}
		return 1;
	}
	public static void Solution(int x) {
		if(isPrime(x)) {
			System.out.print(x);
			return;
		}
		int val = x;
		int firstPrime = 1;
		int cnt = 0;
		while(val > 1) {
			firstPrime = firstNum(val);
			if(cnt > 0)
				System.out.print("x"+firstPrime);
			else
				System.out.print(firstPrime);
			val /= firstPrime;
			cnt++;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.print(x+"=");
		Solution(x);
	}

}
