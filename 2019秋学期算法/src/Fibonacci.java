import java.math.BigInteger;

/**
 * ��һ���㷨��ϰ-쳲���������
 * 2019-09-01
 * 
 * @author ���ˬB
 *
 */
public class Fibonacci {

    /**
     * �ݹ�
     * 
     * @param n
     * @return
     */
    public static BigInteger recursive(int n) {
        if (n == 0 || n == 1)
            return BigInteger.valueOf(n);
        return recursive(n - 1).add(recursive(n - 2));
    }

    /**
     * �ǵݹ�
     * 
     * @param n
     * @return
     */
    public static BigInteger unrecursive(int n) {
        if (n == 0 || n == 1)
            return BigInteger.valueOf(n);
        if (n == 2)
            return new BigInteger("1");
        BigInteger f1 = new BigInteger("0");
        BigInteger f2 = new BigInteger("1");
        BigInteger f3 = new BigInteger("0");
        for (int i = 2; i <= n; i++) {
            f3 = f1.add(f2);
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        // �����n Ϊ 2,8,16,32,64,128,512,1024 ʱ F(n)��ֵ
        int[] num = new int[8];
        num[0] = 2;
        num[1] = 8;
        for (int i = 2; i < num.length; i++) {
            num[i] = 2 * num[i - 1];
        }
        num[6] = 512;
        num[7] = 1024;

        long start = 0L, end = 0L;
        // �ǵݹ�
        System.out.println("�ǵݹ�");
        for (int i = 0; i < num.length; i++) {

            start = System.nanoTime();

            System.out.print("F[" + num[i] + "] = " + unrecursive(num[i]) + " ");

            end = System.nanoTime();

            System.out.println("time��" + (end - start) + "ns");
        }

        // �ݹ�
        System.out.println("�ݹ�");
        for (int i = 0; i < num.length; i++) {

            start = System.nanoTime();

            System.out.print("F[" + num[i] + "] = " + recursive(num[i]) + " ");

            end = System.nanoTime();

            System.out.println("time��" + (end - start) + "ns");

        }
    }

}

// ����code��Ч
//public static final String ONE = "1";
//public static final String TWO = "2";
// public static int fibonacci(int n) {
// if (n < 1) {
// return 0;
// }
//
// if (n == 1 || n == 2) {
// return 1;
// }
//
// int result = 1;
// int preResult = 1; // n - 2��
// int currentResult = 1; // n - 1��
// for (int i = 3; i <= n; i++) {
// result = preResult + currentResult; // n = f(n-1) + f(n-2)
// preResult = currentResult; // f(n-2) = f(n-1)
// currentResult = result; // f(n-1) = n
// }
// return result;
// }
//
/// **
// * λ�������λ��0
// *
// * @param str
// * @param n
// * @param partten
// * @return
// */
// public static String doFormat(String str, int n, int partten) {
// String newStr = "";
// for (int i = 0; i < n - str.length(); i++) {
// newStr += "0";
// }
// return newStr + str;
// }
//
/// **
// * �������ַ�������ʽ��������λ��0����
// *
// * @param a
// * @param b
// * @return
// */
// public static String[] prepare(String a, String b) {
// String[] strs = new String[2];
// for (int i = 0; i < 2; i++) {
// strs[i] = "";
// }
// if (a.length() > b.length())
// b = doFormat(b, a.length(), 0);
// else if (a.length() < b.length())
// a = doFormat(a, b.length(), 0);
// strs[0] = a;
// strs[1] = b;
// return strs;
// }
//
/// **
// * �ӷ�
// *
// * @param a
// * @param b
// * @return
// */
// public static String add(String a, String b) {
// String[] strs = prepare(a, b);
// a = strs[0];
// b = strs[1];
//
// int n = a.length();
// int[] res = new int[n + 1];// ���ܲ�����λ
// int num1 = 0, num2 = 0, num = 0;
//
// // �����λ��ʼ��λ���
// for (int i = n - 1; i >= 0; i--) {
// num1 = Integer.parseInt(a.substring(i, i + 1));
// num2 = Integer.parseInt(b.substring(i, i + 1));
// // ��λ��ֵ�ĺͣ����ܻ������λ; �ú������������
// num = num1 + num2;// ����һ����λ�������
// num += res[i + 1];// ���ֶ�����λ��������ڼ��Ͻ�λֵ��
//
// res[i + 1] = (num % 10);// ��λ
// res[i] = num / 10;// ��һλ
//
// }
//
// return arrayToString(res);
// }
//
/// **
// * �������ұ�֤�������Ϊ��
// *
// * @param a
// * @param b
// * @return
// */
// public static int[] minus(String a, String b) {
// String[] strs = prepare(a, b);
// a = strs[0];
// b = strs[1];
//
// int n = a.length();
// int[] res = new int[n];
// int num1 = 0, num2 = 0, num = 0;
// // �����λ��ʼ��
// for (int i = n - 1; i >= 0; i--) {
// num1 = Integer.parseInt(a.substring(i, i + 1));
// num2 = Integer.parseInt(b.substring(i, i + 1));
// // ��λ�������
// num = num1 - num2;
// if (num >= 0) {
// res[i] = num;
// } else {
// // ��Ҫ��λ
// // ��1
// num += 10;
// res[i] = num;
// // ǰһλ-1
// StringBuilder sb = new StringBuilder(a);
// sb.replace(i - 1, i, (Integer.parseInt(a.substring(i - 1, i)) - 1) + "");
// }
//
// }
//
// return res;
// }

// public static String recursive(String n) {
// if (n.length() == 1 && (n.equals("0") || n.equals("1"))) {
// return n;
// }
// return add(recursive(arrayToString(minus(n, ONE))), recursive(arrayToString(minus(n, TWO))));
// }
//
// public static String arrayToString(int[] n) {
// String res = "";
// for (int i = 0; i < n.length; i++) {
// res += n[i];
// }
// return res;
// }
//
// public static int fibonacciRecursion(int n) {
// if (n < 1) {
// return 0;
// }
//
// if (n == 1 || n == 2) {
// return 1;
// }
//
// return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
// }
