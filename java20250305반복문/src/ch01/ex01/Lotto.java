package ch01.ex01;

public class Lotto {

	public static void main(String[] args) {

		
		/*
		 * 로또 프로그램
		 * 배열 : int혈 배열 6칸
		 * 로또는 1~45 랜덤하게 저장
		 * 단,중복불가
		 * 		 */
		
	int[] numArr = new int[6];
	int tmp;
	
	for(int i=0; i<6; i++) {
		tmp = (int)(Math.random()*45) +1;
		numArr [i] = tmp;
		
			}
	
	   for(int i=0; i<6; i++)
		   System.out.print(numArr[i] + " ");
	
	
	}
	

}
//정답
   /*
    * int[] lotto = new int[6];
    * for(int i=0; i<lotto.length; i++) {
    * lotto[i] = (int)(Math.randon()*45)+1;
    *(중복 체크 과정 필요)
    * 
    * for(int j=0; j<500; j++) {  /500번 섞겠다는 의미
    * int index = Math.random()*45)+1;  /1~45
    * if(temp == lotto[j])
    * flag = true;
    * break;
    * 
    * }
    * if(flag != ture)   /중복되지 않았을때 처리
    * lotto[i] = temp;
    * else {            /중복된 경우에 처리
    *     i--;          /i값 하나 감소,
    *     fige = false;   /중복된 경우 true값으로 변경된 값을 원 상태로 변경(false)
    * }
    * }
    * }(배열45개 칸 중 앞자리 6자리만 출력
    * for(int i=0, i<lotto.length; i++)
    * System.outprint(lotto[i] + " ");
    * 
