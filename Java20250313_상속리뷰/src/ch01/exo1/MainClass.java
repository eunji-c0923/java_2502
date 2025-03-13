package ch01.exo1;

public class MainClass {

	public static void main(String[] args) {
	
		
		Book[] book = new Book[5];
		
	    book[0] = new Book();
	    book[1] = new Book("이것이자바다", "신용권", 38000);
	    book[2] = new Book("기다릴게","플레이브", 21000);
	    book[3] = new Book("대쉬","플둥이",35000);
	    book[4] = new Book("므메미무","므메미무",39000);
	    
	    for(int i=0; i<books.length; i++)
	    	System.out.println(books[i].getBookInfo());

	}
	
	
	
}
