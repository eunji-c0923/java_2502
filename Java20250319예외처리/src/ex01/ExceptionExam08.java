package ex01;

import java.util.Scanner;

public class ExceptionExam08 {

	public static void main(String[]arge) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("합: " + (num1+num2));
		System.out.println("뺄셈: " + (num1-num2));
		System.out.println("곱하기: " + (num1*num2));
		
		int[] arr = new int[5];
		String str = null;
						
			try {                                                 // 여기에 넣어주면 된다
		
          System.out.println("나누기: " + (num1/num2));             //
          
          
          
          System.out.println(str.length());                       //
		
		
		}catch(Exception e) {
			System.out.println("0으로 나눌때 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		
		}
		System.out.println("프로그램 종료");
		
}

	
}