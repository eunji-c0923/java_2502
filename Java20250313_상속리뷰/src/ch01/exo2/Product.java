package ch01.exo2;

import java.text.DecimalFormat;

public class Product {

	private String name;
	private int balance;
	private int price;
	
	
	Product() {
	  this("먀미", 3, 18000);
		
	}
		
	public Product(String string, int i, int j) {
	}
	
	void Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	@Override
	public String toString() {
		DecimalFormat fmr = new DecimalFormat("#,##");
		
		return name+ " " + balance + " " +
		   fmr.format(price) + "원";
	}
	
	public String getName() {
		return name;
			
	}
	public int getBalance() {
		return balance;
			
	}
	
	public int getPrice() {
		return price;
	}
}

