package io4; //20231123

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class App1 {
	public static void main(String[] args) throws Exception {
		/*
		 * URL
		 *  - 지정된 URL 주소가 가리키는 자원을 표현하는 객체
		 *  - URL 객체의 openStream() 메소드는 해당 자원과 연결된 읽기 스트림을 반환한다.
		 *  - URL 객체의 openStream() 메소드를 실행해서 획득한 InputStream을 활용하면 URL 주소가 표현하는 자원을 읽어올 수 있다.
		 */
		URL url = new URL("https://img.khan.co.kr/news/2023/01/02/news-p.v1.20230102.1f95577a65fc42a79ae7f990b39e7c21_P1.png");
		
		InputStream in = url.openStream();
		FileOutputStream out = new FileOutputStream("src/io4.sample.png");
		
		IOUtils.copy(in, out);
	}
}
