package enum1; //20231201

/*
// 클래스 상수 방식
// enum이 도입되기 전에 enum처럼 정의하고 사용했던 방식
public class Grade {
	public static final Grade GOLD = new GRADE();
	public static final Grade SILVER = new GRADE();
	public static final Grade BRONZE = new GRADE();
	
	private Grade() {
	
	}
}

public static void main(String[] args) {
	Grade grade1 = Grade.GOLD;
	if (grade1 == Grade.GOLD) {
	
	} else if (grade1 == Grade.SILVER) {
	
	}
	
	// switch문은 정수, 문자열, 열거형만 허용함
	switch (grade1) {
		case Grade.GOLD: break;
	}
}
 */


/*
// 고유한 값을 가지고 있는 클래스 상수
public class ScoreGrade {
	public static final ScoreGrade 수 = new ScoreGrade(90);
	public static final ScoreGrade 우 = new ScoreGrade(80);
	public static final ScoreGrade 미 = new ScoreGrade(70);
	
	// 1. 상수 : 고유한 값
	private int score;
	
	// 2. 생성자 : 외부에서 객체생성하지 못하게 private (default생성자 허용x)
	private ScoreGrade(int score) {
		this.score = score;
	}
	
	// 3. Getter : 고유한 값을 조회하기 위해 생성, 값을 바꾸지 못하도록 Setter는 제공x (상수이기 때문에)
	public int getScore() {
		return score;
	}
}
 */

public class MyCaption {

}
