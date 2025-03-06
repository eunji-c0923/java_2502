package ch01.ex03;

public class 함수오버르딩 {

	public static void main(String[] args) {
		functionA();
		
		public static void functionA() {
			System.out.println("functionA()");
		}
		
		public static void functionA(int n) {
			System.out.println("void functionA(int n)");
		}//정수1
		
		public static void functionA(double n) {
			System.out.println("void functionA(double n)");
		}//실수1
		
		public static void functionA(int n1, int n2) {
			System.out.println("void functionA(int n1, int n2)");
		}//정수2
	}

}
