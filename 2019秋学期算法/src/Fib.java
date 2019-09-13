import java.math.BigInteger;

/**
 * 实验一
 * 
 * @author 陆冯莉
 *
 */
public class Fib {

    // 递归方法
    public static BigInteger fun_1(int num) {
        if (num == 0)
            return BigInteger.valueOf(0);
        if (num == 1)
            return BigInteger.valueOf(1);
        return fun_1(num - 1).add(fun_1(num - 2));
    }

    // 非递归方法
    public static BigInteger fun_2(int num) {
        if (num == 0)
            return BigInteger.valueOf(0);
        if (num == 1 || num == 2)
            return BigInteger.valueOf(1);
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger num3 = BigInteger.valueOf(0);
        for (int i = 2; i <= num; i++) {
            num3 = num1.add(num2);
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 8, 16, 32, 64, 128, 512, 1024};
        long[] time = new long[8];
        long begin = 0; // 用于计算耗时
        System.out.println("非递归方法：");
        for (int i = 0; i < numbers.length; i++) {
            begin = System.nanoTime(); // 采用纳秒计时
            BigInteger result = fun_2(numbers[i]);
            System.out.println("f(" + numbers[i] + ")=" + result);
            time[i] = System.nanoTime() - begin;
        }
        System.out.println("非递归方法耗时：");
        for (int i = 0; i < time.length; i++) {
            System.out.print(time[i] + "ns ");
        }
        System.out.println();
        System.out.println("递归方法：");
        for (int i = 0; i < numbers.length; i++) {
            begin = System.nanoTime();
            BigInteger result = fun_1(numbers[i]);
            time[i] = System.nanoTime() - begin;
            System.out.println("f(" + numbers[i] + ")=" + result + " 耗时：" + time[i]);

        }

    }

}
