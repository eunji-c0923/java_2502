package ch01.ex12;

import java.util.Scanner;

public class Exam_문제2 {

	public static void main(String[] args) {
		
		//이름과 나이 구현
		
			
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("이름은 " + name );
		
		sc.nextLine();  //버퍼클리어
		//중간에서 버퍼에 들어가서 엔터를 비워버린다, 그래서 입력해주길 기다린다
		
		System.out.println("나이 입력");
		int age = sc.nextInt();
		System.out.println("나이는" + age );
		
		
	}

}
