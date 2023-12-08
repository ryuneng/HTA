package jdbc3_practice; //20231207

import java.sql.SQLException;
import java.util.List;

public class ProductUI {
	private ProductDao productDao = new ProductDao();
	private Scanner scanner = new Scanner(System.in);
	
	public void showMenu() {
		System.out.println("----------------------------------------------------------");
		System.out.println("1.전체조회 2.상세조회 3.검색 4.신규등록 5.삭제 6.가격변경 7.수량변경 0.종료");
		System.out.println("----------------------------------------------------------");
		
		System.out.print("### 메뉴선택: ");
		int menuNo = scanner.nextInt();
		
		try {
			switch (menuNo) {
				case 1: 전체조회(); break;
				case 2: 상세조회(); break;
				case 3: 검색(); break;
				case 4: 신규등록(); break;
				case 5: 삭제(); break;
				case 6: 가격변경(); break;
				case 7: 수량변경(); break;
				case 0: 종료(); break;
			}
		} catch (SQLException ex) {
			System.out.println("### 데이터베이스 작업 중 오류가 발생했습니다.");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		showMenu();
	}
	
	private void 전체조회() throws SQLException {
		System.out.println("<< 전체 상품 조회 >>");
		
		List<Product> products = productDao.getAllProducts();
		
		if (products.isEmpty()) {
			System.out.println("### 상품 정보가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("번호\t가격\t할인가\t수량\t상품명\t\t제조사");
		System.out.println("----------------------------------------------------------");
		for (Product product : products) {
			System.out.print(product.getNo() + "\t");
			System.out.print(product.getPrice() + "\t");
			System.out.print(product.getDiscountPrice() + "\t");
			System.out.print(product.getStock() + "\t");
			System.out.print(product.getName() + "\t");
			System.out.println(product.getMaker());
		}
		System.out.println("----------------------------------------------------------");
	}
	
	private void 상세조회() throws SQLException {
		System.out.println("<< 상품 정보 상세 조회 >>");
		System.out.println("### 상품 번호를 입력해서 상품 상세정보를 확인하세요.");
		
		System.out.print("### 상품 번호: ");
		int prodNo = scanner.nextInt();
		
		Product product = productDao.getProductByNo(prodNo);
		
		if (product == null) {
			System.out.println("### ["+prodNo+"] 상품 번호의 정보가 존재하지 않습니다.");
			return;
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("상품번호: " + product.getNo());
		System.out.println("상품이름: " + product.getName());
		System.out.println("제조사명: " + product.getMaker());
		System.out.println("상품가격: " + product.getPrice());
		System.out.println("할인가격: " + product.getDiscountPrice());
		System.out.println("상품수량: " + product.getStock());
		System.out.println("품절여부: " + product.getSoldOut());
		System.out.println("등록날짜: " + product.getCreatedDate());
		System.out.println("수정날짜: " + product.getUpdatedDate());
		System.out.println("----------------------------------------------------------");
	}
	
	private void 검색() throws SQLException {
		System.out.println("<< 상품 가격필터 검색 >>");
		System.out.println("### 상품의 최저가격, 최고가격을 입력해서 해당 가격 범위에 속하는 상품을 검색하세요.");
		
		System.out.print("### 최저가격: ");
		int minPrice = scanner.nextInt();
		System.out.print("### 최고가격: ");
		int maxPrice = scanner.nextInt();
		
		List<Product> products = productDao.getProductByPrice(minPrice, maxPrice);
		
		if (products.isEmpty()) {
			System.out.println("### 해당 가격 범위에 속하는 상품이 없습니다.");
			return;
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("번호\t가격\t할인가\t수량\t상품명\t\t제조사");
		System.out.println("----------------------------------------------------------");
		
		for (Product product : products) {
			System.out.print(product.getNo() + "\t");
			System.out.print(product.getPrice() + "\t");
			System.out.print(product.getDiscountPrice() + "\t");
			System.out.print(product.getStock() + "\t");
			System.out.print(product.getName() + "\t");
			System.out.println(product.getMaker());
		}
		System.out.println("----------------------------------------------------------");
	}
	
	private void 신규등록() throws SQLException {
		System.out.println("<< 신규 상품 등록 >>");
		System.out.println("### 신규 상품 정보를 입력하세요.");
		
		Product product = new Product();
		
		System.out.print("### 번호: ");
		int no = scanner.nextInt();
		System.out.print("### 상품명: ");
		String name = scanner.nextString();
		System.out.print("### 제조사: ");
		String maker = scanner.nextString();
		System.out.print("### 가격: ");
		int price = scanner.nextInt();
		System.out.print("### 할인가격: ");
		int discountPrice = scanner.nextInt();
		System.out.print("### 수량: ");
		int stock = scanner.nextInt();
		
		product.setNo(no);
		product.setName(name);
		product.setMaker(maker);
		product.setPrice(price);
		product.setDiscountPrice(discountPrice);
		product.setStock(stock);
		
		productDao.insertProduct(product);
		
		System.out.println("### 신규 상품을 등록하였습니다.");
	}
	
	private void 삭제() throws SQLException {
		System.out.println("<< 상품 정보 삭제 >>");
		System.out.println("### 삭제할 상품 번호를 입력하세요.");
		
		System.out.print("### 상품 번호: ");
		int prodNo = scanner.nextInt();

		Product product = productDao.getProductByNo(prodNo);
		if (product == null) {
			System.out.println("### ["+prodNo+"] 상품 번호가 존재하지 않습니다.");
			return;
		}
		
		productDao.deleteProductByNo(prodNo);
		
		System.out.println("### 상품 번호 ["+prodNo+"] 상품 정보가 삭제되었습니다.");
	}
	
	private void 가격변경() throws SQLException {
		System.out.println("<< 상품 가격 변경 >>");
		System.out.println("### 상품 번호를 입력해서 상품의 가격과 할인가를 변경하세요.");
		
		System.out.print("### 변경할 상품 번호: ");
		int prodNo = scanner.nextInt();

		Product product = productDao.getProductByNo(prodNo);
		if (product == null) {
			System.out.println("### ["+prodNo+"] 상품 번호가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("### 변경할 상품의 가격: ");
		int updateProdPrice = scanner.nextInt();
		System.out.print("### 변경할 상품의 할인가: ");
		int updateProdDiscountPrice = scanner.nextInt();
		
		
		productDao.updateProductPrice(updateProdPrice, updateProdDiscountPrice, prodNo);
		
		System.out.println("### 상품 번호 ["+prodNo+"]의 가격이 변경되었습니다.");
	}
	
	private void 수량변경() throws SQLException {
		System.out.println("<< 상품 수량 변경 >>");
		System.out.println("### 상품 번호를 입력해서 상품의 수량을 변경하세요.");
		
		System.out.print("### 변경할 상품 번호: ");
		int prodNo = scanner.nextInt();

		Product product = productDao.getProductByNo(prodNo);
		if (product == null) {
			System.out.println("### ["+prodNo+"] 상품 번호가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("### 변경할 상품 수량: ");
		int updateProdStock = scanner.nextInt();
		
		
		productDao.updateProductStock(prodNo, updateProdStock);
		
		System.out.println("### 상품 번호 ["+prodNo+"]의 수량이 변경되었습니다.");
	}
	
	private void 종료() {
		System.out.println("### 프로그램을 종료합니다.");
		System.exit(0);
	}
	
	public static void main(String[] args) throws Exception {
		new ProductUI().showMenu();
	}
}
