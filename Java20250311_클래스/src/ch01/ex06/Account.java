package ch01.ex06;

public class Account {


	int balance;
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
    void setBalance(int balance) {
    	if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
    	this.balance = balance;
    	  	  
      }
      
    int getbalance() {
    	return balance;
    }
     
}

