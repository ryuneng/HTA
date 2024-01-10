package method; //20231108

/*
 * 은행 계좌 클래스 설계하기
 * - 속성
 * 		예금주(String), 계좌번호(String), 비밀번호(int), 잔액(long), 이율(double)
 * - 기능
 * 		1. 조회기능 : 예금주, 계좌번호, 현재 잔액을 화면에 출력한다.
 * 				   반환타입 - void
 * 				   메소드이름 - display
 * 				   매개변수 - 없음
 * 
 * 				   public void display() {
 * 						// TODO
 * 				   }
 * 
 * 		2. 입금기능 : 신규 입금액을 전달받아서 잔액을 증가시킨다.
 * 				   반환타입 - void
 * 				   메소드이름 - deposit
 * 				   매개변수 - int amount
 * 
 * 				   public void deposit(int amount) {
 * 						// TODO
 * 				   }
 * 
 * 		3. 출금기능 : 출금액, 비밀번호를 전달받아서 인증이 통과되면 출금액만큼 잔액을 감소시키고, 출금액만큼 금액을 반환한다.
 * 				   반환타입 - int
 * 				   메소드이름 - withdraw
 * 				   매개변수 - int amount, int pwd
 * 
 * 				   public int withdraw(int amount, int pwd) {
 * 						// TODO
 * 				   }
 * 
 * 		4. 비밀번호변경기능 : 이전 비밀번호, 새 비밀번호를 전달받아서 인증이 통과되면 비밀번호를 새 비밀번호로 대체한다.
 * 				   반환타입 - void
 * 				   메소드이름 - changePassword
 * 				   매개변수 - int oldPwd, int newPwd
 * 
 * 				   public void changePassword (int oldPwd, int newPwd) {
 * 						// TODO
 * 				   }
 * 
 * 		5. 해지기능 : 비밀번호를 전달받아서 인증이 통과되면 현재 잔액과 이율을 계산해서 최종 해지 예상금액을 반환한다.
 * 				   반환타입 - long
 * 				   메소드이름 - terminate
 * 				   매개변수 - int pwd
 * 
 * 				   public long terminate (int pwd) {
 * 						// TODO
 * 				   }
 */

public class BankAccount {
	// 멤버변수(인스턴스변수) 정의하기
	String owner;			// 예금주
	String accNo;			// 계좌번호
	int password;			// 비밀번호
	long balance;			// 현재 잔액
	double interestRate;	// 이율
	
	// 생성자 정의하기
	public BankAccount(String owner, String accNo, int password, long balance, double interestRate) {
		this.owner = owner;
		this.accNo = accNo;
		this.password = password;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	// 멤버메소드 정의하기
	
	/**
	 * 계좌정보를 화면에 출력한다. 
	 */
	public void display() {
		System.out.println("### 계좌정보");
		System.out.println("예금주: " + owner);
		System.out.println("계좌번호: " + accNo);
		System.out.println("현재잔액: " + balance);
	}
	
	/**
	 * 입금액을 전달받아서 계좌의 잔액을 입금액만큼 증가시킨다.
	 * @param amount 입금액
	 */
	public void deposit(int amount) {
		System.out.println("### 입금액: " + amount);
		balance += amount;
		
		System.out.println("### - 입금 후 잔액: " + balance);
		System.out.println("### - 입금이 완료되었습니다.");
	}
	
	/**
	 * 출금요구금액, 비밀번호를 전달받아서 인증이 완료되면 요구금액만큼 출금액을 반환한다.
	 * @param amount 출금요구금액
	 * @param pwd 비밀번호
	 * @return 출금액, 비밀번호가 일치하지 않으면 출금액은 0이다.
	 */
	public long withdraw(int amount, int pwd) {
		// 빠른 종료, 나쁜 경우를 먼저 찾아서 제거하자.
		if (password != pwd) {
			System.out.println("### 비밀번호가 일치하지 않습니다.");
			return 0;
		}
		
		balance -= amount;
		System.out.println("### 출금 후 잔액: " + balance);
		
		return amount;
	}
	
	/**
	 * 이전 비밀번호와 새 비밀번호를 전달받아서 비밀번호를 변경한다.
	 * 이전 비밀번호와 입력한 비밀번호가 일치하고, 새 비밀번호와 이전 비밀번호가 서로 다른 경우에만 비밀번호를 변경한다.
	 * @param oldPwd 이전 비밀번호
	 * @param newPwd 새 비밀번호
	 */
	public void changePassword(int oldPwd, int newPwd) {
		if (oldPwd != password) {
			System.out.println("### 비밀번호 변경 실패: 비밀번호가 일치하지 않습니다.");
			return;
		}
		if (oldPwd == newPwd) {
			System.out.println("### 비밀번호 변경 실패: 기존 비밀번호와 같은 비밀번호로 변경할 수 없습니다.");
			return;
		}
		
		password = newPwd;
		System.out.println("### 비밀번호 변경이 완료되었습니다.");
	}
	
	/**
	 * 비밀번호를 전달받아서, 계좌를 해지시킨다. 해지가 완료되면 해지환급금을 반환한다.
	 * @param pwd 비밀번호
	 * @return 해지환급금, 현재 잔액에 이율을 적용한 금액
	 */
	public long terminate(int pwd) {
		if (pwd != password) {
			System.out.println("### 비밀번호가 일치하지 않습니다.");
			return 0;
		}
		
		System.out.println("### 계좌가 해지되었습니다.");
		
		long amount = balance + (long)(balance*interestRate);
		return amount;
	}
}