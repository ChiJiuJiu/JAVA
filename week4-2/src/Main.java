import java.util.Scanner;

public class Main {
	public static int lenOfNum(int num) {
		int len = 0;
		while(num != 0) {
			len++;
			num/=10;
		}
		return len;
	}
	public static void SwitchNum(int num) {
		switch(num) {
		case 0:System.out.print("ling");break;
		case 1:System.out.print("yi");break;
		case 2:System.out.print("er");break;
		case 3:System.out.print("san");break;
		case 4:System.out.print("si");break;
		case 5:System.out.print("wu");break;
		case 6:System.out.print("liu");break;
		case 7:System.out.print("qi");break;
		case 8:System.out.print("ba");break;
		case 9:System.out.print("jiu");break;
		}
	}
	public static int calculate(int a,int b) {
		return (int)(Math.pow((double)a, (double)b));
	}
	public static int getNum(int num) {
		int len = lenOfNum(num);
		return (int) (num/(Math.pow(10.0, (double)(len-1))));
	}
	public static void ReadNum(int x) {
		int firstNum = 0;
		if(x < 0)
			System.out.print("fu ");
		x = Math.abs(x);
		int len = lenOfNum(x);
		for(int i = len; i>0; i--) {
			firstNum = getNum(x);
			SwitchNum(firstNum);
			if(i > 1)
				System.out.print(" ");
			x -=  firstNum*calculate(10, i-1);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ReadNum(in.nextInt());
	}

}
