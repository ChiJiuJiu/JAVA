package stream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class stream2 {

	public static void main(String[] args) {
		student s1 = new student("xiaozhao",20,1);
//		System.out.println(s1);
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("obj.dat"));
			out.writeObject(s1);
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("obj.dat"));
			System.out.println(in.readObject());
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class student implements Serializable{
	private String name;
	private int age;
	private int grade;
	public student(String name,int age,int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public String toString() {
		return name+" "+age+" "+grade;
	}
}