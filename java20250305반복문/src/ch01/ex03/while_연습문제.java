package ch01.ex03;

import java.util.Scanner;

public class while_연습문제 {

	public static void main(String[] args) {

		/*while 문과 scanner의 nextLine() 메소드를 이용해서 다음 실행 결과와
		 * 같이 키보드로 입력된 데이터로 예금 출금 조회 종료 기능을 제공하는 코드를 작성하시오.
		 *
		 * 예금액 10000 / 출금액 2000 / 잔고 8000 / 종료
		 */
		
		
				
		Scanner sc = new Scanner(System.in);
	 
		int balance = 0;  //잔고
		
		while(true ) {
		  
	 
		System.out.println("============================= ");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료" );
		System.out.println("============================= ");
		
		System.out.println("선택: "); //문자열을 정수형으로 변환
		
		int num =Integer.parseInt(sc.nextLine());
		
		switch(num) {
			case 1:
				System.out.println("예금액: ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("출금액: ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.println("잔고: ");
				System.out.println(balance);
			case 4:
				break;
		
		}
		sc.nextLine();  //버퍼(엔터키) 지우기
		
		
		}
		System.out.println("프로그램 종료 ");

	}

}
