package net1; //20231127

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws IOException {
		// 클라이언트의 요청을 기다리는 ServerSocket 객체를 생성한다.
		// ServerSocket객체는 자신이 사용할 포트번호를 지정받는다.
		ServerSocket server = new ServerSocket(30000); // 자바는 서버소켓이 꼭 있어야 함
		System.out.println("서버가 기동됨...");
		
		while (true) {
			System.out.println("클라이언트의 연결요청 대기 중...");
			
			// accept(): 클라이언트의 연결요청을 기다리는 메소드
			// 클라이언트의 연결요청이 접수될 때까지 메소드의 실행이 연기된다.
			// 클라이언트의 연결요청이 접수되면 그 클라이언트와 통신하는 Socket객체를 반환한다.
			Socket socket = server.accept();
			System.out.println("클라이언트의 연결요청이 접수됨...");
			
			InetAddress inetAddress = socket.getInetAddress(); 
			System.out.println("접속을 요청한 클라이언트 ip: " + inetAddress + inetAddress.getHostAddress());
			
			// 클라이언트측 소켓과 연결된 스트림객체 생성하기
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
			
			// 클라이언트가 보낸 메세지 수신하기
			String name = reader.readLine();
			System.out.println("접속한 사용자명: " + name);
			
			// 클라이언트에게 메세지 보내기
			writer.println(name + "님 반갑습니다.");
		}
	}
}
