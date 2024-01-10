package io8; //20231124

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoService {
	private LottoRepository lottoRepo = new LottoRepository();
	private OrderRepository orderRepo = new OrderRepository();
	
	/**
	 * 구매금액을 전달받아서 금액만큼 로또번호를 자동으로 구매한다.
	 * 1. 회차번호를 획득한다 - 오늘날짜
	 * 2. 주문번호를 획득한다 - 유닉스타임
	 * 3. 구매금액만큼 로또번호세트를 자동으로 생성한다.
	 * 4. Order객체를 생성한다.
	 * 5. Order객체에 회차번호, 주문번호, 로또번호세트리스트를 저장한다.
	 * 6. Repository객체에 Order객체를 전달해서 저장시킨다.
	 * 7. Order객체를 반환해서 출력시킨다. 
	 * @param orderAmount 구매금액
	 * @return 구매정보(회차정보, 주문번호, 자동으로 생성된 로또번호 세트)
	 */
	public Order buy(int orderAmount) {
		// 회차번호를 획득한다.
		int lottoNo = orderRepo.getLottoNo();
		// 주문번호를 획득(생성)한다.
		long orderNo = System.currentTimeMillis();
		
		// 구매한 금액만큼 로또번호 발행
		int count = orderAmount/1000;
		List<Set<Integer>> numbers = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			// generateSet() 메소드는 로또번호를 발행한다.
			// generateSet()을 실행하면 숫자 6개가 포함된 Set객체를 획득한다.
			// numbers는 로또번호Set을 여러개 저장하는 객체다.
			// generateSet()으로 발행된 로또번호Set이 저장된다.
			numbers.add(generateSet());
		}
		
		// 주문정보는 로또회차번호, 주문번호, 로또번호로 구성된다.
		// Order객체를 생성해서 로또회차번호, 주문번호, 로또번호(자동으로 금액만큼 생성된) 를 담는다.
		Order order = new Order();
		order.setLottoNo(lottoNo);
		order.setOrderNo(orderNo);
		order.setNumbers(numbers);
		
		// 주문번호가 담겨있는 Order객체를 OrderRepository객체에 전달해서 저장시킨다.
		orderRepo.save(order);
		
		// 주문정보를 UI로 반환한다.
		return order;
	}
	
	/**
	 * 로또번호세트를 생성해서 반환한다.
	 * 1. 로또번호를 저장할 TreeSet객체를 생성한다.
	 * 2. 난수를 발생시키는 Random객체를 생성한다.
	 * 3-1. 반복을 시작한다.
	 * 4. 난수를 발생시켜서 1번에서 생성한 Set객체에 저장한다.
	 * 5. Set객체에 숫자가 6개 채워지면 반복문을 탈출한다.
	 * 3-2. 반복을 종료한다.
	 * 6. 로또번호세트를 반환한다.
	 * @return
	 */
	private Set<Integer> generateSet() {           // 중복되면 안되니까 Set
		// 로또번호를 저장할 TreeSet객체를 생성한다.
		Set<Integer> set = new TreeSet<Integer>(); // 정렬되도록 TreeSet
		// 난수를 발생시키는 Random객체를 생성한다.
		Random random = new Random();
		while(true) {
			// 1~45 범위내의 난수를 발생시킨다.
			int num = random.nextInt(45) + 1;
			// TreeSet객체에서 위에서 획득한 숫자를 저장한다.(같은 숫자는 저장되지 않음)
			set.add(num);
			// TreeSet객체에 6개가 저장되면 반복을 중단한다.
			if (set.size() == 6) {
				break;
			}
		}
		// 로또번호 6개가 저장된 TreeSet을 반환한다.
		return set;
	}

	/**
	 * 회차번호, 주문번호를 전달받아서 주문정보를 반환한다.
	 * 1. 회차번호에 해당하는 모든 주문정보목록을 조회한다.
	 * 2. 주문정보목록에서 지정된 주문번호에 해당하는 주문정보를 탐색해서 반환한다.
	 * 3. 주문번호와 일치하는 주문정보가 존재하지 않으면 예외를 발생시킨다.
	 * @param lottoNo 회차번호
	 * @param orderNo 주문번호
	 * @return 주문정보를 반환한다.
	 */
	public Order getOrder(int lottoNo, long orderNo) {
		// 회차번호에 해당하는 모든 주문정보목록을 획득한다.
		List<Order> orders = orderRepo.getOrders(lottoNo);
		
		// 주문정보목록에서 주문번호가 일치하는 주문정보를 탐색한다.
		for (Order order : orders) {
			// 주문정보의 주문번호와 전달받은 주문번호가 일치하면 해당 주문정보를 반환한다.
			if (order.getOrderNo() == orderNo) {
				return order;
			}
		}
		// 일치하는 주문정보가 없으면 예외를 던진다.
		throw new RuntimeException("[" + lottoNo + "][" + orderNo + "] 주문정보가 없습니다.");
	}

	/**
	 * 로또 당첨번호를 추첨하고, 반환한다.
	 * 1. 회차번호를 획득한다.
	 * 2. 당첨로또번호세트를 획득한다.
	 * 3. 보너스번호를 획득한다.
	 * 4. 로또당첨번호정보를 저장하는 Lotto객체를 생성한다.
	 * 5. Lotto객체에 회차번호, 로또번호세트, 보너스번호를 저장한다.
	 * 6. Repository객체에 Lotto객체를 전달해서 저장시킨다.
	 * 7. Lotto객체를 반환한다.
	 * @return 로또 당첨번호 정보
	 */
	public Lotto lotto() {
		// 회차번호를 획득한다.
		int lottoNo = orderRepo.getLottoNo();
		// 로또 당첨번호를 획득한다.
		Set<Integer> numbers = this.generateSet();
		// 로또 보너스번호를 획득한다.
		int bonus = this.getBonusNumber(numbers);
		// 로또 당첨번호를 표현하는 객체를 생성하고 회차번호, 당첨번호, 보너스번호를 저장한다.
		Lotto lotto = new Lotto();
		lotto.setNo(lottoNo);
		lotto.setNumbers(numbers);
		lotto.setBonus(bonus);
		
		// 추첨된 로또번호 저장하기
		lottoRepo.save(lotto);
		
		return lotto;
	}
	
	/**
	 * 보너스번호를 생성해서 반환한다.
	 * 1. 난수를 발생시키는 Random객체를 생성한다.
	 * 2-1. 반복시작
	 * 3. 1~45범위 내의 숫자를 발생시킨다.
	 * 4. 이번 회차 로또 당첨번호에 3번에서 획득한 숫자가 포함되어 있는지 확인하고,
	 *    포함되어 있지 않으면 해당 숫자를 보너스 번호로 반환한다.
	 * 2-2. 반복종료
	 * @param numbers 이번 회차 로또당첨번호
	 * @return 보너스번호
	 */
	private int getBonusNumber(Set<Integer> numbers) {
		// 난수를 발생시키는 Random객체를 생성한다.
		Random random = new Random();
		
		while (true) {
			// 1~45범위의 숫자중에서 난수를 발생시킨다.
			int number = random.nextInt(45) + 1;
			// 위에서 획득한 숫자가 추첨된 로또번호에 포함되는지 체크하고,
			// 포함되어 있지 않으면 보너스 번호를 반환한다.
			if (!numbers.contains(number)) {
				return number;
			}
		}
	}

	/**
	 * 회차번호, 주문번호를 전달받아서 당첨정보를 반환한다.
	 * 1. 회차번호에 해당하는 로또 추첨정보를 조회한다.
	 * 2. 회차번호에 해당하는 전체 로또 구매정보를 조회한다.
	 * 3. 주문번호에 해당하는 로또 구매정보를 조회한다.
	 * 4. 1번에서 조회한 추첨정보와 3번에서 조회한 구매정보를 비교해서 당첨정보를 알아낸다.
	 * 5. 당첨정보를 반환한다.
	 * @param lottoNo 회차번호
	 * @param orderNo 주문번호
	 * @return 당첨정보
	 */
	public List<Winning> check(int lottoNo, long orderNo) {
		// 지정한 회차의 로또 당첨번호정보를 조회한다.
		Lotto lotto = lottoRepo.getLotto(lottoNo);
		// 지정된 회차번호와 주문번호에 해당하는 주문정보를 조회한다.
		Order order = this.getOrder(lottoNo, orderNo);
		// 로또추첨번호와 구매한 로또번호세트목록을 전달해서 당첨여부를 체크하고,
		// 각 세트별 당첨정보를 반환받는다.
		List<Winning> winnings = check(lotto, order.getNumbers());
		
		return winnings;
	}
	
	/**
	 * 로또추첨정보와 구매한 로또번호세트목록을 전달받아서 당첨여부를 체크하고 그 결과를 반환한다.
	 * 1. 각 로또번호세트별 당첨정보를 저장할 ArrayList객체를 생성한다.
	 * 2. 각 로또번호세트별로 당첨여부를 검사하는 반복을 시작한다.
	 * 3. 해당 세트의 당첨정보를 저장할 Winning객체를 생성한다.
	 * 4. Winning객체의 당첨여부를 기본적으로 true로 설정한다.
	 * 5. check(로또번호, 구매한로또번호세트)를 실행해서 맞는번호세트를 조회한다.
	 * 6. 맞은 번호 갯수를 획득한다.
	 * 7. 맞은 번호 갯수를 기준으로 등수를 결정한다.
	 * 8. 당첨정보를 저장하는 Winning객체에 구매한 로또번호세트, 맞은 갯수, 맞은 번호세트, 등수를 저장한다.
	 * 9. 1번에서 셍성한 ArrayList객체에 당첨정보를 저장한다.
	 * 2. 반복종료
	 * 10. 당첨정보를 반환한다.
	 * @param lotto 이번 회차 로또 추첨번호
	 * @param numbers 고객이 구매한 로또번호세트 목록
	 * @return 각 로또세트별 당첨정보
	 */
	private List<Winning> check(Lotto lotto, List<Set<Integer>> numbers) {
		// 로또번호세트별 당첨정보를 저장하는 ArrayList객체 생성하기
		List<Winning> winnings = new ArrayList<Winning>();
		
		// 각 로또번호세트별 당첨 확인하기
		for (Set<Integer> set : numbers) {
			// 각 로또번호 세트별 당첨정보를 저장할 Winning 객체 생성하기
			Winning winning = new Winning();
			// 당첨여부를 true로 설정하기, 나중에 맞은 갯수가 3개 미만인 경우 false로 설정할 예정
			winning.setWin(true);
			// check(추첨번호, 구매한로또번호세트)를 실행해서 맞은 번호를 포함하는 Set객체 획득하기
			Set<Integer> correctNumbers = check(lotto.getNumbers(), set);
			// 맞은 번호 갯수 획득하기
			int count = correctNumbers.size();
			if (count == 6) {
				winning.setRank(1);
			} else if (count == 5) {
				// 보너스 번호를 맞혔는지 여부를 확인한다.
				if (set.contains(lotto.getBonus())) {
					winning.setRank(2);					
				} else {
					winning.setRank(3);
				}
			} else if (count == 4) {
				winning.setRank(4);
			} else if (count == 3) {
				winning.setRank(5);
			} else {
				winning.setWin(false);
			}
			// 맞은 번호 Set 저장하기
			winning.setCorrectNumbers(correctNumbers);
			// 맞은 갯수 저장하기
			winning.setCount(count);
			// 구매한 로또번호세트 저장하기
			winning.setNumbers(set);
			// 당첨정보목록에 저장하기
			winnings.add(winning);
		}
		return winnings;
	}
	
	/**
	 * 로또추첨번호세트와 구매한 로또번호세트를 전달받아서 맞은 번호세트를 반환한다.
	 * @param lotto 로또추첨번호
	 * @param numbers 구매한 로또번호
	 * @return 맞은 번호 Set
	 */
	private Set<Integer> check(Set<Integer> lotto, Set<Integer> numbers) {
		// 맞은 번호를 저장하는 Set객체 생성하기
		Set<Integer> collectNumbers = new TreeSet<Integer>();
		// 구매한 로또번호를 하나씩 꺼내서 추첨번호에 그 번호가 포함되어 있는지 여부를 확인하고
		// 포함되어 있으면 위에서 생성한 Set객체에 저장한다.
		for (int num : numbers) {
			if (lotto.contains(num)) {
				collectNumbers.add(num);
			}
		}
		return collectNumbers;
	}
}
