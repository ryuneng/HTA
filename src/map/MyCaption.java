package map; //20231120

/*
 * Map
 *  - key, value의 쌍으로 객체를 저장한다.
 *  - key는 미리 약속되어 있다.
 *  - Map에 저장된 key, value값을 for문을 사용해서 다루지 않는다. 항상 key로 한번에 하나씩 값을 조회한다.
 *  - 사용 예
 *     - vo객체를 대체할 수 있다.
 *        Map<String, Object> map = new HashMap<>()과 같은 형태로 Map객체를 생성하면 key, value의 쌍으로 다양한 타입의 값을 저장할 수 있다.
 *        * 처리할 정보의 형태가 다양한 경우(값의 갯수, 값의 종류가 다양하게 변하는 정보를 다룰 때 사용)
 *     - if문의 조건식에서 비교값으로 이용되는 값을 Map객체의 key로 활용하면 if문을 제거할 수 있다.
 *        Map<String, Double> map = new HashMap<>();
 *        map.put("gold", 0.05);
 *        map.put("silver", 0.02);
 *        map.put("bronze", 0.01);
 *        // 고객등급과 구매금액을 전달받아서 포인트를 반환한다.
 *        // 포인트 적립률은 고객등급에 따라서 달라지는데, Map에 포인트 등급을 key, 적립률을 value로 저장해두면
 *        // 맵에서 고객등급으로 key로 적립률을 조회할 수 있다. 
 *        public int getPoint(String grade, int orderPrice) {
 *            double pointDepositRate = map.get(grade);
 *            return (int) (orderPrice*pointDepositRate);
 *        }
 *     - 여러 개의 값을 같은 값을 가진 것들끼리 분류할 수 있다.
 *        고객이름에서 성씨별 인원수 계산하기
 *        상품목록에서 상품카테고리별 상품수 계산하기
 *        연설문에서 단어별 빈도수 계산하기
 */


public class MyCaption {

}

/*
 * Map의 주요 메소드 : put, get
 * 
 * Map : VO를 대체, 가변적인 정보, if문 x
 * 
 * 향상된 for문 통해서 꺼내는 객체 : Set, Collection
 * Map에서 꺼내려면 반복처리 못하고, key를 통해 일일이 하나씩 꺼내야 함(100개면 100번 써야 함)
 * 
 * 
 * Map<Key,    Value >
 * Map<String, Object>
 *  value의 타입이 다양하면 Object로 (Key1의 값은 int고, Key2의 값은 String... => value의 타입이 다양함)
 *  => Object가 아니면 같은 종류의 타입인 것
 *  => Object일 때는 다 형변환 해줘야 함 - 예)int no = (int) map.get("no");
 *  
 *  
 * Map은 1.put,get할 때 타입 주의 / 2.get 할 때 오탈자 주의 (둘다 컴파일 오류 안나고, 런타임오류로만 알 수 있음)
 * VO는 위의 둘다 컴파일 오류로 체크 가능 => 더 안전
 * 
 * 
 * 어떤 종류가 있는지 알고 싶을 때 : Set 사용
 * 종류별로 몇개나 있는지 알고 싶을 때 : Map 사용
 */