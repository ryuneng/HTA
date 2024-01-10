package io8; //20231124

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
	private List<Order> db = new ArrayList<Order>();
	
	public OrderRepository() {
		int lottoNo = getLottoNo();
		load(lottoNo);
	}
	
	private void load(int lottoNo) {
		db = getOrders(lottoNo);
	}
	
	private void stored() {
		try {
			String path = "src/io8/" + getLottoNo() + ".csv";
			PrintWriter writer = new PrintWriter(path);
			
			for (Order order : db) {
				writer.println(order.toText());
			}
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException ex) {
			throw new RuntimeException("파일을 찾을 수 없습니다", ex);
		}
	}
	
	/**
	 * 지정된 회차의 로또구매정보를 반환한다.
	 * @param lottoNo 회차번호
	 * @return 해당 회차의 모든 로또구매정보
	 */
	public List<Order> getOrders(int lottoNo) {
	      try {
	    	 // 해당 회차의 모든 로또구매정보를 저장하는 List객체를 생성한다.
	         List<Order> orders = new ArrayList<Order>();
	         
	         // 해당 회차의 로또 구매정보가 저장된 파일의 전체 이름을 획득한다. 
	         String path = "src/io8/" + lottoNo + ".csv";
	         // 로또 구매정보가 기록된 파일을 표현하는 File객체를 생성한다.
	         File file = new File(path);
	         // 해당 파일이 이미 존재하는지 체크하고, 존재하지 않으면 빈 파일을 생성한다.
	         if (!file.exists()) {
	        	 file.createNewFile();
	         }
	         // 해당 파일의 내용을 한 줄씩 읽어오는 BuffereReader객체를 생성한다.
	         BufferedReader reader = new BufferedReader(new FileReader(path));
	         // 한 줄씩 로또 구매정보를 읽어서 Order객체를 생성하고, 위에서 생성한 List객체에 저장한다.
	         String text = null;
	         while ((text = reader.readLine()) != null) {
	            orders.add(Order.toOrder(text));
	         }
	         reader.close();
	         
	         return orders;
	      } catch (FileNotFoundException ex) {
	         throw new RuntimeException("파일을 찾을 수 없습니다.", ex);
	      } catch (IOException ex) {
	         throw new RuntimeException("파일을 읽어오는 중 오류가 발생하였습니다.", ex);
	      }
	   }
	
	public int getLottoNo() {
		LocalDate today = LocalDate.now();
		String todayText = today.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		return Integer.parseInt(todayText);
	}
	
	/*
	 * 주문정보를 저장한다.
	 */
	public void save(Order order) {
		// 전달받은 주문정보를 ArrayList객체에 저장한다.
		db.add(order);
		// 변경된 정보를 파일에 저장시킨다.
		stored();
	}
}
