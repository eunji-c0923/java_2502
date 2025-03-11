package ch01.ex05;

public class MainPerson {

	public static void main(String[] args) {

	Person p1 = new Person("하미니", 5);
	Person p2 = new Person("먀미" , 1);
	
	System.out.println(p1.dispalyInfo());
	
	p1.count += 100;  //p1.count = p1.count+100
	
	System.out.println(p1.count);
	System.out.println(p2.count);
	System.out.println(Person.count);  //이 방식을 많이 사용함
	
	p1.func();  //dispalyInfo와 func와 비슷해서 코드를 확인해 봐야함
	p2.func();
	Person.func();   //이 방식을 많이 사용함(메소드)

	
	}

}
