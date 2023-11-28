package net3; //20231128

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer2 {
	public static void main(String[] args) throws Exception {
		System.out.println("### 파일서버가 기동됨...");
		ServerSocket server = new ServerSocket(30000);
		
		while (true) {
			System.out.println("### 파일서버가 클라이언트의 요청을 기다리는 중...");
			Socket socket = server.accept();
			System.out.println("### 파일서버가 클라이언트의 연결요청을 수락함...");
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			System.out.println("### 파일서버와 클라이언트의 스트림이 서로 연결됨...");
			
			System.out.println("### 파일서버가 클라이언트로부터 요청메세지를 수신함...");
			int command = in.readInt();
			if (Command.REQ_UPLOAD == command) {
				System.out.println("### 파일서버가 클라이언트로부터 REQ_UPLOAD요청을 받음...");
			} else if (Command.REQ_DOWNLOAD == command) {
				System.out.println("### 파일서버가 클라이언트로부터 REQ_DOWNLOAD요청을 받음...");
				
				// 다운로드요청한 파일명 조회
				String filename = in.readUTF();
				System.out.println("### 파일 클라이언트가 다운로드요청한 파일명: " + filename);
				
				// 파일다운로드 처리
				File file = new File(new File("c:/repo"), filename);
				FileInputStream fis = new FileInputStream(file);
				long size = file.length();
				
				// 파일 클라이언트에게 응답 보내기. 명령어/파일명/사이즈 보내기
				out.writeInt(Command.RES_FILE);
				out.writeUTF(filename);
				out.writeLong(size);
				
				// 파일 데이터를 응답으로 보내기
				int len = 0;
				byte[] buf = new byte[1024];
				while ((len = fis.read(buf)) != -1) {
					out.write(buf, 0, len);
				}
				fis.close();
				
			} else if (Command.REQ_FILES == command) {
				System.out.println("### 파일서버가 클라이언트로부터 REQ_FILES요청을 받음...");
			}
		}
	}
}
