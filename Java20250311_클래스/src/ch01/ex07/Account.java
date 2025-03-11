package ch01.ex07;

public class Account {


	int balance;
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	private static Account ac = new Account();
//외부에서 접근할 수없게 함          //2번---------
	
		private Account() {	
		//1번--
	}
	
	static Account getInstance() {
//3번----- 싱글톤 패턴		
		return ac;
	}
	
    void setBalance(int balance) {
    	if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
    	this.balance = balance;
    	  	  
      }
      
    int getbalance() {
    	return balance;
    }
     
}

