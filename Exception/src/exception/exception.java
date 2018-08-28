package exception;

import java.util.Scanner;

class OpenException extends Throwable {
	
}

class CloseException extends OpenException {
	
}
public class exception {

	public static void f() {
		int [] a = new int [10];
		a[10] = 10;
		System.out.println("hello");
	}
	public static void h() {
		f();
	}
	
	public static void j() {
		int i = 10;
		if(i < 100) {
			h();
		}
	}
	
	public static void k() {
		try {
			j();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("k()");
			//throw e;
		}
	}
	
	public static int open() {
		int [] a = new int [10];
		a[10] = 10;
		return -1;
	}
	
	public static void readFile() throws OpenException,CloseException {
		if( open() == -1)
			throw new CloseException();
	}
	public static void main(String[] args) {
//		int [] a = new int [10];
//		Scanner in = new Scanner(System.in);
//		int idx = in.nextInt();
//		try {
//			a[idx] = 10;
//			System.out.println("a["+idx+"]"+" = 10");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Catch");
//	}
//		try {
//			k();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("catch");
//		}
//		System.out.println("main");
		try {
			readFile();
		}catch (CloseException e) {
			System.out.println("close");
		} catch (OpenException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("anything");
		}
	}
}
