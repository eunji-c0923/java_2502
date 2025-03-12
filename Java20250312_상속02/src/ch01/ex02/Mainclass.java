package ch01.ex02;

/*
 * 상속 전체조건
 * 하위 클래스는 상위클래스 자원 접근 가능(private제외)
 * 상위클래스는 하위클래스 접근 불가
 */

  public class Mainclass {
	  
	  public static void main(String[] args ) {
		  
		  A a1 = new A();
		  a1.test();
		  
		  B b1 = new B();
		  b1.test();
		  
		  C c1 = new C();
		  c1.test();
		  
		  System.out.println("=======다형성=======");
		  
		  A a2 = new C();
		  a2.test();
		  
		  A a3 = new B();
		  a3.test();
		  
		  B b2 = new C();
		  b2.test(); //오버라이딩이 있다는 가정 하에 b2 안에 C가 들어감
		  
		  

	}

}
  
