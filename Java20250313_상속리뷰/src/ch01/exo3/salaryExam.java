package ch01.exo3;

import java.util.Scanner;

public class salaryExam {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("월 입력: ");
	 int month = sc.nextInt();
	 
	 System.out.println("등급(1~4) 입력: ");
	 int grade = sc.nextInt();
	 int salary = 0;
	 if(month % 2 == 0) {
	
		 
		 salaryExpr expr = new salaryExpr(100);
	     salary = expr .getsalary(grade);
	}else {
		
	}
	 System.out.println(month + "월 "+ grade+ "등급의 월급은" + salary+"입니다.");
	   
	}

}
//홀수월도 구해야함 깃 활용 