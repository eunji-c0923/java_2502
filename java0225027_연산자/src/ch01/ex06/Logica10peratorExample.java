package ch01.ex06;

public class Logica10peratorExample {

	public static void main(String[] args) {


		int score = 70;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "합격" + grade + "불합격.");
		
		int score = 65;
		char grade = (score > 70) ? 'A' : ( (score > 60) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		
	//숫자만 바꿨는데 오류가 뜸.....물어봐야지
		
		
		
	
	}
	
	

}
