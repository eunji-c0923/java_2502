package ch01.ex02;

public class MainPerson {

	public static void main(String[] args) {

	Person p1 = new Person("하미니",5);
	Person p2 = new Person("예주니",24);
	
	String result = p1.dispalyInfo();
	
	System.out.println(result);
	
	
   p2.dispalyInfo();
	
	System.out.println(p2.dispalyInfo());
	
	
	System.out.println();
	
	
	Person p3 = new Person();
	System.out.println(p3.dispalyInfo());
	
	System.out.println();
	
	
	Person p4 = new Person("먀미");
	System.out.println(p4.dispalyInfo());
	
	

	
	}

}