package ch04.ex01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {

		/*
		 * 키보드 숫자 입력 받는다.
		 * 5입력하면  1~5까지의 누적합 15
		 * 10입력하면 1~10까지의 누적합 55
		 * 100 입력하면 1~100까지의 누적합 550
		 */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		
		int = sum = 0;
		for(int i=1; i<=5; i++) {
			sum = sum + i;
			
			System.out.println();
		}

	
	/*
	 * 정답
	 * 
	 * scanner sc + new scanner(System.in);
	 * System.out.println("정수 입력>>");
	 * 
	 * int number = sc.nextInt();
	 * 
	 * for(int i=1; i<= number; i++)   (넘버값을 변경하면 값이 출력됨)
	 * sum +=i;
	 * 
	 * System.out.println(sum);
	 */
	
		 /* ------------------------------
		  * scanner sc + new scanner(System.in);
		 * System.out.println("정수 입력>>");
		 * 
		 * int number = sc.nextInt();
		 * 
		 * for(int i=1; i<= number; i++){
		 * if(i%2 ==1)  //홀수 이니?
		 * sum +=i;
		 * 
		 * system.out.println(sum);
		 * Sum = 0;
		 * 
		 *또는 
		 * for(int i=1; i<= number; i=i+2){
		 * 	sum +=i;
		 * 
		 * 
		 * System.out.println(sum);
		 */
	}
	
	

}
