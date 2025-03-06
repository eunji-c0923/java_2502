package ch01.ex03;
/*
 * 2개 갑을 입력 받아서, 더하는 기능을 수행
 * 매개변수0 , 반환0
 * 
 */


public class Add04 {

	public static void main(String[] args) {

		
		//TODO Auto -generated method stub
		
		System.out.println("min함수 시작");
		
		int num1 =(int) (Math.random()*100) +1;
    	int num2 =(int) (Math.random()*100) +1;
    	 	
    	int result = add(num1 ,num2);  //add();를 매개변수로 옯겨주기  
		System.out.println(result);
    	
		System.out.println("프로그램 종료");
		
		}
	
    public static int add(int numA, int numB) { //add(num1 ,num2 타입이 일치해야함
    	   	
    	System.out.println("add() 시작");
    			
    	System.out.println("num1= " + numA +",num2= " +numB);
        
    	int sum = numA + numB;
        return sum; //리턴으느 한개 값만 전달 가능
    	
	}

}
