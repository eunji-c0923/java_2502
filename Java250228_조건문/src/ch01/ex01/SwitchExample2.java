package ch01.ex01;

public class SwitchExample2 {

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
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
		    break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			
			System.out.println("종료");
			
			
			//응용해서 이렇게 쓸 수도 있음
		}
	}

}
