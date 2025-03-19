package ex01;

import java.util.Scanner;

public class ExceptionExam02 {

	public static void main(String[]arge) {
		
		
		int[] arr = new int[5];  //0~4까지 범위인데 아래 식은 0~4값을 넘어서 오류가 생김
		arr[4] = 100;
//		arr[5] = 10;
		
		String str = null; 
        
	 if(str != null)	
		System.out.println(str.length());
		
	 String str2 = "Korea"; 
     
	 if(str2 != null)	
		System.out.println(str2.length());
		
	}
}
