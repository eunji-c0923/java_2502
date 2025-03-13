package ch01.exo2;

public class ProductMain {

	public static void main(String[] args) {
	
		
		Product[] Products = new Product[5];
		
		Products[0] = new Product();
		Products[1] = new Product("이것이자바다", "신용권", 38000);
		Products[2] = new Product("기다릴게","플레이브", 21000);
		Products[3] = new Product("대쉬","플둥이",35000);
	    Products[4] = new Product("므메미무","므메미무",39000);
	    
	    for(int i=0; i<Products.length; i++)
	    	System.out.println(Products[i]);

	}
	
	
	
}
