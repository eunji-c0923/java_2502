package ch01.ex01;

import java.util.Scanner;

public class qjtmdyrma {

	public static void main(String[] args) {

		
		/*
		 * 버스요금 계산 프로그램
		 * 기본요금 : 2000
		 * 1~5세 : 무료
		 * 6~12세 : 50% 할인
		 * 13~18세 : 25% 할인
		 * 19~64세 : 0% 할인
		 * 65세 이상 : 무료
		 */
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("나이");
		 int fare = sc.nextInt();
		
		if(fare <= 5) {
			System.out.println("무료");
		}else if(fare <= 12 ) {
			System.out.println("50%할인");
		}else if(fare <= 18 ) {
			System.out.println("25%할인");
		}else if(fare <= 64) {
			System.out.println("0%할인");
		}else if(fare <= 65) {
			System.out.println("무료");
			
		}
 
			sc.nextLine();	
			
		System.out.println("종료");
		}
	 
	   
	}
	

/* 선생님 정답풀이
 * 
 * scanner sc = new scanner(System.in);
 * int age = 0;
 * double fee = 2000;  (버스요금)
 * double rate   (할인률)
 * 
 * System.out.println("나이입력:");
 * age = sc.nextInt();
 * 
 * if(age>=65 || age <=5) {
 *   rate =0;
 *   }else if(age <=6 && age<=12) {
 *      rate=0.5;
 *   }else if(age <=13 && age<=18) {
 *      rate=0.5;
 *        }else if(age <=19 && age<=64) {
 *        rate=0.75;
 *           }else if(age <=6 && age<=12) {
 *           rate=1;   
 *      }
 *      
 *              
 *      fee = fee * rate; 
 *    ( System.out.println("버스요금 : " + fee + "원 입니다."); )
 *       System.out.println("버스요금%.0f원 입니다.\n" , fee);
 *      
 *      
 *      System.out.println("종료");
 *      
 *    이렇게도 할 수 있다~~
 */

