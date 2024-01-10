package io3; //20231123

import java.io.PrintWriter;

public class App2 {
	public static void main(String[] args) throws Exception {
		
		/*
		 * PrintWriter
		 *  - 캐릭터스트림의 출력 전용 스트림
		 *  - print(), println() 메소드를 제공함
		 *  - println() 메소드를 사용하면 자동으로 줄바꿈문자를 추가해줌
		 *    => 줄바꿈 문자 추가 없이 한줄씩 출력이 가능
		 */
		
		PrintWriter writer = new PrintWriter("src/io3/data2.csv");
		
		writer.println("김유신,100,100,100");
		writer.println("강감찬,100,100,100");
		writer.println("이순신,100,100,100");
		
		writer.flush();
		
		writer.close();
	}
}
