package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class stream {

	public static void main(String[] args) {			//过滤
		try {
//			DataOutputStream out = new DataOutputStream(		//二进制
//					new BufferedOutputStream(
//							new FileOutputStream("a.dat")));
			PrintWriter pw = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream("b.txt"))));
			int i = 123456;
			pw.println(i);
			pw.close();
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("src/stream/stream.java")));
			
			String line;									//读文件方法
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
//			out.writeInt(i);
//			out.close();
//			DataInputStream in = new DataInputStream(
//					new BufferedInputStream(
//							new FileInputStream("a.dat")));
//			int j = in.readInt();
//			System.out.println(j);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
