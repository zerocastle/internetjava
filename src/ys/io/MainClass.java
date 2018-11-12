package ys.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FileInputStream fils = null;
		FileOutputStream fos = null;
		try {
			fils = new FileInputStream("key.txt");
			fos = new FileOutputStream("byte.txt");
			
			int readData =  -1;
			while((readData = fils.read()) != -1) {
				//한 바이트 씩 읽기
				fos.write(readData);
				System.out.println(fos);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fils.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
