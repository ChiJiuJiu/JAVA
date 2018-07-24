import java.util.Scanner;
public class Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double foot,inch;
		Scanner in = new Scanner(System.in);
		System.out.print("Input Foot:");
		foot=in.nextDouble();
		System.out.print("Input Inch:");
		inch=in.nextDouble();
		System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");
	}

}
