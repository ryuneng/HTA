package thread3; //20231130

import java.util.Vector;

public class App2 {
	public static void main(String[] args) throws Exception {
		HorseRunnable runnable = new HorseRunnable();
		
		Thread t1 = new Thread(runnable, "번개");
		Thread t2 = new Thread(runnable, "천둥");
		Thread t3 = new Thread(runnable, "백호");
		Thread t4 = new Thread(runnable, "한라");
		Thread t5 = new Thread(runnable, "금강");
		
		System.out.println("### 경주를 시작합니다.");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		/*
		 join()
		  - 이 메소드를 호출한 스레드가 종료될 때까지 기다렸다가 남은 수행문을 실행
		 */
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		// 이 수행문은 모든 스레드의 실행이 종료될 때까지 기다렸다가 실행됨
		// (위의 join() 작성하지 않으면 스레드들이 종료되기도 전에 맨위쪽에 '경주 종료'가 출력됨)
		System.out.println("### 경주를 종료합니다.");
		
		Vector<String> names = runnable.getNames();
		System.out.println("### 경기결과");
		System.out.println("1등: " + names.get(0));
		System.out.println("2등: " + names.get(1));
		System.out.println("3등: " + names.get(2));
		System.out.println("4등: " + names.get(3));
		System.out.println("5등: " + names.get(4));
	}
}
