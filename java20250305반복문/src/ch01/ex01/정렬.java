package ch01.ex01;

public class 정렬 {

	public static void main(String[] args) {

		
		int[] numArr = new int[10];
		int tmp;
		
	//랜덤하게 1~100사이 값을 배열에 넣는다..
		
		for(int i=0; i<10; i++ ) {
			tmp = (int)(Math.random()*100) +1;
			numArr [i] = tmp;
		}
		
		//랜덤하게 배열 저장된 값 출력
		 for(int i=0; i<10; i++)
			 System.out.print(numArr[i] + " ");
		 
		
	}

}
