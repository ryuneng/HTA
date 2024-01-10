package thread3; //20231130

import java.util.Vector;

public class HorseRunnable implements Runnable {
	// 순위별로 경주마의 이름을 저장하는 객체
	private Vector<String> names = new Vector<String>();
	public Vector<String> getNames() {
		return names;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();  // 현재 실행중인 스레드의 이름을 가져옴
		for (int i = 1; i <= 20; i++) {
			System.out.println("[" + name + "]이 " + i + "미터 전진함...");
			try {
				Thread.sleep((int) (Math.random()*2000));
			} catch (Exception ex) {}
		}
		
		System.out.println("[" + name + "]이 결승선에 도착함...");
		names.add(name);
	}
}


/*
------------------------ 스레드 사용법 1)
class horse implements Runnable {
	Vector<String> names = new Vector<>();
	
	public void run() {
		// 100m 경주
		names.add(name);
	}
}

// HorseRunnable객체를 하나 생성해서 스레드에게 제공했기 때문에 Vector객체도 하나만 생성되고,
// 모든 스레드가 동일한 Vetor객체에 경주마의 이름을 등록하기 때문에 경주결과를 집계할 수 있음
Thread t1 = new Thread(runnable);
Thread t2 = new Thread(runnable);
Thread t3 = new Thread(runnable);
 */

/*
------------------------ 스레드 사용법 2)
class horse extends Thread {
	Vector<String> names = new Vector<>();
	
	public void run() {
		// 100m 경주
		names.add(name);
	}
}

// 각 스레드마다 Vector객체를 개별적으로 가지게 됨으로 경주결과가 집계되지 않음
Horse t1 = new Horse();
Horse t2 = new Horse();
Horse t3 = new Horse();
 */


