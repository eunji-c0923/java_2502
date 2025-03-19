package ex01;

import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[]arge) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num1 = sc.nextInt();
		int num2 = 0;
		
		while(true) {
			int num2 = sc.nextInt();
			
			if(num2 == 0 ) {
				System.out.println("0은 입력하지 마세요");
				System.out.println("0제외 정수입력 :");
				continue;
				
			}
			break;
		}
		
		System.out.println("합: " + (num1+num2));
		System.out.println("뺄셈: " + (num1-num2));
		System.out.println("곱하기: " + (num1*num2));
		System.out.println("나누기: " + (num1/num2));
		
		System.out.println("프로그램 종료");
	}
}
