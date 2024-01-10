package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Collection 사용안하고 일반 배열로 코드 작성했을 때
 * : 아래처럼 배열 크기를 미리 정해놓고, index 에 담길 값도 미리 선언해놨어야 했지만 Collection 사용하면 이런 과정 불필요
 *  private Account[] db = new Account[100];
 *  private int position = 0;
 */
public class ScoreRepository {
	private ArrayList<Score> list = new ArrayList<Score>();
	
	// 생성자 메소드 - ScoreRepository 객체 생성하면 바로 실행됨
	public ScoreRepository() {
		list.add(new Score(10, "김유신", 70, 70, 50));
		list.add(new Score(22, "강감찬", 60, 70, 30));
		list.add(new Score(31, "홍길동", 90, 40, 50));
		list.add(new Score(16, "이순신", 50, 80, 40));
		list.add(new Score(28, "류관순", 100, 90, 100));
		list.add(new Score(25, "안중근", 50, 80, 70));
		list.add(new Score(13, "김좌진", 30, 100, 20));
		list.add(new Score(17, "홍범도", 80, 60, 100));
		list.add(new Score(26, "정약용", 40, 80, 70));
		list.add(new Score(27, "안창호", 100, 60, 90));
	}
	
	// 1. 신규 성적정보를 전달받아서 저장하는 메소드
	//  반환타입 : void (*저장, 변경, 삭제 메소드는 전부 void 로)
	//  메소드명 : save
	//  매개변수 : Score score
	public void save(Score score) {
		list.add(score);
	}
	
	// 2. 모든 성적정보를 제공하는 메소드
	//  반환타입 : List<Score> => 반환타입은 구체적으로 알려주지 않고 인터페이스로 정의(ArrayList 사용할 거지만 List로 => 차후 ArrayList에서 Vector로 변경 용이)
	//  메소드명 : findAll
	//  매개변수 : 없음
	@SuppressWarnings("unchecked")
	public List<Score> findAll() {
		return (List<Score>) list.clone(); // 원래 저장되어 있는 list 를 흐트러뜨리지 않기 위해 복제해서 주려고 clone()
	}
	
	// 3. 학번을 전달받아서 해당 학번의 성적정보를 제공하는 메소드 (*객체 1개 조회할 때 - 정보에 대한 고유한 식별자)
	//  반환타입 : Score
	//  메소드명 : findByNo
	//  매개변수 : int no
	public Score findByNo(int no) {
		for (Score score : list) {
			if (score.getNo() == no) { // score.no는 은닉화되어 있기 때문에 getNo()로 호출
				return score;
			}
		}
		return null; // 입력한 no 가 없으면 null 반환
	}
	
	// 4. 이름을 전달받아서 이름에 해당하는 성적정보를 제공하는 메소드 (*객체가 2개 이상 조회될 가능성이 있을 때 - List 안이 empty 일 순 있지만 null 일 순 없음)
	//  반환타입 : List<Score>
	//  메소드명 : findByName
	//  매개변수 : String name
	public List<Score> findByName(String name) {
		List<Score> foundScores = new ArrayList<Score>(); // 언제나 null 이 아니어야 함 (List 안이 empty 일 순 있지만 null 일 순 없음)
		
		for (Score score : list) {
			if(score.getName().equals(name)) {
				foundScores.add(score); // foundScores에 담아서 반환
			}
		}
		
		return foundScores;
	}
	
	// 5. 학번을 전달받아서 해당 학번의 성적정보를 삭제하는 메소드
	//  반환타입 : void
	//  메소드명 : deleteByNo
	//  매개변수 : int no
	public void deleteByNo(int no) {
		Iterator<Score> itr = list.iterator();
		while (itr.hasNext()) {
			Score score = itr.next();
			if (score.getNo() == no) {
				itr.remove();
				break;
			}
		}
	}
}
