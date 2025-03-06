package ch01.ex0;

import java.util.Scanner;

public class personMain {

	public static void main(String[] args) {

	//이름, 나이, 전화번호만 입력
    //메소드 호출해서 출력
	 Person person
	 = new person("하미니", 5 , "010-9999-1101");
	
	 person.age = 20;
	 
	 person.이름출력();
	 person.나이출력();
	 person.전화번호출력();
	
	 Person p2 = new person("하미니", 5, "010-9999-1101");
	 p2.이름출력();
	 p2.나이출력();
	 p2.전화번호출력();
	
	
	}

}

