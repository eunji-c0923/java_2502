package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) {

		
		Person p1 = new Person("하미니");
//		p1.name = "하미니";   /멤버변수는 private 이기 때문에 외부 접근 불가
		
//		p1.run();  /외부에서 접근 불가
		p1.eat();
		
		Person p2 = new Person("하미니", 5, "010-9999-1101");
		
		p2.eat();
		
//		Person p3 = new Person();
		p2.setName("예주니");  //값을 바꿔주는 식
		p2.eat();
		p2.setAge(24);  //값을 바꿔주는 식
	
		
		String name = p2.getName();
		int age = p2.getAge();
	    System.out.println(name);
	    System.out.println(age);
	
	
	
	
	}

}
