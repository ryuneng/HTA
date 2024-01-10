package io1; //20231122

import java.io.FileOutputStream;

public class OutputStreamApp1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("src/io1/app3.txt");
		
		out.write(65);
		out.write(66);
		out.write(67);
		out.write(68);
		out.write(69);
		out.write(70);
		
		String str = "안녕하세요";
		// 한글은 1글자당 3byte로 쪼개짐 (영어는 1byte)
		//  안 -> [1110xxxx][10xxxxxxxx][10xxxxxx]
		//  녕 -> [1110xxxx][10xxxxxxxx][10xxxxxx]
		//  하 -> [1110xxxx][10xxxxxxxx][10xxxxxx]
		//  세 -> [1110xxxx][10xxxxxxxx][10xxxxxx]
		//  요 -> [1110xxxx][10xxxxxxxx][10xxxxxx]
		
		/*
		 * byte[] getBytes()
		 *  - 문자열을 byte 배열로 변환해서 반환한다.
		 *  - 문자열을 분석해서 각 문자를 utf-8 형식의 byte값으로 변환한 다음 배열에 담아서 반환한다.
		 */
		byte[] buf = str.getBytes();
		out.write(buf, 0, buf.length);
		
		out.close();
	}
}
