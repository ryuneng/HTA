package jdbc3_practice; //20231208

// 매개변수로 인터페이스(이 인터페이스를 구현한 구현객체)를 전달
// 그 구현객체 안에는 추상화된 메소드가 있음 (이런 방식을 Callback 메소드 패턴이라고도 함)

/*
// RowMapper<T> 인터페이스는 ResultSet 객체에서 현재 커서가 위치한 행의 데이터를
// 특정 객체에 담아서 반환하는 기능이 추상화되어 있다.
public interface RowMpper<T> {
    T mapRow(Result rs);
}

// 1. 인터페이스를 구현한 구현클래스 작성하기
public class ProductRowMapper implements RowMapper<Product> {
    // 전달받은 resultSet 객체에서 현재 커서가 위치한 행의 데이터를 가져와서
    // Product 객체를 생성해서 담고 반환한다.
    public Product mapRow(ResultSet rs) {
        int no = rs.getInt("prod_no");
        String name = rs.getString("prod_name");
        String maker = rs.getString("prod_maker");
        ...
        
        Product product = new Product();
        product.setNo(no);
        product.setName(name);
        product.setMaker(maker);
        ...
        
        return product;
    }
}

// 2. 인터페이스를 구현한 구현클래스를 작성하지 않고, 익명객체 생성하기
RowMapper<Product> rowMapper = new RowMapper<Product>() {
    public Product mapRow(ResultSet rs) {
        Product product = new Product();
        product.setNo(rs.getInt("prod_no"));
        product.setName(rs.getString("prod_name"));
        product.setMaker(rs.getString("prod_maker"));
        ...
        
        return product;
    }
};

// 3. 인터페이스를 구현한 구현클래스를 작성하지 않고, 람다식으로 익명객체 생성하기 (추상메소드가 1개여야만 람다식으로 생성 가능, 람다식은 구현내용과 매개변수명만 표현)
RowMapper<Product> rowMapper = rs -> { // 람다식은 타입을 유추하기 때문에 매개변수명(rs) 앞에 타입(ResultSet) 안적어도됨
    Product product = new Product();
    product.setNo(rs.getInt("prod_no"));
    product.setName(rs.getString("prod_name"));
    product.setMaker(rs.getString("prod_maker"));
    ...
    
    return product;
}

public List<Product> getAllProducts() {
    String sql = """
        select prod_no, prod_name, prod_maker, prod_price, ...
        from sample_products
        order by prod_no desc
    """;



-------------------------------------------------------------------

// 1. 익명객체 방식
JdbcTemplate.selectList(sql, new RowMapper<Product>() {
    public Product mapRow(ResultSet rs) {
        Product product = new Product();
        product.setNo(rs.getInt("prod_no"));
        product.setName(rs.getString("prod_name"));
        product.setMaker(rs.getString("prod_maker"));
        ...
        
        return product;
    }
});

// 2. 람다식 익명객체 방식
JdbcTemplate.selectList(sql, rs -> {
        Product product = new Product();
        product.setNo(rs.getInt("prod_no"));
        product.setName(rs.getString("prod_name"));
        product.setMaker(rs.getString("prod_maker"));
        ...
        
        return product;
    }
});


public class JdbcTemplate {

}
 */

public class Caption2 {

}
