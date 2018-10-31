import java.util.Scanner;

public class Main {
	public static void fun(long num) {
		int[] bi = new int[32];
		int cnt = 31;
		while(num > 0) {
			bi[cnt--] = (int) (num % 2);
			num /= 2;
		}
		System.out.println(cnt+1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		fun(in.nextLong());

	}

}
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int number = 0;// 一个整数，在32位的整数可以表达的范围内。
        int wei = 32;// 32位的计算机
        String result = null;// 字符串
 
        number = sc.nextInt();// 输入
 
        result = Integer.toBinaryString(number);// Returns a string representation of the integer argument as an unsigned integer in base 2.
 
        if (number != 0) {// 一个整数，表达输入被表达为一个32位的二进制数时，在第一个1之前的0的数量。
            System.out.println(wei - result.length());
        } else {
            System.out.println(wei);
        }
    }
} */