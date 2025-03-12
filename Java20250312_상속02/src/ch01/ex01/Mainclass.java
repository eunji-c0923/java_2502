package ch01.ex01;

/*
 * 상속 젠체 조선
 * 하위클래스는 상위클래스 자원 접근 가능(private 제외)
 * 상위클래스는 하위 클래스 접근 불가
 */
public class Mainclass {

	public static void main(String[] args) {

		C c1 = new C("몌무", "아스테룸" , 1);
		c1.funcC();
		c1.funcB();
		c1.funcA();
		
		B b1 = new B("뫄", "파리");
	     b1.funcA();
	     b1.funcB();
	     
	    A a1 = new A("미므");
	     a1.funcA();
	System.out.println("========자동 타입 변환========");
	/*
	 * 상위 클래스는 하위 클래스를 참조할 수 있다.
	 * 단, 하위클래스 자원에는 접근이 불가하다.
	 * 자신 클래스에만 접근이 가능
	 */
	
/*	B b2 = new B("므모", "짜장!");
	A a2 = (A)b2;
	이렇게 간단하게도 작성이 가능하다
	*/
	A a2 = new B("먀미", "칭찬감옥");
	a2.funcA();
//	a2.funcB();  이렇게는 안된다~~
	
	A a3 = new C ("므모","짜장", 1);
	
	
	System.out.println("========강제 타입 변환========");
	/*
	 * int a=10;
	 * double d =1.2;
	 * d= (double)a; //10.0 자동타입변환
	 * a = (int)d; //강제타입변환1
	 */
	
	/*
	 * 강제타입 변환이 안되는 경우
	 * A a5 = new A();
	   B b3 = new B();
	   b3 = (B)a5;
	 */
	
	A a6 = new B();
	B b4 = new B();
	b4 = (B)a6;
	//첫번째 문제
	A a7 = new C();
	B b5;
	b5 = (B)a7; //ok...
	b5.funcA();
	b5.funcB();
	
	//두번째 문제
	A a8 = new C();
	C c2;
	c2 = (C)a8; //ok,,,,
	
	//세번째 문제
	A a10 = new A();
	B b6 = new B();
	
	a10 = b6;
	B b7 = (B)a10; //ok dok~
	b7.funcA();
	b7.funcB();
	
	
	}

}
