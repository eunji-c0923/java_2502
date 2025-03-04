package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열07 {

	public static void main(String[] args) {

	
	    
	  //	   { -1, -3, -700, 1, 2, 9, 3 }
//	   키보드 : 1입력하면, 출력 : 1값은 4번째 위치입니다.
//	   키보드 : -3 입력하면, 출력 : -3값은 2번째 위치입니다.
	   
//	   반복문, 조건문 이용
	 
		
		Scanner sc = new Scanner(System.in);
	   int[] student = new int[]  { -1, -3, -700, 1, 2, 9, 3 };   
	   int index = -1;	   System.out.println("찾을 숫자를 입력 : ");
	   int numA = sc.nextInt();
	  
	   for(int i=0; i<7; i++ ) {
		   if(numA == student[i]) {
			   index = i;
		   }
	   }
			 if(index == -1)  //0~6번까지 있는지 물어보는 식
			   System.out.printf(" %d값은 %d번째 위치입니다.\n ", numA, index+1);
			 else
			   System.out.printf(" %d값은 찾을 수 없습니다.\n ", numA);
		
	   
	  System.out.println("-----------------------------------------");
	  /*
	   * {10,-3 , -700 ,1, 2, 9, 3}
	   * 
	   * 정렬해서(sort)  출력하기.......{-700,-3, 1,2,3,9,10}
	   */
	  
	  
	  
	  
	  
	}

}
