import java.util.*;
public class Compare{
	static int getmax(int[] a){
		int max = a[0];
		for(int i=0;i<3;i++) {
			if(max < a[i])
				max = a[i];
		}
		return max;
	}
	static int getmin(int[] a){
		int min = a[0];
		for(int i=0;i<3;i++) {
			if(min > a[i])
				min = a[i];
		}
		return min;
	}		
	public static void main(String[] arg) {
		Scanner S=new Scanner(System.in);
		int [] a = new int[3];
		for(int i=0;i<3;i++) {
          System.out.println("please input "+(i+1)+" numbers:");
          a[i]=S.nextInt();
		}
		System.out.println("max"+"="+getmax(a));	
		System.out.println("min"+"="+getmin(a));		
	
	}
}
