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


public class 함수매개변수없고반환값없는경우 {

	public static void main(String[] args) {  //main이 진입점

//		sum(100);  //함수호출
		sum(10,20);  
		System.out.println("프로그램 종료!!");
				
		}
		
		//함수정의
//		public static void sum(int num) {  //값 전달이 없음  //sum은 임의로 정해도 상관없음
    	public static void sum(int num, int num2) {		//함수호출(sum)값에서는 순서대로 정렬해야 함
	//코드구현
			System.out.println("void sum() 함수 호출!!");
			System.out.println(num+num2);

	}

}
