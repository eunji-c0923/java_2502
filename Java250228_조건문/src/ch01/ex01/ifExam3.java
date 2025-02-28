package ch01.ex01;

public class ifExam3 {

	public static void main(String[] args) {

		
		//String result = (korScore >= 80)? "상" :
		// (korScore >= 60) ? "중 : "하";
		
		
	
	     int kor= 80;
	     
	     
	     if(kor >=80) {
	    	 System.out.println("상");
	     }else {
	    	 if(korScore >= 60) {
	    		 System.out.println("중");
	    	 }else {
		    	 System.out.println("하");
	     }
	     }
	     
	    System.out.println("종료");
	}
	

}
