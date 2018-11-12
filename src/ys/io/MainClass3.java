package ys.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class MainClass3 {
	
	/*
	 * try ~ resource , DataouputStream , DataInputSteram 이런것이 decoration pattern 이라는 것이다 
	 * 내가 사용하고 자하는 거에 맞추어 공구를 갈아 끼우듯이 맞춰서 사용하는 것이다. 그렇기에 어디다 쓸지에 대한것은 명확하게 지어줘야한다 .
	 * 그만큼 많은 메소드를 사용할수 있음 
	 */
	
	public MainClass3() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// int 형 100 , boolean형 true , double 형 50.5 가 연속적으로 Data 타입으로 들어 있으며 , 읽을때도 순서적으로 읽어야한다.
		
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data2.txt"));){
//			out.writeInt(100); // 인트형을 쓰고 싶을때 
//			out.writeBoolean(true); //  true 저장
//			out.writeDouble(50.5); // 50.5 더블형 저장
			out.writeInt(10);
			out.writeInt(20);
			out.writeInt(30);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
