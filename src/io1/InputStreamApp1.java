package io1; //20231122

import java.io.FileInputStream;

public class InputStreamApp1 {
	public static void main(String[] args) throws Exception {
		
		/*
		 * FileInputStream
		 *  - 파일의 내용을 1byte씩 읽어오는 스트림객체
		 */
		
		// src/io1/app1.txt을 읽어오는 FileInputStream 객체를 생성함
		FileInputStream in = new FileInputStream("src/io1/app1.txt");
		
		// 스트림이 읽어오는 데이터를 1바이트씩 읽어오기
		int value;
		while((value = in.read()) != -1) { // -1을 만나면 즉시 읽기 중단
			System.out.println((char)value);
		}
		
		in.close();
	}
}
