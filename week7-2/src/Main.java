import java.util.Scanner;

public class Main {
	public static boolean isPerfectNum(int x) {
		if(x == 1)
			return false;
		int val = x;
		int i;
		int sum = 0;
		for(i = 2; i < val; i++) {
			if(val % i == 0)
				sum += i;
		}
		return (sum + 1 == val);		
	}
	public static void printPerfectNum(int m, int n) {
		int i;
		int cnt = 0;
		for(i = m; i <= n; i++) {
			if(isPerfectNum(i)) {
				if(cnt == 0)
					System.out.print(i);
				else 
					System.out.print(" "+i);
				cnt++;
			}
			}
		if(cnt == 0) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		printPerfectNum(in.nextInt(), in.nextInt());
	}

}
