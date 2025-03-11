package ch01.ex02;

/*
 * 사람 클래스
 * 사람 특징 (나이,이름,키 등등
 * 사람 동작 (run, sleep, eat, study, work 등등
 * 
 * 간추려 내는 과정을 추상화..
 */
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this("하미니" ,1)  //this는 항상 위에 올려놔야 오류가 안잡힘
	//	name = "하미니";
	//	age = 5;
		
	}
	
	
	public Person(String name) {
		 this(name,1);
	//	 this.name;
	//	age =1;
	   
	}
	
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	String dispalyInfo() {
		return name + " : " + age;
	}
	
	void run() {
		System.out.println("run........");
	}
	
	void eat() {
		System.out.println("eat........");
	}

}
