package ch01.ex01;

import java.util.Scanner;

public class 복습6 {

	public static void main(String[] args) { //함수 메인!


		/*
		 * 1~5까지 합을 구하겠다!
		 */
 		//지역변수
		int num = 0;  //함수
		int num2 =0;
		
		{
			int num3 =0; //블럭변수는 블럭안에서만 사용할 수 있다.
			num++;
			num2++;
			System.out.println(num3);  //블럭을 벗어나는 순간 생성 될 수 없다.
		}
		
		System.out.println(num3);
	
	} //넘버값을 여기까지 사용할 수 있다.
	
      public static void func() {	//함수 func
    	  int num =0;
      }

}
