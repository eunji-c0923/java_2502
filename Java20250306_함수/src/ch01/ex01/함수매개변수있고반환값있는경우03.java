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


public class 함수매개변수있고반환값있는경우03 {

	public static void main(String[] args) {  //main이 진입점

//		sum(100);  //함수호출
		int result=sum(10,20);  //sum(인자값); 
		System.out.println(result); //출려값
		System.out.println("프로그램 종료!!");
				
		}
		
		//함수정의
//		public static void sum(int num) {  //값 전달이 없음  //sum은 임의로 정해도 상관없음
    	public static int sum(int n1, int n2) {		//2개 정수 입력 받아서 출력  
	//코드구현
			System.out.println("void sum(int n1, int n2) 함수 호출!!");

            return n1+n2;  //리턴은 값을 반환한다.(n1+n2-> 정수값)  
            
            //int , int , n1+n2 세개의 타입이 일치해야 한다.

           

	}

}
