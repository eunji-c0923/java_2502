package ch04.ex01;

public class ForExgam01 {

	public static void main(String[] args) {

		/*
		 * 반복문
		 * Forl, while -> 조건을 만족하는 순간까지 계속 반복
		 * for > 반복 횟수를 알때
		 * while > 몇번 반복하는지 모를때
		 * do~while -> 조건을 만족하는 순간까지 계속 반복(단, 최소 1회는 보장)(조건이 거짓이여도 1번은 실행됨)
		 */
		
		
		int sum= 0;
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		
		System.out.println("sum =" + sum);

		
			
	}
	
}
		
		/*
		 * 순서 : Sum=0, i=1 -> i<=100 -> sum += i; ->i++ > i<=100 > sum += i; >i++
		 * int i=1 부터 진행(초기값
		 * i<=5 >조건식
		 * i++ >증감식 
		 * sum += i; >실행문
		 * 
		 * -----------------
		 * 
		 */
