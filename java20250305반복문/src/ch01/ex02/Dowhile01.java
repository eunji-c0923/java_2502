package ch01.ex02;

public class Dowhile01 {

	public static void main(String[] args) {

		
		int sum=0;
		for(int i=1000; i<=100; i++)  //i값이 1000 값이 크기 때문에 실행 자체가 되지 않고 넘어감
			sum += i;
		System.out.println(sum);
		
		
		int sum2 =0;
		int i=1000;
		while(i<=100) {
			sum2 += i;
			i++;
			
		}

	    System.out.println(sum2);
	    
	    //do~while
	    
	    int sum3=0;
	    int j=1000;   //초기값
	    do {
	    	j++;   //증가,변동값
	    	sum3 +=j;
	    }while(j<100);   //조건
	    System.out.println(sum3);
	    }
	
	}
	


