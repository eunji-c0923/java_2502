package ex01;

public class Exam01 {

	public static void main(String[] args) {

		
		String name="자바"; //이러면 오류가 생긴다!
		
		System.out.println(name);

		System.out.println(name.length());

		System.out.println("======================");
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	
		System.out.println("======================");
		
		String old1 ="자바 프로그래밍"; //원본, 원본은 그대로 있고 밑에 복사본에서 변경이 되어 출력된다.
		String new2 = old1.replace("자바","JAVA"); //자바를 JAVA로 변경
		
		System.out.println(new2);
		System.out.println(old1);
		
		System.out.println("======================");
		
		String str = "koerakoera";
		
		System.out.println(str.indexOf('r')); //첫번째부터 찾아줌
		System.out.println(str.lastIndexOf('r')); //뒤에서부터 찾아줌
		
		String board = "번호,제목,내용,성명"; 
		String[] board1 = board.split(",");
		System.out.println(board1[0]);
		System.out.println(board1[1]);
		System.out.println(board1[2]);		
		System.out.println(board1[3]);
		
		System.out.println("=========객체를 참조하는 배열");
		
		String[] strArray = new String[5];
		strArray[0]= "JAVA";
		strArray[1]= "JAVA";
		strArray[2]= "JAVA";
		strArray[3]= "먀미";
		strArray[4]= new String("먀미");
		
		System.out.println(strArray[0] == strArray[1]); //true:같은 객체참조
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0] == strArray[3]); //false:다른 객체를 참조
		System.out.println(strArray[0] == strArray[4]); //false:다른 객체를 참조
		System.out.println(strArray[0].equals(strArray[2])); //true:문자열이 동일
		
	 	
		
		
	}

}
