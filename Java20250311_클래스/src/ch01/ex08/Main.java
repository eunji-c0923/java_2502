package ch01.ex08;

public class Main {

	public static void main(String[] args) {

		A aa = new A();
		
        B bb =new B();
        
        B b2 = new B("먀미",1, "아스테룸");
        b2.funcA();
        b2.funcB(); 
        b2.info();
       
        System.out.println();
        b2.infoB();
	
	}

}


