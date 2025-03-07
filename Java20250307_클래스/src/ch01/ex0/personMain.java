package ch01.ex0;

import java.util.Scanner;

public class personMain {

	public static void main(String[] args) {

	//이름, 나이, 전화번호만 입력
    //메소드 호출해서 출력
	 person person
	 = new person("하미니", 5 , "010-9999-1101");
	
	// person.age = 20;(필드접근제한자 :private)
	 
	 person.이름출력();
	 person.나이출력();
	 person.전화번호출력();
	
	
	
	}

}

