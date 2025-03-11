package ch01.ex01;

import java.util.Scanner;

/*
 * 반환0, 매개변수x
 * 
 */
public class Function3 {

	public static void main(String[] args) {

	
		
	//	int num1 = 10;
 	//	int num2 = 20;   / 빼버리기
		
		String result = add();
		
		System.out.println("result=" + result);
		
	
	}

	
	static String add() {  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름입력>>");
//		String name = sc.nextLine();
//		return name;
		
		return sc.nextLine();
	}
}
