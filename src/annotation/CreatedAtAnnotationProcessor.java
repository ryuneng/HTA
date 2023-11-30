package annotation; //20231130

import java.lang.reflect.Field;
import java.util.Date;

public class CreatedAtAnnotationProcessor {
	/**
	 * 대상 객체에 지정된 어노테이션(@CreatedAt)이 적용되어 있으면
	 * 해당 필드에 현재 날짜와 시간 정보를 표현하는 Date객체를 생성해서 대입시킨다. 
	 * @param target
	 */
	public void process(Object target) {
		// 대상객체의 설계도 정보가 포함된 Class객체를 획득
		Class<?> clazz = target.getClass();
		// 설계도 정보에서 모든 필드 정보를 획득
		Field[] fields = clazz.getDeclaredFields();
		
		// 조회된 모든 필드를 반복하면서 해당 필드에 @CreatedAt 어노테이션이 지정되어 있는지 조회
		for (Field field : fields) {
			//String fieldName = field.getName();
			boolean isAnnotated = field.isAnnotationPresent(CreatedAt.class);
			//System.out.println("["+fieldName+"]" + isAnnotated);
			if (isAnnotated) {
				try {
					// 해당 필드에 현재 날짜정보를 표현하는 Date객체를 설정
					field.setAccessible(true); // 해당 필드가 private필드여도 외부에서 접근 가능
					field.set(target, new Date());
				} catch (IllegalAccessException ex) {
					
				}
			}
		}
	}
}
