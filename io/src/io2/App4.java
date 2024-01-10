package io2; //20231122

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.IOUtils;

public class App4 {
	public static void main(String[] args) throws Exception {
		String src = "c:/Users/jhta/Downloads/live.mp4";
		String dest = "c:/Users/jhta/Downloads/live_backup4.mp4";
		
		// apache-commons-io 라이브러리를 사용해서 읽고 쓰기
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		
		IOUtils.copy(in, out);
	}
}
