package distance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class distance {
	private HashMap<String, Integer> distances= new HashMap<String,Integer>();
	private ArrayList<String> name = new ArrayList<String>();
	public void add(String s) {
		name.add(s);
	}
	public void make(String names,Integer far) {
		distances.put(names, far);
	}
	public int GetDistance(String names) {
		return distances.get(names);
	}
	public int GetSize() {
		return name.size();
	}
	public String rename(String s1,String s2) {
		return s1+s2;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		distance d = new distance();
		while(true) {
			String S = in.next();
			if(!S.equals("###"))
				d.add(S);
			else
				break;
		}
		int n = d.GetSize();
		for(int k = 0; k<n; k++) {
			for(int i = 0; i<n ;i++) {
				d.make(d.rename(d.name.get(k), d.name.get(i)),in.nextInt());
			}
		}
		System.out.println(d.GetDistance(in.next()+in.next()));
	}

}
