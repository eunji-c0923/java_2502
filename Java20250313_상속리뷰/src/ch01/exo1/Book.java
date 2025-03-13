package ch01.exo1;

public class Book {

	private String title;
	private String author;
	private int price;
	
	
	Book() {
	  title = "자바의 정석";
	  author = "남궁성";
	  price = 35000;
		
	}
		
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
	String getBookInfo() {
		return "title: " + title + ", author: " + author + ", price: " + price;
		
	}
}

