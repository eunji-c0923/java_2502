package ch01.ex04;

/*
 *setter, getter
 */
public class Person {
	
	private String name;
	private int age;
	
	String getName() {
		return name;
				
	}
	
	int getAge() {
		return age;
	}
		
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age=age;
	}
	
	public Person() {
		this("하미니" ,1); //this는 항상 위에 올려놔야 오류가 안잡힘
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

