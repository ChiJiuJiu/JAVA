package maxsum;

import java.util.Scanner;

public class MaxSum {
	public static int Sum(int []num) {
		int nsum = num[1];
		for(int i = 1; i<num.length; i++) {
			if(num[i-1] >= 0)
				num[i] += num[i-1];
			else 
				num[i] += 0;
			if(num[i] > nsum)
				nsum = num[i]; 
		}
		return nsum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the length of array:");
		int[] num = new int[in.nextInt()+1];
		num[0] = 0;
		for(int i = 1; i<num.length; i++) {
			num[i] = in.nextInt();
		}
		System.out.println("MaxSum = "+Sum(num));
	}

}
