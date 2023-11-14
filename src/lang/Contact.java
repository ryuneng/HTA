package lang; //20231113

import java.util.Objects;

public class Contact implements Cloneable { // clone() 사용하려면 반드시 implements Cloneable 해줘야 함 - 마크업 인터페이스
	String name;
	String phone;
	String email;
	String company;
	
	/**
	 * 이 객체의 복사본을 반환한다.
	 * @return 복제된 Contact 객체
	 */
	public Contact copy() {
		try {
			/*
			 * Object의 clone() 메소드
			 *  - protected Object clone() { ... }
			 *  - clone() 메소드는 접근제한자가 protected이기 때문에 Object를 상속받은 Contact의 내부에서 사용할 수 있다.
			 *  - clone() 메소드는 해당 객체를 복제한 객체를 반환한다. 단, 반환타입은 Object 타입이다.
			 *    단, Contact의 copy() 메소드에서 복제하는 객체는 언제나 Contact 객체일 것이기 때문에 Contact 타입으로 형변환이 가능하다.
			 */
			Contact clonedContact = (Contact) clone();
			return clonedContact;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
	
	// 1. hashCode 먼저 재정의
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	// 2. equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}



	// Object로부터 상속받은 toString() 재정의하기
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + ", email=" + email + ", company=" + company + "]";
	}
	
	
}
