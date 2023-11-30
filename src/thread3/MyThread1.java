package thread3; //20231130

public class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				sleep(500); // 0.5초동안 일시적으로 대기
			} catch (InterruptedException e) {
				
			}
		}
	}
}
