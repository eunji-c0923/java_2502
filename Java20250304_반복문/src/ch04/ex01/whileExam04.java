package ch04.ex01;

public class whileExam04 {

	public static void main(String[] args) {

		
		/*
		 * 구구단 출력
		 * for (int i=2; i<=9; i++) {
		 * System.out.printf("*****%d단*****\n,i)
		 * 
		 */
	  }
	
	
	        int i=2;
	        int j=1;
			
			while(i<=9) {
				
				j=1;
				System.out.printf("*****%d단*****\n", i);
				while(j<=9) {
					System.out.printf("%dx%d=%d\n",i, j, i*j);
					j++;
					
				}
	
				System.out.println();
	            
				i++;
			
			}

}
//   public class whileExam05 { 새폴더 만들어서붙여넣기

           int count=0;
           for(; ; count++) {
        	   if(count>100) break;
        	   
        	   System.out.println(count);
           }

//-----------------------------------------------
           //일반적인 형태임

           
           int cut=0;
           
           while(true) {
        	   cnt++;
        	   if(cnt>100)break;
        	   System.out.println(cnt);
           }
           
           }