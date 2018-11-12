package ys.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass2 {

	public MainClass2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		FileInputStream fils = null;
		FileOutputStream fos = null;
		try {
			fils = new FileInputStream("key.txt");
			fos = new FileOutputStream("byte.txt");
			
			int readCount =  -1;
			byte[] buffer = new byte[512]; // 운영체제는 1바이트씩 읽어 오라고 해도 512 바이트씩 읽어 오기에 , 1바이트 씩읽어오라고 명령하면 나머지 
			// 511 바이트는 버리게 된다 그렇기에 , 파일을 바이트 단위로 읽고 쓸때는 그냥 512 바이트씩 byte[512] 배열에 다가 써서 읽고 쓰는게 좋다
			while((readCount = fils.read(buffer)) != -1) {
				//한 바이트 씩 읽기
				fos.write(buffer,0,readCount);
				System.out.println(buffer);
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
