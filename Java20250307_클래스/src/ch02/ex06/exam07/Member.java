package ch02.ex06.exam07;

public class Member{

	/*
	 * 현실세계의 회원을 Member 클래스로 모델링을 하려고 합니다.
	 * 회원의 데이터로는 이름,아이디,패스워드,나이가 있습니다.
	 * 이 데이터들을 가지는 Member클래스 선언해보세요
	 */
	
	private String name;
	private String id;
	private String PW;
	private int age;
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
			
	}
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(PW);
		System.out.println(age);
	
	}
	
	
	
}
