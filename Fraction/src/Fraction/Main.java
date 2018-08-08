package Fraction;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}
class Fraction {
	double number;
	int den,mol;
	Fraction(int a,int b){
		mol = a;
		den = b;
		number = a/b;
	}
	void print() {
		int a1=mol,a2=den;
		int ret = 0;
		for(;a2!=0;) {
			ret = a1%a2;
			a1 = a2;
			a2 = ret;
		}
		if(mol/a1==1&&den/a1==1)
			System.out.println(1);
		else 
			System.out.println((mol/a1)+"/"+(den/a1));
	}
	double toDouble() {
		return number;
	}
	Fraction plus(Fraction r) {
		int a11 = den,a22 = r.den;
		int ret2 = 0;
		for(;a22!=0;) {
			ret2 = a11%a22;
			a11 = a22;
			a22 = ret2;
		}
		int LCM = (den*r.den)/a11;
		Fraction result = new Fraction((LCM/den)*mol+(LCM/r.den)*r.mol,LCM);
		return result;
	}
	Fraction multiply(Fraction r) {
		Fraction result2 = new Fraction(mol * r.mol,den * r.den);
		return result2;
	}
}