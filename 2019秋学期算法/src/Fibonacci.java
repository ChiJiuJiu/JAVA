import java.math.BigInteger;

/**
 * 第一周算法练习-斐波那契数列
 * 2019-09-01
 * 
 * @author 赵宜珺
 *
 */
public class Fibonacci {

    /**
     * 递归
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
     * 非递归
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
        // 计算出n 为 2,8,16,32,64,128,512,1024 时 F(n)的值
        int[] num = new int[8];
        num[0] = 2;
        num[1] = 8;
        for (int i = 2; i < num.length; i++) {
            num[i] = 2 * num[i - 1];
        }
        num[6] = 512;
        num[7] = 1024;

        long start = 0L, end = 0L;
        // 非递归
        System.out.println("非递归");
        for (int i = 0; i < num.length; i++) {

            start = System.nanoTime();

            System.out.print("F[" + num[i] + "] = " + unrecursive(num[i]) + " ");

            end = System.nanoTime();

            System.out.println("time：" + (end - start) + "ns");
        }

        // 递归
        System.out.println("递归");
        for (int i = 0; i < num.length; i++) {

            start = System.nanoTime();

            System.out.print("F[" + num[i] + "] = " + recursive(num[i]) + " ");

            end = System.nanoTime();

            System.out.println("time：" + (end - start) + "ns");

        }
    }

}

// 以下code无效
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
// int preResult = 1; // n - 2项
// int currentResult = 1; // n - 1项
// for (int i = 3; i <= n; i++) {
// result = preResult + currentResult; // n = f(n-1) + f(n-2)
// preResult = currentResult; // f(n-2) = f(n-1)
// currentResult = result; // f(n-1) = n
// }
// return result;
// }
//
/// **
// * 位数不足高位补0
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
// * 对数字字符串做格式处理，不足位用0补齐
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
// * 加法
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
// int[] res = new int[n + 1];// 可能产生进位
// int num1 = 0, num2 = 0, num = 0;
//
// // 从最低位开始逐位相加
// for (int i = n - 1; i >= 0; i--) {
// num1 = Integer.parseInt(a.substring(i, i + 1));
// num2 = Integer.parseInt(b.substring(i, i + 1));
// // 该位数值的和，可能会产生进位; 该和有两部分组成
// num = num1 + num2;// 部分一，本位数字求和
// num += res[i + 1];// 部分二，本位数字求和在加上进位值。
//
// res[i + 1] = (num % 10);// 本位
// res[i] = num / 10;// 上一位
//
// }
//
// return arrayToString(res);
// }
//
/// **
// * 减法，且保证结果不会为负
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
// // 从最低位开始减
// for (int i = n - 1; i >= 0; i--) {
// num1 = Integer.parseInt(a.substring(i, i + 1));
// num2 = Integer.parseInt(b.substring(i, i + 1));
// // 本位数字求差
// num = num1 - num2;
// if (num >= 0) {
// res[i] = num;
// } else {
// // 需要借位
// // 借1
// num += 10;
// res[i] = num;
// // 前一位-1
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
