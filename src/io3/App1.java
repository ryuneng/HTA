package io3; //20231122

import java.io.BufferedReader;
import java.io.FileReader;

public class App1 {
	public static void main(String[] args) throws Exception{
		String path = "src/io3/data.csv";
		
		/*
		 * BufferedReader
		 *  - 다른 Reader와 연결해서 읽기 성능을 향상시키는 스트림
		 *  - 텍스트를 한 줄씩 읽어오는 readLine() 메소드 제공
		 *  - 주요 메소드
		 *      String readLine()
		 *        - 텍스트 내용을 한 줄씩 읽어오는 스트림
		 *        - 스트림의 끝을 만나면 null 반환 (readLine 제외하고는 전부 -1 반환)
		 *        - 텍스트를 읽어올 때 줄바꿈문자 바로 앞까지 읽어옴
		 */
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String text = null;
		while ((text = reader.readLine()) != null) {
			String[] items = text.split(",");
			String name = items[0];
			int kor = Integer.parseInt(items[1]);
			int eng = Integer.parseInt(items[2]);
			int math = Integer.parseInt(items[3]);
			
			int total = kor + eng + math;
			int average = total/3;
			
			System.out.println("이름: " + name);
			System.out.println("총점: " + total);
			System.out.println("평균: " + average);
			System.out.println();
		}
		
		reader.close();
	}
}
