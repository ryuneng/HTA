package collection; //20231120

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * Properties
		 *  - Map 인터페이스의 구현 클래스
		 *  - key, value 타입 : String으로 고정되어 있음
		 *  - .properties 파일을 읽어서 설정정보를 key, value의 형태로 저장한다.
		 *  
		 *  - 주요 메소드
		 *  	void load(ImputStream in), void load(Reader reader)
		 *  		: 지정된 스트림으로 .properties파일을 읽어서 key, value 쌍으로 분석한다.
		 *  	String getProperty(String key)
		 *  		: 지정된 key에 해당하는 value를 반환한다.
		 *  		: 지정된 key에 해당하는 value가 존재하지 않으면 null을 반환한다.
		 *  	String getProperty(String key, String defaultValue)
		 *  		: 지정된 key에 해당하는 value를 반환한다.
		 *  		: 지정된 key에 해당하는 value가 존재하지 않으면 지정된 defaultValue를 반환한다.
		 *  	void setProperty(String key, String value)
		 *  		: 지정된 key, value 쌍의 값을 저장한다.
		 *   	void store(OutputStream out, String comment), void store(Writer writer, String comment)
		 *   		: 지정된 stream을 이용해서 Properties 객체의 key, value 쌍의 값을 저장한다. 
		 */
		
		Properties prop = new Properties();
		prop.load(new FileReader("src/collection/config.properties"));
		
		System.out.println(prop); // Properties는 순서가 보장되지 않음
		
		// 설정정보 조회하기
		String ip = prop.getProperty("email.server.ip");
		String port = prop.getProperty("email.server.port");
		String user= prop.getProperty("email.server.user");
		String password = prop.getProperty("email.server.password");
		
		System.out.println("ip주소: " + ip);
		System.out.println("포트번호: " + port);
		System.out.println("접속아이디: " + user);
		System.out.println("접속비밀번호: " + password);
	}
}
