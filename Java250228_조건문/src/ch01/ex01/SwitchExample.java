package ch01.ex01;

public class SwitchExample {

	public static void main(String[] args) {

		/*학점
		 * 90 -> A
		 * 80 -> B
		 * 70 -> C
		 * 60 -> D
		 * 59이하 -> F
		 */
		
		
		int grade = 85;

		switch(grade/10) {
		case 10:
			System.out.println("A");
//			break;
		case 9:
			System.out.println("A");
//			break;
		case 8:
			System.out.println("B");
//			break;
		case 7:
			System.out.println("C");
		    //break;
		case 6:
			System.out.println("D");
			//break;
		default:
			System.out.println("F");
			
			System.out.println("종료");
			
			
			//기본
			//break는 꼭 들어가야함 안쓰면 그 순간 밑으로 쫘라락 값이 출력 될 수 있음
		}
	}

}
