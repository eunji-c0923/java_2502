package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {

		/*
		 * 키보드 통해서 국어점수 , 영어점수 입력 받는다.
		 * 국어점수, 영어점수 둘다 70 이상이면 합격, 아니면 불합격
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수: ");
		int korScore = sc.nextInt();
		
		
		sc.nextLine();
		
		System.out.println("영어 점수: ");
		int engScore = sc.nextInt();
		
		String result = (korScore >= 70) && (engScore >= 70) ? "합격" : "불합격";
		
		System.out.println(result);
						
			
	/*정답(선생님 기준)
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * system.out.println("국어점수": );
	 * int korscore = sc.nexInt();
	 * 
	 * sc.nextLine();
	 * 
	 * system.out.println("영어점수": );
	 * int korscore = sc.nexInt();
	 * 
	 * String result = (korscore >=70 && engscore>=70)? "합격 : "불합격";
	 * system.out.println(result);
	 * 
	 * 맞았다!야호
	 */
	}

}
