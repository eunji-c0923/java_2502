package ch01.ex01;

public class 난수발생 {

	public static void main(String[] args) {

		
		System.out.println(Math.random() ); //0~1사이 난수
		
		System.out.println( (int)(Math.random() *5)); //0~5 사이 난수		
		
		System.out.println( (int)(Math.random() *6)+1 ); //1~6사이 난수
		
		System.out.println( (int)(Math.random() *45)+1 );
		//저 식은 이제 로또 당첨 번호를 뽑아줄거야 깔깔
		
		System.out.println(Math.PI); //원주율
		System.out.println(Math.abs((-1))); //절대값
		System.out.println(Math.sqrt(4));  //루트값
		System.out.println(Math.sqrt(9));  //루트값
		//Math. -> 수학식이라고 보면됨
		
		System.out.println(Math.floor(12.91)); //소수점 이하 절삭
		
		System.out.println(Math.max(10, 4));
		
		
		
	
	
	
	
	
	
	}

}
