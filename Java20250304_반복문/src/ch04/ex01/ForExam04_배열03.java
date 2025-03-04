package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열03 {

	public static void main(String[] args) {

	/*
	 * 7명 학생 점수 입력 받아서 ,총점, 평균 구하기
	 */
	
	
		Scanner sc = new Scanner(System.in);
		int[] student = new int[7];   //배열선언, int배열 5개가 있다고 말하고 있음
		
		 int sum = 0;
		
		for(int i=0; i<7; i++) {
			System.out.println(i+1 + "번 학생 자바점수: ");
			student[i] = sc.nextInt();
			sum += student[i];
		}
				    
	    double average = sum/7.0;
	    
	    System.out.printf("총점 : %d, 평균:%.2f\n", sum , average);
	
	
	
	
	}

}
