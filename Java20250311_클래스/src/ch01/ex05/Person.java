package ch01.ex05;

/* 개념정리
 *정적변수:클래스의 모든 인스턴스가 공유하는 변슈이다
 *정적메소드 : 객체 생성 없이 클래스 이름을 통해 호출할 수 있는 메소드이다.
 *객체의 상태가 아닌 클래스의 상태(주로 정적변수)를 다룰때 유용
 *
 *인스턴스 변수(멤버변수),인스턴스 메소드(멤버메소드) 객체가 생성되어야만 사용할 수 있다.
 *정적변수, 정적메소드
 *count 와 func는 공용자원이다.
 */
public class Person {
	
	private String name;
	private int age;
	
	static int count;  //정적변수	
	
	static void f1() {}
	
	static void func() {
		System.out.println("정적메소드 func()");
		count++;
		f1();
		//age++;  사용할 수 없음
		//eat();  사용할 수 없음
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	String dispalyInfo() {
		return name + " : " + age;
	}
	
	void run() {
		count++;
		func();
		
		System.out.println("run........");
	}
	
	void eat() {
		System.out.println("eat........");
	}

}

