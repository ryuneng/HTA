package lang; //20231114

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ContactApp4 {
	public static void main(String[] args) {
		Contact c1 = new Contact();
		
		/*
		 * Object의 getClass() 메소드
		 *  - 생성된 객체의 설계도 정보를 반환하는 메소드
		 *  - 반환타입 : Class 객체
		 *  - Class 객체 : 객체의 설계도 정보를 표현하는 객체
		 */
		Class<? extends Contact> clazz = c1.getClass();
		
		// Class의 getName() : 클래스명 반환
		String value1 = clazz.getName();
		System.out.println(value1);
		
		// Class의 getDeclaredFields() : 객체의 필드정보들을 반환
		// Field 클래스는 필드정보(접근제한자, 변수타입, 변수명)를 표현한다.
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f.getType().getName() + "\t" + f.getName());
		}
		
		// Class의 getDeclaredMethods()는 객체의 메소드들을 반환한다.
		// Method 클래스는 메소드정보(반환타입, 메소드명, 매개변수)를 표현한다.
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getReturnType().getName() + "\t" + m.getName());
		}
	}
}
