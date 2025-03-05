package ch04.ex01;

public class whileExam3 {

	public static void main(String[] args) {

		
		 int count=0;
         for(; ; count++) {
      	   if(count>100) break;
      	   
      	   System.out.println(count);
         }

//-----------------------------------------------
         //일반적인 형태임

         
         int cut=0;
         
         while(true) {
      	   cut++;
      	   if(cut>100)break;
      	   System.out.println(cut);
         }
         
         }


 
}
