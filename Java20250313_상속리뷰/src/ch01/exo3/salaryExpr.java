package ch01.exo3;


public class salaryExpr {

	

       private int bonus;
       
       public salaryExpr() {
    	   this.bonus=0;
    	   
       }
	
       public salaryExpr(int bonus) {
    	   this.bonus=bonus;
    	       	   
       }
	
       int getBouns() {
    	   return bonus;
    	   
       }
	  
       int getsalary(int grade) {
    	   switch(grade) {
    		   case 1:
    			   bonus +=100;
    			
    		   case 2:
    			   bonus +=90;
    			   
    		   case 3:
    			   bonus +=80;
    			   
    		   case 4:
    			   bonus +=70;
    	   }
    	   return bonus;
       }
	 
	

	
	
}
