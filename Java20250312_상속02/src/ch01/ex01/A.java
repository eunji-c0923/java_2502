package ch01.ex01;

public class A {
	private String name;
	
	A(String name) {
		this.name = name;
	}

   A(){}
   void funcA() {
	System.out.println("funcA()");
}
}
	class B  extends A {
		private String address;
		
		B(){}
		B(String n2, String adderss) {
			super(n2);
			this.address = adderss;
		}


		void funcB() {
			System.out.println("funcB()");
			
	}
	}
	class C extends B {
		private int age;
		
	C(){}			
	C(String n, String a, int age){
	    super(n, a);
	    this.age = age;
	}
	void funcC() {
		System.out.println("funcC()");
	
	}
	}
	

