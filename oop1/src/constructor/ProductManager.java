package constructor; //20231102

public class ProductManager {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// 배열에서 상품정보의 저장 위치(인덱스)를 추적하는 변수 생성
		int savePosition = 0;
		
		// 상품정보를 여러개 저장하는 배열
		Product[] db = new Product[100];
		db[savePosition++] = new Product(100, "iphone15", "Apple", 150, 3);
		db[savePosition++] = new Product(101, "iphone15 pro", "Apple", 170, 3);
		db[savePosition++] = new Product(111, "macbook pro", "Apple", 250, 3);
		db[savePosition++] = new Product(115, "ipad air", "Apple", 90, 3);
		db[savePosition++] = new Product(116, "galaxy flip", "Samsung", 170, 3);
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.전체조회  2.신규등록  3.검색  4.수정  5.삭제  0.종료");
			System.out.println("--------------------------------------------");
			
			System.out.print("메뉴를 선택하세요: ");
			int menuNo = scanner.nextInt();
			
			if (menuNo == 1) {
				System.out.println("<<전체 상품 조회>>");
				
				for (Product p : db) {
					if (p == null) { // db의 배열은 총 100개인데 입력한 건 5개밖에 없고 그 외에는 null이라서 이 for문 실행하면 NullPointerException 오류나니까
						break;		 // null일 때는 빠져나가게 해주기
					}
					System.out.printf("%3d %-20s %-10s %5d만원 \n", p.no, p.name, p.maker, p.price); // %-20s : %뒤에 - 붙이면 왼쪽정렬됨
				}
				
			} else if (menuNo == 2) {
				System.out.println("<<신규 상품 등록>>");
				System.out.println("### 신규 상품정보를 입력하세요.");
				
				System.out.print("### 상품번호 입력: ");
				int no = scanner.nextInt();
				
				System.out.print("### 상품이름 입력: ");
				String name = scanner.nextString();
				
				System.out.print("### 제조회사 입력: ");
				String maker = scanner.nextString();
				
				System.out.print("### 상품가격 입력: ");
				int price = scanner.nextInt();
				
				System.out.print("### 입고수량 입력: ");
				int stock = scanner.nextInt();
				
				// 입력값으로 초기화된 Product 객체
				Product product = new Product(no, name, maker, price, stock);
				
				// 배열에 Product객체 저장
				db[savePosition++] = product;
				
				System.out.println("### 신규 상품정보 등록이 완료되었습니다.");
				
			} else if (menuNo == 3) {
				System.out.println("<<상품 정보 검색>>");
				
				System.out.print("### 검색옵션을 선택하세요(1:번호, 2:이름, 3:제조사, 4:가격): ");
				int optNo = scanner.nextInt();
				switch (optNo) {
					case 1:
						System.out.println("### 상품번호로 검색하기");
						System.out.print("### 검색할 상품번호 입력: ");
						int no = scanner.nextInt();
						
						for (Product p : db) {
							if (p == null) { // db의 배열은 총 100개인데 입력한 값 외에는 null이라서 이 for문 실행하면 NullPointerException 오류나니까
								break;		 // null일 때는 빠져나가게 해주기
							}
							if (p.no == no) {
								p.printProduct();
							}
						}
						break;
					case 2:
						System.out.println("### 상품명으로 검색하기");
						System.out.print("### 검색할 상품명 입력: ");
						String name = scanner.nextString();
						
						for (Product p : db) {
							if (p == null) { // p가 null일 때는 빠져나가게 해주기
								break;
							}
							if (p.name.equals(name)) { // equals: 동등성 비교 / ==: 동일성 비교
								p.printProduct();
							}
						}
						
						break;
					case 3:
						System.out.println("### 제조회사로 검색하기");
						System.out.print("### 검색할 제조회사 입력: ");
						String maker = scanner.nextString();
						
						for (Product p : db) {
							if (p == null) { // p가 null일 때는 빠져나가게 해주기
								break;
							}
							if (p.maker.equals(maker)) {
								p.printProduct();
							}
						} 
						break;
					case 4:
						System.out.println("### 가격으로 검색하기");
						System.out.print("### 최저가격 입력: ");
						int minPrice = scanner.nextInt();
						System.out.print("### 최고가격 입력: ");
						int maxPrice = scanner.nextInt();
						
						for (Product p : db) {
							if (p == null) { // p가 null일 때는 빠져나가게 해주기
								break;
							}
							if (p.price >= minPrice && p.price <= maxPrice) {
								p.printProduct();
							}
						}
						break;
				}
				
			} else if (menuNo == 4) {
				System.out.println("<<상품 정보 수정>>");
				System.out.print("### 수정할 상품의 번호를 입력하세요:");
				int no = scanner.nextInt();
				
				Product origin = null;
				for (Product p : db) {
					if (p == null) {
						break;
					}
					if (p.no == no) {
						origin = p;
						break;
					}
				}
					
				if (origin == null) {
					System.out.println("### 존재하지 않는 상품번호입니다.");
				} else {
					System.out.println("### 수정할 상품정보를 확인하세요.");
					origin.printProduct();
					
					System.out.println("### 이름, 가격, 수량정보를 입력해서 상품정보를 변경하세요.");
					System.out.print("### 상품이름 입력: ");
					String name = scanner.nextString();
					System.out.print("### 상품가격 입력: ");
					int price = scanner.nextInt();
					System.out.print("### 상품수량 입력: ");
					int stock = scanner.nextInt();
					
					origin.name = name;
					origin.price = price;
					origin.stock = stock;
					
					System.out.println("### 상품정보 수정이 완료되었습니다.");
				}
				
			
			} else if (menuNo == 5) {
				System.out.println("<<상품 정보 삭제>>");
				
			} else if (menuNo == 0) {
				System.out.println("<<프로그램 종료>>");
				System.exit(0);
			}
			
			System.out.println();
			System.out.println();
		}
	}
	
	/*
	 * 전체 상품 조회
	 *  - db 배열에 저장된 모든 상품정보를 화면에 출력한다.
	 *  - 향상된 for문을 사용해서 배열의 처음부터 끝까지 반복처리한다.
	 *    배열에 null이 저장되어 있으면 반복을 중단한다.
	 *  
	 * 신규 상품 정보 등록
	 *  - 상품번호, 이름, 제조회사, 가격, 입고수량을 입력받는다.
	 *  - Product객체를 생성해서 입력된 상품정보를 Product객체에 저장한다.
	 *  - 상품정보가 저장된 Product객체를 배열에 저장한다.
	 *  
	 * 상품정보 검색하기
	 *  - 검색옵션을 입력받는다.
	 *  - 검색옵션은 1/2/3 중에서 하나를 입력받는다.
	 *    *1: 상품이름으로 검색, 2: 제조회사로 검색, 3: 가격으로 검색
	 *  - 검색옵션에 맞는 검색어를 입력받는다. 
	 *  - 향상된 for문으로 배열의 처음부터 끝까지 반복하면서 검색조건에 맞는 상품정보를 출력한다.
	 *  
	 * 상품정보 수정하기
	 *  - 수정할 상품의 번호를 입력받는다.
	 *  - 상품번호에 해당하는 상품정보를 찾는다.
	 *  - 검색된 상품정보를 화면에 출력한다.
	 *  
	 *  - 상품명, 가격, 수량을 입력받는다.
	 *  - 위에서 검색한 상품정보의 상품명, 가격, 수량을 변경한다.
	 *  
	 * 상품정보 삭제하기
	 *  - 
	 *  
	 */
	
}
