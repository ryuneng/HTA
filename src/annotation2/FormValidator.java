package annotation2; //20231130

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * 필드에 지정된 어노테이션을 활용해서 필드값의 유효성을 체크한다.
 */
public class FormValidator {
	
	/**
	 * 지정된 객체의 필드에 대한 유효성 체크를 수행하고, 체크결과를 반환한다.
	 * @param target 유효성 체크를 수행할 객체
	 * @return 유효성체크를 통과하지 못한 필드 및 에러 메세지 정보가 저장된 Set객체
	 * @throws Exception
	 */
	public Set<FieldError> validate(Object target) throws Exception {
		// 필드유효성 체크를 통과하지 못한 필드에 대한 정보를 저장하는 Set객체
		Set<FieldError> errors = new HashSet<FieldError>();
		
		// 대상객체의 설계도를 획득
		Class<?> clazz = target.getClass();
		// 대상객체의 모든 필드정보를 획득
		Field[] fields = clazz.getDeclaredFields();
		// 조회된 모든 필드를 순환하면서 유효성 체크 수행
		for (Field field : fields) {
			// @Min 어노테이션에 대한 유효성 체크 수행
			// 유효성체크를 통과하지 못한 경우 -> FieldError객체 반환
			// 유효성체크를 통과한 경우 -> null 반환
			FieldError error = checkMin(target, field);
			if (error != null) {
				errors.add(error);
			}
			error = checkMax(target, field);
			if (error != null) {
				errors.add(error);
			}
			error = checkNotBlank(target, field);
			if (error != null) {
				errors.add(error);
			}
		}
		
		return errors;
	}
	
	/*
	 Field
	  - 객체의 필드정보를 표현하는 클래스
	  - 필드정보에 포함되는 것 :
	      @NotBlank(message = "이름은 필수입력값입니다.")
	      private String name;
	      
	    1. 어노테이션 정보
	    2. 접근제한자
	    3. 타입
	    4. 이름(필드명)
	    5. 필드의 값을 조회하고, 변경할 수 있는 메소드
	       조회메소드
	           Object get(Object target)
	       변경메소드
	           void set(Object target, Object value)
	 */
	
	// 문자열의 최소 길이 검증
	private FieldError checkMin(Object target, Field field) throws Exception {
		// 필드의 이름 획득
		String fieldName = field.getName();
		
		// 지정된 어노테이션 객체 조회
		// 어노테이션이 지정되어 있지 않으면 -> null 반환
		// 어노테이션이 지정되어 있으면 -> 어노테이션객체 반환
		Min min = field.getDeclaredAnnotation(Min.class);
		if (min == null) {
			return null;
		}
		
		// @Min 어노테이션의 속성 정보 조회
		int length = min.length();      // 바라보는 값: Min.java의 length() ---> 최종: UserForm.java의 @Min(length = 5, message = "아이디는 최소 5글자 이상입니다.")
		String message = min.message();
		
		// 필드에 설정된 값 조회
		field.setAccessible(true); // 필드의 접근제한자가 private인 경우에도 액세스 가능하도록 해줌
		String value = (String) field.get(target);
		// 값이 null이면 유효성 체크 안함
		if (value == null) {
			return null;
		}
		// 값이 null이 아니고, 값의 길이가 지정된 길이도 크거나 같으면 null 반환
		// 유효성 체크 통과
		if (value.length() >= length) {
			return null;
		}
		
		// 유효성 체크를 통과하지 못했기 때문에 Field객체를 반환
		return new FieldError(fieldName, message);		
	}
	
	private FieldError checkMax(Object target, Field field) throws Exception {
		String fieldName = field.getName();
		
		Max max = field.getDeclaredAnnotation(Max.class);
		if (max == null) {
			return null;
		}
		
		int length = max.length();
		
		field.setAccessible(true);
		String value = (String) field.get(target);
		if (value == null) {
			return null;
		}
		
		if (value.length() <= length) {
			return null;
		}
		
		return new FieldError(fieldName, max.message());	
	}
	private FieldError checkNotBlank(Object target, Field field) throws Exception {
		String fieldName = field.getName();
		
		NotBlank notBlank = field.getDeclaredAnnotation(NotBlank.class);
		if (notBlank == null) {
			return null;
		}
		
		field.setAccessible(true);
		String value = (String) field.get(target);
		if (value != null) {
			return null;
		}
		
		return new FieldError(fieldName, notBlank.message());	
	}
}
