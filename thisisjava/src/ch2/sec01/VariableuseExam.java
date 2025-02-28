package ch2.sec01;

public class VariableuseExam {

	public static void main(String[] args) {
		
		
		/*
		 * 변수명작성
		 * 영문자, 숫자,_-> 단, 숫자가 맨 앞에 올 수는 없다
		 * 변수명은 소문자로 기입한다
		 * 변수명 첫글자는 소문자로 기입한다
		 */

		//국어점수 -> korscore >>
		//국어점수 -> korScore (카멜표시법) >>두개 단어가 조합시 뒤에 대문자를 넣어준다
		//국어점수 -> kor_score(스네이크표시법) >>두개 단어가 조합시 가운데에 언더바를 넣는다
		
		
		final double PI = 3.14159;
		
		//변수명(PI)이 대문자로 있을 경우는 바꾸지 말라는 의미(상수화)
		//final을 앞에 뿥이면 시스템 상으로도 변경이 안됨
		
		
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour +"시간 "+ minute + "분");
		
		int totalMinute = (hour*60) + minute;
		
		System.out.println("총 " + totalMinute + "분");
      
	}

}
