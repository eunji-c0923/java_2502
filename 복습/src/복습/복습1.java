package 복습;

public class 복습1 {

	public static void main(String[] args) {

	/*	int //실수는 안됨 정수만!
		
		// 배열01
		int[] num =new int[5]; //배열 선언,int 배열이 5개 있다 //인덱스..첨자....
		int[] student = new int[] {10,20,30,40,50,60,70}; //값이 미리 지정되어 있게 됨 단, new int[]에는 값을 넣으면 안됨
		
		//최대값, 최소값
		
		int max = student[0];  //변수 초기값 변경 가능
		int min = student[0];
		for(int i=0, i<7;, i++) {  //0~6까지 돌려돌려~~~
			//기본값 50과 비교해서 더 큰 숫자를 max값으로 채택?
		}
		
	  */
		
		int[] num = new int[10];
		
		//빈 배열 1~100사이 랜덤하게 저장
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
 
		//배열값 출력
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + " ");
		
		System.out.println();
		
		//총점/평균 구하기
		
		int sum=0;
		double avg =0;
		for(int i=0; i<num.length; i++)
			sum += num[i];
		
		avg =sum / num.length;  //정수 vs 정수  나누면 소수점 나머지 두자리는 버려버림 그래서 하나는 실수로 만들어 줘야함!(double) sum 앞에 붙여주기!
		System.out.println("총점: "+ sum + ", 평균: " +avg);  
	
	//최대, 최소값 구하기
		
		int max = num[0];
		int min = num[0];
		for(int i=0; i<num.length; i++) {
			if(max<num[i])
				max=num[i];
			
			if(min > num[i])
				min = num[i];
					
		}
	System.out.println("최대: "+ max + ", 최소: " + min);
	
	
	}
	
}
