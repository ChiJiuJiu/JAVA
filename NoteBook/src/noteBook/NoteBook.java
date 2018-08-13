package noteBook;

import java.util.ArrayList;
import java.util.HashSet;


class value {
	private int i;
	public void set(int i) {
		this.i = i;
	}
	public int getvalue() {
		return i;
	}
	public String toString() {
		return ""+i;
	}
}
public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();	//容器类
	public void add (String S) {
		notes.add(S);
	}
	public void add (int location , String S) {
		notes.add(location, S);
	}
	
	public	int GetSize() {
		return notes.size();
	}
	
	public String GetNote(int index) {
		return notes.get(index);
	}
	
	public void remove(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String []a = new String[notes.size()];
//		for ( int i = 0; i < notes.size(); i++ ) {
//			a[i] = notes.get(i);
////			a[i] = GetNote(i);
//		}
		notes.toArray(a);
		return a;
	}
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
//		nb.add("1123");
//		nb.add("2");
//		System.out.println(nb.GetNote(0));
		nb.add(0,"456");
		nb.add(1,"zhao");
		nb.add(1, "asdas");
//		System.out.println(nb.GetSize());
//		System.out.println(nb.GetNote(0));
//		System.out.println(nb.GetNote(1));
//		System.out.println(nb.GetNote(2));
//		nb.remove(0);
//		System.out.println(nb.GetSize());
//		System.out.println(nb.GetNote(0));
//		System.out.println(nb.GetNote(1));
//		String []a = nb.list();
//		for( String S  : a) {
//			System.out.print(S+" ");
//		}
//		String []b = new String[10];
//		System.out.println("\n"+b[0]);
//		b[0] = "123"+0;
//		System.out.println(b[0]);
//		System.out.println(b[0].length());
		value [] v = new value[10];
		for(int i = 0; i<v.length; i++) {
			v[i] = new value();
			v[i].set(i);
		}
		for(value k : v) {
			System.out.print(k.getvalue()+" ");
			k.set((v.length - k.getvalue() - 1));
		}
		System.out.println();
		for(value k : v) {
			System.out.print(k.getvalue()+" ");
		}
		ArrayList<String> c = new ArrayList<String>();
		c.add(0,"zhao");
		c.add(1,"jun");
		c.add(1,"yi");
		System.out.println();
		for(String S : c) {
			System.out.print(S+" ");
		}
		System.out.println(c);
		System.out.println("\n---------------");
		HashSet<String> d = new HashSet<String>();	//集合，无重复元素
		d.add("second");
		d.add("first");
		d.add("first");
//		System.out.println(d);
//		System.out.println(v[0]);
		for(String k : d) {
			System.out.println(k);
		}
	}

}
