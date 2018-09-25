package array;

import java.util.Scanner;

public class YHTriangle {
	public static void YH(int n) {
		int [][] yh = new int [2*n-1][2*n-1];
		int i,j,k;
			for(j = 0; j<n; j++) {
				for(k=0; k<2*j+1; k++) {
					if(k==0) yh[j][k] = 1;
					else {
						if(j>=k)
							yh[j][k] = yh[j][k-1]+1;
						else if(j<k)
							yh[j][k] = yh[j][k-1]-1;
					}
				}
			}
		for(j = 0; j<n; j++) {
			for(int m = 0; m<n-j; m++) 
				System.out.print(" ");
			for(k = 0; k<2*j+1; k++) {
				System.out.print(yh[j][k]);
				if(k==2*j)
				System.out.println();
				}
			}
				
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input n:");
		YH(in.nextInt());
	}

}
