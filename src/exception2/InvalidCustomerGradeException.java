package exception2; //20231121

public class InvalidCustomerGradeException extends RuntimeException {
	public InvalidCustomerGradeException() {
		
	}
	
	public InvalidCustomerGradeException(String message) {
		// super(message) : RuntimeException의 생성자 메소드
		super(message);
	}
}
