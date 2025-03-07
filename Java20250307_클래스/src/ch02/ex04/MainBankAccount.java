package ch02.ex04;

public class MainBankAccount {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("유하민", 10000);
		
		b1.deposit(10000);
		b1.withdraw(100000);  //잔액부족으로 처리가 안됨
		b1.withdraw(2000);
		
		System.out.println(b1.getBalance());
	}

}
