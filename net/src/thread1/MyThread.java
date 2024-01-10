package thread1; //20231129

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	
	/*
	 * 스레드가 동시에 수행해야 하는 작업을 작성하는 메소드
	 */
	public void run() {
		for (int i = 0; i < 30; i++) {
			try {
				// 현재 실행중인 스레드의 이름 획득하기
				String threadName = Thread.currentThread().getName();
				System.out.println("[" + threadName + "] " + i);
				
				int sleepTime = (int)(Math.random()*2000);
				Thread.sleep(sleepTime);
			} catch (Exception e) {
				
			}
		}
	}
}
