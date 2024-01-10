package thread4; //20231130

public class Repo {
	
	private String data;

	// 공급자 스레드가 실행하는 메소드
	public synchronized void produce(int index) throws Exception {
		if (data != null) {
			wait();
		}
		data = index + "번째 값";
		System.out.println("["+index+"]번째 값을 공급하다.");
		notify();	// 소비자의 일시정지를 해제한다.
	}
	
	// 소비자 스레드가 실행하는 메소드
	public synchronized void consume() throws Exception {
		if (data == null) {
			wait(); // 데이터가 있으면 자신을 대기상태로
		}
		System.out.println("["+data+"]를 소비하다.");
		data = null;
		notify(); // 대기상태에 있는 상대방을 깨움
		System.out.println();
	}
	
	/*
	 1. 공급자 스레드가 start() 된 후, repo.produce() 메소드를 실행한다.
	    a. data가 null일 때 :
	       1) Repo의 data에 새로운 값을 저장한다.
	       2) notify()를 실행해서 2-a-2) 상태의 소비자를 실행가능상태로 변경한다.
	    b. data가 null이 아닐 때 :
	       1) wait()를 실행해서 자신(공급자)를 대기상태로 변경한다.
	          
	 2. 소비자 스레드가 start()된 후, repo.consume() 메소드를 실행한다.
	    a. data가 null일 때 :
	       1) wait()를 실행해서 자신(소비자)를 대기상태로 변경한다.
	       2) 소비하기...를 실행하지 못하고 대기상태에서 대기중...
	    
	 */
}
