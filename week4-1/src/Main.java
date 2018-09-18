import java.util.Scanner;

public class Main {
	public static boolean isPrime(int x) {
		boolean ret = true;
		if(x==2||x==0||x==1)	ret = true;	
		else {
			for(int i=2; i<x; i++) {
				if(x%i == 0) {
					ret = false;
					break;
				}
		}
	}
		return ret;
}
	public static int Prime(int n,int m) {
		int cntn = 0,cntm = 0;
		int markn = 0,markm = 0;
		int sum = 0;
		for(int i = 2; cntn<n; i++) {
			if(isPrime(i))
				cntn++;
			markn = i;
		}
		cntm = cntn;
		for(int i = markn; cntm <= m; i++) {
			if(isPrime(i)) {
				cntm++;
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(Prime(in.nextInt(),in.nextInt()));
	}

}
