package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05 {

	public static void main(String[] args) {

	/*
	 * 7명 학생 점수 입력 받아서 ,총점, 평균 구하기
	 * (더 간략하게 하는법)
	 */
	
	 int max=0; //변수 초기값 변경 가능
	 int min=35;
	 
		Scanner sc = new Scanner(System.in);
		//예시 >>  int num=0;
		int[] student = new int[] {99,88,77,33,44,100,80,50};   
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<7; i++) {
			sum += student[i];
		}
				    
	    average = sum/7.0;
	    
	    System.out.printf("총점 : %d, 평균:%.2f\n", sum , average);
	    System.out.println("7번째 값 출력 : " +student[6]);

	    System.out.println("-----------------------------------");
	    //숙제// 최대값 최소값 구하기
	    //모르게써어어어
	    
	    /*
	     * 정답
	     * max = student[0];
	     * for(int i=0; i<7; i++) {
	     *   if(max < student[i])  //맥스와 i값은 0이 들어가 있음>i값을 1씩 7번 반복 증식>맥스의 값을 99로 바꿔줌>i값이 1 증식...뭔소리지....?
	     *      max = student[i];
	     *      -max = student [0]; //{99,88,-1,33,100,80,50} 
	     * 최소값 구하기
	     *   if(min > student[i])  // 잘못됨 수식 왜 잘못된건지 알아보자
	     *      min = student[i];  min=100 , i=0이 들어가 있음 > i=2로 증식,min=88 로 감소, 7번 반복
	     *      //min = student[0];
	     *         
	     *     
	     *      
	     *      }  
	     */
	    
	    System.out.println("최대값 : " + max);  //99
	    System.out.println("최소값 : " + min);  //33
	
	
	       max = student[0];
	       for(int i=0; i<7; i++) {
	    	   if(max < student[i])
	    		   max = student[i];
	    		   
	    		   if(min > student[i])
	    			   min = student[i];
	    	   
	       }
	    
	   
	  
	}

}
