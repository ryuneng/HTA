package io4; //20231123

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputApp1 {
	public static void main(String[] args) throws Exception {
		DataInputStream in = new DataInputStream(new FileInputStream("src/io4/item.save"));
		
		// class DataOutputApp1에 정의된 item.save의 데이터 타입과 선언 순서가 똑같아야 함
		String value1 = in.readUTF();
		String value2 = in.readUTF();
		int value3 = in.readInt();
		double value4 = in.readDouble();
		boolean value5 = in.readBoolean();
		
		System.out.println("상품명: " + value1);
		System.out.println("제조사: " + value2);
		System.out.println("가격: " + value3);
		System.out.println("할인율: " + value4);
		System.out.println("절판여부: " + value5);
	}
}
