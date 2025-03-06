package ch01.ex03;
/*
 * 2개 갑을 입력 받아서, 더하는 기능을 수행
 * 매개변수x , 반환0
 * 
 */


public class Add03 {

	public static void main(String[] args) {

		
		//TODO Auto -generated method stub
		
		System.out.println("min함수 시작");
		
		
		int result = add();
		System.out.println(result);
		
		
		
		System.out.println("프로그램 종료");
		
		}
	
    public static int add() {
    	   	
    	System.out.println("add() 시작");
    	int num1 =(int) (Math.random()*100) +1;
    	int num2 =(int) (Math.random()*100) +1;
		System.out.println("num1= " + num1 +",num2= " +num2);
        int sum = num1 + num2;
        return sum;
    	
	}

}
