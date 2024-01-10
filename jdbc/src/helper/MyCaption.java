package helper; //20231207

/*
RowMapper<T>와 JdbcTemplate
  
JdbcTemplate
  - JDBC를 활용한 데이터베이스 액세스작업을 도와주는 기능이 구현된 클래스
  - 주요 메소드
  1. insert
      int insert(String sql)
      int insert(String sql, Object... params)
	  
  2. update
      int update(String sql)
      int update(String sql, Object... params)
	  
  3. delete
      int delete(String sql)
      int delete(String sql, Object... params)
  
  * Object...params 매개변수가 있는 메소드 : SQL의 바인딩변수(?,물음표)가 있을 때 사용하는 메소드
    Object...params에 해당하는 부분에 ?와 치환될 값을 순서대로 나열하여 사용
    
  * 작성예시)
    public void insertBook(Book book) {
        String sql = """
                insert int sample_book
                (book_no, book_title, book_price, book_stock)
                values
                (?,?,?,?)
        """;
        
        JdbcTemplate.insert(sql,
                            book.getNo(),
                            book.getTitle(),
                            book.getPrice(),
                            book.getStock());
    }
    
  4. select
      T selectOne(String sql, RowMapper<T> rowMapper);
      T selectOne(String sql, RowMapper<T> rowMapper, Object... params);
      
      List<T> selectList(String sql, RowMapper<T> rowMapper);
      List<T> selectList(String sql, RowMapper<T> rowMapper, Object... params);
    
  * selectOne 메소드 : 조회결과가 한 건 조회될 때 사용
    selectList 메소드 : 조회결과가 여러 건 조회될 때 사용
    즉, selectOne 메소드는 기본키 컬럼이 WHERE절의 조건식에 포함되어 있을 때 사용
    
  * RowMapper<T> : 인터페이스
 */

/*
interface RowMapper<T> {
    T mapRow(ResultSet rs) throws SQLException; // 메소드이름에 map이 들어있으면 : 변형한다는 의미 - 입력(rs)를 T로 변경
}

select book_no, book_title, book_price
from sample_books

ResultSet의 결과 :
------------------------------
100   이것이 자바다    35000        -----------> Book
------------------------------
102   자바의 정석     32000        -----------> Book
------------------------------

public Book getBookByNo(int no) {
    String sql = """
            select book_no, book_title, book_price
            from sample_books
            where book_no = ?
    """;
    
    JdbcTemplate.selectOne(sql, new RowMapper<Book>() { // 익명함수
            public Book mapRow(ResultSet rs) throws SQLException {
                Book book = new Book();
                book.setNo(rs.getInt("book_no"));
                
                return book;
            }
    }, no);
    
    JdbcTemplate.selectOne(sql, rs -> {
                Book book = new Book();
                book.setNo(rs.getInt("book_no"));
                
                return book;
            }
    }, no);
}
 */

public class MyCaption {}
