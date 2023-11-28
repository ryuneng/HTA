package net4; //20231128

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
	private Map<Integer, Handler> map = new HashMap<>();
	
	public Server() {
		map.put(Cmd.REQ_FILE_LIST, new ServerFileListHandler());
		map.put(Cmd.REQ_DOWNLOAD, new ServerFileDownloadHandler());
		map.put(Cmd.REQ_UPLOAD, new ServerFileUploadHandler());
	}
	
	public void startup() throws IOException {
		System.out.println("### 파일서버가 기동됨...");
		ServerSocket serverSocket = new ServerSocket(30000);
		
		while (true) {
			System.out.println("### 파일서버가 클라이언트의 요청을 대기중...");
			Socket socket = serverSocket.accept();
			System.out.println("### 파일서버가 클라이언트의 연결요청을 접수받음...");
			
			System.out.println("### 파일서버가 클라이언트와 통신할 스트림을 생성함...");
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			System.out.println("### 파일서버가 클라이언트의 요청을 분석함...");
			// cmd: 1, 2, 3 중의 하나
			//   1: Cmd.REQ_FILE_UPLOAD 요청
			//   2: Cmd.REQ_FILE_DOWNLOAD 요청
			//   3: Cmd.REQ_FILE_LIST 요청
			int cmd = in.readInt();
			System.out.println("### 클라이언트 요청: " + cmd);
			// Map객체에서 cmd에 해당하는 Handler객체를 가져온다.
			Handler handler = map.get(cmd);
			System.out.println("### Handler 구현객체: " + handler.getClass().getName());
			// 획득된 Handler구현객체의 handle() 메소드를 실행해서 클라이언트의 요청을 처리한다.
			handler.handle(in, out);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.startup();
	}
}
