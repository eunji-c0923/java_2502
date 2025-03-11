package ch01.ex03;

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
	
	void run() {
		System.out.println("run........");
	}
	
	void eat() {
		System.out.println("eat........");
	}

}
