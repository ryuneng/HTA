package thread2; //20231129

public class ATM implements Runnable {
	private int balance = 1000000; // 계좌잔액

	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			balance -= 20000;
			String name = Thread.currentThread().getName(); // 스레드 이름
			System.out.println("[" + name + "]이 출금함. 잔액:[" + balance + "]");
		}
	}
	
	
}
