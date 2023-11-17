package app;

import java.util.Comparator;
import java.util.List;

// CRUD
public class ScoreService {
	private ScoreRepository repo = new ScoreRepository();
	
	// 1. 신규 성적정보를 등록하는 서비스 (서비스 메소드의 가장 일반적인, 전형적인 형태)
	//  - 해당 학번의 성적정보가 존재하는지 체크
	//   > 정보가 존재하면 오류를 발생시킨다.
	//   > 정보가 존재하지 않으면 성적정보를 저장시킨다.
	//  반환타입 : void
	//  메소드명 : addNewScore
	//  매개변수 : Score score
	public void addNewScore(Score score) {
		Score savedScore = repo.findByNo(score.getNo());
		if (savedScore != null) {
			throw new RuntimeException("[" + score.getNo() + "] 성적정보가 이미 등록되어 있습니다.");
		}
		
		repo.save(score);
	}
	
	
	// 2. 모든 성적정보를 제공하는 서비스
	//  - 학생 성적정보를 학번에 대한 오름차순으로 정렬해서 제공한다.
	//  반환타입 : List<Score>
	//  메소드명 : getAllScores
	//  매개변수 : 없음
	public List<Score> getAllScores() {
		// 모든 성적정보를 repository에서 조회
		List<Score> list = repo.findAll();
		
		// 학번순으로 오름차순 정렬시키기
		// 1) sort 방법1 - 익명객체, Comparator 인터페이스를 구현하고 compare를 재정의
//		list.sort(new Comparator<Score>() {
//			public int compare(Score s1, Score s2) {
//				return s1.getNo() - s2.getNo();
//			}
//		});
		
		// 2) sort 방법2 - 방법1의 축약형, 람다식 - 타입추론 (*수행문 1개일 때 : {}, ;, return 모두 생략 가능)
		//		  (매개변수)  -> 수행문
		list.sort((s1, s2) -> s1.getNo() - s2.getNo());
		
		return list;
	}
	
	
	// 3. 모든 성적정보를 성적순으로 제공하는 서비스
	//  - 학생 성적정보를 총점에 대한 내림차순으로 정렬해서 제공한다.
	//  반환타입 : List<Score>
	//  메소드명 : getSortedScores
	//  매개변수 : 없음
	public List<Score> getSortedScores() {
		List<Score> list = repo.findAll();
		
		// 총점순으로 내림차순 정렬시키기
		list.sort((s1, s2) -> s2.getTotal() - s1 .getTotal());
		
		return list;
	}


	// 4. 성적정보를 변경하는 서비스
	//  - 학번으로 변경할 성적정보를 조회한다.
	//  - 성적정보가 존재하지 않으면 예외를 발생시킨다.
	//  - 성적정보가 존재하면 국어, 영어, 수학점수를 Setter 메소드를 사용해서 변경한다.
	//  - 변경된 성적정보로 총점과 평균을 다시 집계하도록 reduce() 메소드를 실행한다.
	//  반환타입 : void
	//  메소드명 : updateScore
	//  매개변수 : int no, int kor, int eng, int math
	public void updateScore(int no, int kor, int eng, int math) {
		Score savedScore = repo.findByNo(no);
		if (savedScore == null) {
			throw new RuntimeException("[" + no + "] 성적정보가 존재하지 않습니다.");
		}
		
		savedScore.setKor(kor);
		savedScore.setEng(eng);
		savedScore.setMath(math);
		
		savedScore.reduce();
	}
}
