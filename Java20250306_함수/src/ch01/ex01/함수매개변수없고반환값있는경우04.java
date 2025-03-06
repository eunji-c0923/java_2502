package ch01.ex01;
	

/*
		 *=========함수============ 
		 *입력(매개변수)    출력(반환값)
		 *   0               0
		 *   0               x
		 *   x               0
		 *   x               x
		 * 
		 * 함수정의 -> 함수 만드는 것
		 * 함수호출 -> 만든 함수를 실핼하는 것
		 */


public class 함수매개변수없고반환값있는경우04 {

	public static void main(String[] args) {  //main이 진입점

//		sum(100);  //함수호출
		double result= sum();//이코드 실행하면 결과는 double result = 3.14159;
		System.out.println(result); //출려값
		System.out.println("프로그램 종료!!");
				
		}
		
		//함수정의
    	public static double sum() {		//2개 정수 입력 받아서 출력  
	//코드구현
			System.out.println("int sum() 함수 호출!!");
             double pi =3.14159;
            return pi;  //리턴은 값을 반환한다.(n1+n2-> 정수값)  
            

	}

}
