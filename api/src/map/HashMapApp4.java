package map; //20231120

import java.util.HashMap;
import java.util.Map;

public class HashMapApp4 {
	public static void main(String[] args) {
		Map<String, MessageSender> map = new HashMap<>();
		map.put("sms", new SmsMessageSender());
		map.put("email", new EmailMessageSender());
		map.put("kakao", new KakaoMessageSender());
		
		User user1 = new User();
		user1.name = "홍길동";
		user1.senderTypes = new String[]{"sms", "kakao"};
		System.out.println("### " + user1.name + "에게 이벤트 메세지 전송하기");
		for(String type : user1.senderTypes) { // type에는 "sms", "kakao"가 전달됨 (if 없이 가능)
			MessageSender ms = map.get(type); // map.get() : key에 해당하는 value 조회
			ms.send();
		}
	}
	
	static class User {
		String name;		  // 고객명
		String[] senderTypes; // 고객이 수신동의한 메시지 수신 방법들
	}
	
	static interface MessageSender {
		void send();
	}
	
	static class SmsMessageSender implements MessageSender {
		public void send() {
			System.out.println("SMS로 메시지를 보낸다.");
		}
	}
	
	static class EmailMessageSender implements MessageSender {
		public void send() {
			System.out.println("Email로 메시지를 보낸다.");
		}
	}
	
	static class KakaoMessageSender implements MessageSender {
		public void send() {
			System.out.println("KakaoTalk으로 메시지를 보낸다.");
		}
	}
}
