package ch01.ex01;


/*
 * 반환0, 매개변수0
 * 
 */
public class Function2 {

	public static void main(String[] args) {

	 //객체 생성하지 않고 메소드 호출하기 위해서
		
		int num1 = 10;
		int num2 = 20;
		
		int result =add(num1, num2);
		
		System.out.println("result=" + result);
		
	
	}

	
	static int add(int n1, int n2) {   //static 앞에 붙여주기
		return n1+n2;
	}
}
