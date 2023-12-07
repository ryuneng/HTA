package jdbc3_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDao {
	// 모든 상품정보를 반환하는 기능
	public List<Product> getAllProducts() throws SQLException {
		String sql = """
				SELECT
				    PROD_NO, PROD_NAME, PROD_MAKER, PROD_PRICE,
				    PROD_DISCOUNT_PRICE, PROD_STOCK, PROD_SOLD_OUT,
				    PROD_CREATED_DATE, PROD_UPDATED_DATE
				FROM
				    SAMPLE_PRODUCTS
				ORDER BY
				    PROD_NO ASC
		""";
		
		List<Product> productList = new ArrayList<Product>();
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Product product = new Product();
			product.setNo(rs.getInt("PROD_NO"));
			product.setName(rs.getString("PROD_NAME"));
			product.setMaker(rs.getString("PROD_MAKER"));
			product.setPrice(rs.getInt("PROD_PRICE"));
			product.setDiscountPrice(rs.getInt("PROD_DISCOUNT_PRICE"));
			product.setStock(rs.getInt("PROD_STOCK"));
			product.setSoldOut(rs.getString("PROD_SOLD_OUT"));
			product.setCreatedDate(rs.getDate("PROD_CREATED_DATE"));
			product.setUpdatedDate(rs.getDate("PROD_UPDATED_DATE"));
			
			productList.add(product);
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return productList;
	}
	
	
	
	// 상품번호에 해당하는 상품정보를 반환하는 기능
	public Product getProductByNo(int prodNo) throws SQLException {
		String sql = """
				SELECT
				    PROD_NO, PROD_NAME, PROD_MAKER, PROD_PRICE,
				    PROD_DISCOUNT_PRICE, PROD_STOCK, PROD_SOLD_OUT,
				    PROD_CREATED_DATE, PROD_UPDATED_DATE
				FROM
				    SAMPLE_PRODUCTS
				WHERE
				    PROD_NO = ?
		""";
		
		Product product = null;
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, prodNo);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			product = new Product();
			
			product.setNo(rs.getInt("PROD_NO"));
			product.setName(rs.getString("PROD_NAME"));
			product.setMaker(rs.getString("PROD_MAKER"));
			product.setPrice(rs.getInt("PROD_PRICE"));
			product.setDiscountPrice(rs.getInt("PROD_DISCOUNT_PRICE"));
			product.setStock(rs.getInt("PROD_STOCK"));
			product.setSoldOut(rs.getString("PROD_SOLD_OUT"));
			product.setCreatedDate(rs.getDate("PROD_CREATED_DATE"));
			product.setUpdatedDate(rs.getDate("PROD_UPDATED_DATE"));
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return product;
	}
	
	
	
	// 최저가격, 최고가격을 전달받아서 해당 가격범위에 속하는 상품정보를 반환하는 기능
	public List<Product> getProductByPrice(int minPrice, int maxPrice) throws SQLException {
		String sql = """
				SELECT
				    PROD_NO, PROD_NAME, PROD_MAKER, PROD_PRICE,
				    PROD_DISCOUNT_PRICE, PROD_STOCK, PROD_SOLD_OUT,
				    PROD_CREATED_DATE, PROD_UPDATED_DATE
				FROM
				    SAMPLE_PRODUCTS
				WHERE
				    PROD_PRICE >= ? AND PROD_PRICE <= ?
		""";
		
		List<Product> productList = new ArrayList<Product>();
		
		Connection connection = getConnection();
		PreparedStatement pstmt = getConnection().prepareStatement(sql);
		pstmt.setInt(1, minPrice);
		pstmt.setInt(2, maxPrice);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Product product = new Product();
			product.setNo(rs.getInt("PROD_NO"));
			product.setName(rs.getString("PROD_NAME"));
			product.setMaker(rs.getString("PROD_MAKER"));
			product.setPrice(rs.getInt("PROD_PRICE"));
			product.setDiscountPrice(rs.getInt("PROD_DISCOUNT_PRICE"));
			product.setStock(rs.getInt("PROD_STOCK"));
			product.setSoldOut(rs.getString("PROD_SOLD_OUT"));
			product.setCreatedDate(rs.getDate("PROD_CREATED_DATE"));
			product.setUpdatedDate(rs.getDate("PROD_UPDATED_DATE"));
			
			productList.add(product);
		}
		
		rs.close();
		pstmt.close();
		connection.close();
		
		return productList;
	}
	
	
	
	// 신규 상품정보를 저장하는 기능
	public void insertProduct(Product product) throws SQLException {
		String sql = """
				INSERT INTO SAMPLE_PRODUCTS
				(PROD_NO, PROD_NAME, PROD_MAKER, PROD_PRICE, PROD_DISCOUNT_PRICE, PROD_STOCK)
				VALUES
				(?,?,?,?,?,?)
		""";
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, product.getNo());
		pstmt.setString(2, product.getName());
		pstmt.setString(3, product.getMaker());
		pstmt.setInt(4, product.getPrice());
		pstmt.setInt(5, product.getDiscountPrice());
		pstmt.setInt(6, product.getStock());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	
	
	// 상품번호를 전달받아서 해당 상품정보를 삭제하는 기능
	public void deleteProductByNo(int prodNo) throws SQLException {
		String sql = """
				DELETE FROM SAMPLE_PRODUCTS
				WHERE PROD_NO = ?
		""";
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		pstmt.setInt(1, prodNo);
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	
	
	// 상품번호, 가격, 할인가격을 전달받아서 해당 상품의 가격을 수정하는 기능
	public void updateProductPrice(int price, int discountPrice, int No) throws SQLException {
		String sql = """
				UPDATE SAMPLE_PRODUCTS
				SET
				    PROD_PRICE = ?,
				    PROD_DISCOUNT_PRICE = ?,
				    PROD_UPDATED_DATE = SYSDATE
				WHERE
				    PROD_NO = ?
		""";
		
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		pstmt.setInt(1, price);
		pstmt.setInt(2, discountPrice);
		pstmt.setInt(3, No);
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	
	// 상품번호, 수량을 전달받아서 해당상품의 수량을 변경하는 기능
	public void updateProductStock(int prodNo, int prodStock) throws SQLException {
		String sql = """
				UPDATE SAMPLE_PRODUCTS
				SET
				    PROD_STOCK = ?,
				    PROD_UPDATED_DATE = SYSDATE
				WHERE
				    PROD_NO = ?
		""";
		
		Connection connection = getConnection();
		PreparedStatement pstmt = getConnection().prepareStatement(sql);
		
		pstmt.setInt(1, prodStock);
		pstmt.setInt(2, prodNo);
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	
	
	
	private Connection getConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch(ClassNotFoundException ex) {
			throw new SQLException(ex.getMessage(), ex);
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "zxcv1234";
		
		return DriverManager.getConnection(url, user, password);
	}
}
