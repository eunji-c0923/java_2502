package ch01.ex01;

import java.util.Random;

public class 정렬02 {

	public static void main(String[] args) {

        //seed값을 넣어주면 랜덤 숫자가 일정하게 나온다  
//		int seed = 12345;  
//		Random random = new Random(seed);
		Random random = new Random();
		
		//seed 값이 없으면 랜덤하게 추출
		int[] numArr = new int[5];
		int tmp; 
		
	//랜덤하게 1~100사이 값을 배열에 넣는다..
		
		for(int i=0; i<5; i++ ) {  //for(int i=0; i<numArr.length; i++) { 로도 사용 할 수 있다. 다만,i값을 똑같이 변경해 줘야 한다
			tmp = (int)random.nextInt(100) +1;
				
			numArr [i] = tmp;
		}
		
		//랜덤하게 배열 저장된 값 출력
		 for(int i=0; i<5; i++)
			 System.out.print(numArr[i] + " ");
		 
		
		 //최대값, 최소값 출력
		 int max, min;
		 max = numArr[0];
		 min = numArr[0];
		 for(int i=1; i<5; i++) {
			 
			 if(max < numArr[i])     //최대값
				 max = numArr[i];
			 
			 if(min > numArr[i])      //최소값
				 min = numArr[i];
		 }
		 System.out.println(); 
		System.out.println("최대값: " +max + "최소값: "+ min); 
		  
		 
		System.out.println();
		//총점 , 평균
		
		int sum=0;
		double avg =0;
		

		for(int i=0; i<5; i++) {
			sum += numArr[i]; }  //문제가 하나면 이것만 넣어도 된다
			avg = sum/10.0;   //정수/정수 -> 정수, 정수/실수-> 실수
		
		
		System.out.printf("총점 : %d, 평균,:%.2f\n", sum , avg);
		
		
		System.out.println();	
		//정렬~(버블정렬)  >>>>>꼭 외우기
		
		
		int temp;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-1; j++) { //	for(int j=0; j<10-1-i; j++) { 이렇게도 가능 반복 횟수가 줄어든다 
//		    for(int j=0; j=numArr.length-1-i; j++) {  로도 대체가능
				if(numArr[j]> numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
			
		}
		for(int i=0; i<5; i++)
			System.out.print(numArr[i] + " "); 
		
		
		
		
		
		}
		
		
	}




