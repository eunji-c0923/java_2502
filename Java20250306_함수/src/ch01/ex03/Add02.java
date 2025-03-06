package ch01.ex03;
/*
 * 2개 갑을 입력 받아서, 더하는 기능을 수행
 * 매개변수0 , 반환x
 * 
 */


public class Add02 {

	public static void main(String[] args) {

		
		//TODO Auto -generated method stub
		
		System.out.println("min함수 시작");
		int num1 =(int) (Math.random()*100) +1;
    	int num2 =(int) (Math.random()*100) +1;
		
		
		add(num1, num2);
		
				
		
		System.out.println("프로그램 종료");
		
		}
	
    public static void add(int numA, int numB) {
    	   	
    	System.out.println("add() 시작");
    	
    	System.out.println(numA + " + " + numB + " = " + ( numA+numB) );
    	
    	
	}

}
