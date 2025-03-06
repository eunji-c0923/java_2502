package ch01.ex01;

/* 
 * 이름,나이,국어,영어,수학 점수 입력 ->정적 >변수
 * 공부하기, 시험보기, 등교하기      ->동적 >함수
 */

public class 클래스도입 {

	public static void main(String[] args) {

		String name ="하밍";
		String phone = "010-1101-1101";
		int ang, kor, eng, math;
		age=20;
		kor=90;
		eng=80;
		math=77;
		
		공부하기(name);
		시험보기(kor, eng, math);
		등교하기(name);
	System.out.println("===========================");	
		String name2 ="예준";
		String phone2 = "010-0912-0912";
		int ang2, kor2, eng2, math2;
		age2=56;
		kor2=98;
		eng2=60;
		math2=45;
		
    	공부하기(name);
		시험보기(kor, eng, math);
		등교하기(name);
		
	}
		public static void 공부하기(String name) {
			System.out.println( name+ "공부하기");
		}
			public static void 시험보기(int kor, int eng, int math) {
				int sum = kor +eng + math;
				System.out.println("새 과목 합: " + sum);
			}		
				public static void 등교하기(String name) {
					System.out.println(name + "공부하기");
					
					
				}
			}
		
		
	


