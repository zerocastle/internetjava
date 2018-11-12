package ys.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class MainClass4 {
	
	public MainClass4() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try(
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt"))
				){
			int i = in.readInt();
			boolean b = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
