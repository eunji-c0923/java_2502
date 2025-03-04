package ch01.ex01;

import java.util.Scanner;

public class 복습5 {

	public static void main(String[] args) {

		//     객체     참조변수
       Scanner sc = new Scanner(System.in);
       System.out.println("정수입력>>");
       int number = sc.nextInt();
       
       //삼항연산자(조건연산자)
       // (조건판단) ? 참:거짓 ;
      //   String msg = (number>0) ? "양수" : "음수";
    
       boolean check = false;
       
       String msg = "";
       if(number >0) 
    	   msg = "양수";
    	   
       else 
    	   msg = "음수";
       
       //문장이 하나 일땐 중괄호 없애거나 쓰기도 하며, 문장이 하나 이상일땐 중괄호 무조건 기입
       
       System.out.println(msg);
    	   
    	   
 		
 		
 		
	}

}
