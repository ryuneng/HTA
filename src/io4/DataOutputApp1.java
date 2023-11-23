package io4; //20231123

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputApp1 {
	public static void main(String[] args) throws Exception {
		String name = "iphone 15 pro";
		String company = "애플";
		int price = 1500000;
		double discountRate = 0.05;
		boolean soldOut = false;
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("src/io4/item.save"));
		
		out.writeUTF(name);
		out.writeUTF(company);
		out.writeInt(price);
		out.writeDouble(discountRate);
		out.writeBoolean(soldOut);
	}
}
