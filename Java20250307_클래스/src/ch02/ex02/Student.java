package ch02.ex02;

public class Student {

	private String name;
	private int grade; //학년
	private int age;
	
	
		
	public Student() {}
	
	public Student(String n, int g, int a) {
		name = n;
		grade = g;
		age = a;
	}
	void setgrade(int g) {
		
	}
	int getGrade() {
		return grade;
	}
	void setName(String n) {
		name =n;
	}
	
	String betName() {
		return name;
		}
		
	void prinInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("나이 : " + age);
	}
	
	
}
