package ex01;

public class person {
	private String name;
	private int age;
	private String genger;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	void sleep() {}
	void eat() {}
	
	void introduce () {
		System.out.println("안녕하세요, 저는 " + name + "이고, 나이는" + age + "살입니다");
	}
}
