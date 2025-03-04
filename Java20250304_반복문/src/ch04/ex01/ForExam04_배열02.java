package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열02 {

	public static void main(String[] args) {

	/*
	 * 5명의 점수를 입력 받아서, 총점 평균을 구하기(배열타입)
	 * 배열 타입을 쓰게 된다면 for 문을 같이 써주면 간략해 진다
	 */
	
	
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];   //배열선언, int배열 5개가 있다고 말하고 있음
		
		
		System.out.println("1번학생 자바 점수:");
		
		int numA;
		num[0] = sc.nextInt();    //0부터 시작
		
		System.out.println("2번학생 자바 점수:");
		num[1] = sc.nextInt();
		
		System.out.println("3번학생 자바 점수:");
		num[2] = sc.nextInt();
		
		System.out.println("4번학생 자바 점수:");
		num[3] = sc.nextInt();
		
		System.out.println("5번학생 자바 점수:");
		num[4] = sc.nextInt();
		
	    int sum = num[0] + num[1] + num[2] + num[3] + num[4];
	    
	    double average = sum/5.0;
	    System.out.printf("총점 : %d, 평균:%.2f\n", sum , average);
	}

}
