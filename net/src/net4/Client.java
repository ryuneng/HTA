package net4; //20231128

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Client {
	private Map<Integer, Handler> map = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	
	public Client() {
		// Map객체에 메뉴별 핸들러객체를 저장한다.
		// ClientXXXHandler 객체가 클래스형변환되어서 Handler 타입으로 변환되어 Map에 저장된다.
		/*
		 * Map<Integer, Handler>
		 * 
		 *    [key:정수, value:Handler타입객체의 주소값]
		 */
		map.put(Cmd.MENU_LIST, new ClientFileListHandler());
		map.put(Cmd.MENU_DOWNLOAD, new ClientFileDownloadHandler(scanner));
		map.put(Cmd.MENU_UPLOAD, new ClientFileUploadHandler(scanner));
		map.put(Cmd.MENU_EXIT, new ClientExitHandler());
	}
	
	/**
	 * 파일서버로 연결요청을 보내고, 스트림을 연결해서 서버와 통신할 준비를 마친다.
	 * @throws IOException
	 */
	public void startup() throws IOException {
		socket = new Socket("192.168.0.7", 30000); // 소켓객체를 생성하는 것 자체가 연결요청
		
		out = new DataOutputStream(socket.getOutputStream());
		in = new DataInputStream(socket.getInputStream());
		
		showMenu();
	}
	
	public void showMenu() {
		try {
			System.out.println("-----------------------------------");
			System.out.println("1.목록조회  2.다운로드  3.업로드  0.종료");
			System.out.println("-----------------------------------");
			
			System.out.print("### 메뉴선택: ");
			int menu = scanner.nextInt();
			
			// handler의 타입을 Handler타입으로 했기 때문에
			// handler에는 다양한 Handler구현객체의 Handler를 참조할 수 있고,
			// menu의 값에 따라서 즉시 적절한 ClientXXXHandler 객체가 연결된다. (교체 가능)
			//  1) ClientFileListHandler객체의 Handler객체를 참조
			//  2) ClientFileDownloadHandler객체의 Handler객체를 참조
			//  3) ClientFileUploadHandler객체의 Handler객체를 참조
			//  4) ClientExitHandler객체의 Handler객체를 참조
			Handler handler = map.get(menu);
			// 다형성이 발현되는 지점
			// handler.handle(in, out)이라는 동일한 방식으로 실행하지만
			// handler가 실제로 참조하는 객체가 어떤 객체인가에 따라서 실행결과가 다르게 발현된다.
			// ---> 메뉴를 구성할 때 다형성을 통해 if문 대체 가능 (추후 메뉴 추가가 필요할 경우 Handler 객체만 추가하면 됨)
			handler.handle(in, out);
			
			System.out.println();
			System.out.println();
			System.out.println();
			showMenu();
		} catch (IOException ex) {
			System.out.println("### 오류: " + ex.getMessage());
		}
	}
	
	public static void main(String[] args) throws IOException {
		Client client = new Client();
		client.startup();
	}
}
