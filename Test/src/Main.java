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
 
        int number = 0;// һ����������32λ���������Ա��ķ�Χ�ڡ�
        int wei = 32;// 32λ�ļ����
        String result = null;// �ַ���
 
        number = sc.nextInt();// ����
 
        result = Integer.toBinaryString(number);// Returns a string representation of the integer argument as an unsigned integer in base 2.
 
        if (number != 0) {// һ��������������뱻���Ϊһ��32λ�Ķ�������ʱ���ڵ�һ��1֮ǰ��0��������
            System.out.println(wei - result.length());
        } else {
            System.out.println(wei);
        }
    }
} */