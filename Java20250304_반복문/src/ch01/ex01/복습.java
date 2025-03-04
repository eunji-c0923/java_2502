package ch01.ex01;

public class 복습 {

	public static void main(String[] args) {

//     자료형 변수  =값(초기값)		
		int num = 0;
		int num2 = 0;
		int num3 = 0;
	
		
		num = num + 1;   //num(1)넘버가 1이 들어갈 수 있다
 		num += 1; //num(2) 넘버에 2가 들어 갈 수 있다.(증가)
 		
 		num2 = ++num;  //전위연산자(증감) num(3) 
 		
 		num3 = num++;  //후위연산자(증감)  num(4)
 		
 		
 		System.out.printf("%d %d %d\n", num, num2, num3);
 		
 		
 		
 		
 		
	}

}
