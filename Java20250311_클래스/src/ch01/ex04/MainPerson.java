package ch01.ex04;

public class MainPerson {

	public static void main(String[] args) {

	Person p1 = new Person("하미니", 5);
	Person p2 = new Person("먀미" , 1);
	
	System.out.println(p1.dispalyInfo());
	
	p1.setName("몌무");
	p1.setAge(9999);
	
	System.out.println(p1.dispalyInfo());
	System.out.println(p1.getName());
	System.out.println(p1.getAge());
	}

}
