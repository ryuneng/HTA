package io2; //20231122

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class App2 {
	public static void main(String[] args) throws Exception {
		System.out.println("### 백업 파일 생성 시작 ....");
		long startTime = System.currentTimeMillis(); // 시작하는 순간의 유닉스 타임
		
		String src = "c:/Users/jhta/Downloads/live.mp4";
		String dest = "c:/Users/jhta/Downloads/live_backup2.mp4";
		
		// byte배열을 이용해서 읽고 쓰기
		
		// 원본 영상을 읽어오는 스트림객체 생성하기
		FileInputStream in = new FileInputStream(src);
		// 백업 영상을 기록하는 스트림객체 생성하기
		FileOutputStream out = new FileOutputStream(dest);
		
		byte[] buf = new byte[1024*8]; // 보통 버퍼의 크기는 8kb로 설정
		int len = 0;
		while ((len = in.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		
		in.close();
		out.close();
		
		System.out.println("### 백업 파일 생성 완료 ....");
		long endTime = System.currentTimeMillis();
		
		long runningTime = endTime - startTime;
		System.out.println("소요시간: " + runningTime + "밀리초"); // 소요시간: 24밀리초
	}
}
